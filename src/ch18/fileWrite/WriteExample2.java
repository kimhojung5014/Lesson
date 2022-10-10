package ch18.fileWrite;

import java.io.FileOutputStream;
import java.io.OutputStream;


public class WriteExample2 {

	public static void main(String[] args) throws Exception {
		OutputStream os = new FileOutputStream("C:/Temp/test.txt");
		byte[] data = "안녕하세요".getBytes();
		os.write(data,0,6);
		os.flush();
		os.close();
	}

}
