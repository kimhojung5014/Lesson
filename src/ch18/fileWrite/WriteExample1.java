package ch18.fileWrite;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class WriteExample1 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data1 = "ABC".getBytes();
		byte[] data2 = "안녕하세요".getBytes("euc-kr");
		for(int i=0;i<data1.length;i++) {
			os.write(data1[i]);
		}
		System.out.println(data1.length);
		os.flush();
		os.close();
	}

}
