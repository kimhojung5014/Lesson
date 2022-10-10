package ch18.File;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileExample {

	public static void main(String[] args) throws IOException {
		File dir = new File("C:/Temp/Dir");
		File file1 = new File("C:/Temp/file1.text");
		File file2 = new File("C:/Temp/file2.text");
		File file3 = new File("C:/Temp/file3.text");
		
		if(dir.exists()==false) dir.mkdirs();
		if(file1.exists()==false)file1.createNewFile();
		if(file2.exists()==false)file2.createNewFile();
		if(file3.exists()==false)file3.createNewFile();
	
		File temp = new File("C:/Temp");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		File[] contents = temp.listFiles();
		System.out.println("날짜\t\t시간\t형태\t 크기\t이름");
		System.out.println("--------------------------------------------");
		for(File file: contents) {
			System.out.println(sdf.format(new Date(file.lastModified())));
			if(file.isDirectory()) {
				System.out.println("\t<DIR>\t\t\t"+file.getName());
			}else {
				System.out.println("\t\t\t"+file.length()+"\t"+file.getName());
			}System.out.println();
		}
	}

}
