package ch18.File;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class FileOutputStreamExample {

	public static void main(String[] args) throws Exception{
		String originalFileName = "C:/Temp/a.png";
		String copyFileName = "C:/imsi/a.png";
		
		FileInputStream fis = new FileInputStream(originalFileName);
		FileOutputStream fos = new FileOutputStream(copyFileName);
		
		int readByteNo;
		byte[]readBytes = new byte[100];
		while((readByteNo = fis.read(readBytes))!=-1) {
			fos.write(readBytes,0,readByteNo);
		}
		fos.flush();
		fos.close();
		fis.close();
		System.out.println("복사가 되었습니다.");
	}

}
