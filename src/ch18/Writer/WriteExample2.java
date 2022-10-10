package ch18.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample2 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		System.out.println("data 수: "+data.length);
		writer.write(data);
		writer.flush();
		writer.close();
	}

}
