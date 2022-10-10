package ch18.Writer;

import java.io.FileWriter;
import java.io.Writer;

public class WriteExample1 {

	public static void main(String[] args) throws Exception{
		Writer writer = new FileWriter("C:/Temp/test.txt");
		char[] data = "홍길동".toCharArray();
		System.out.println("data 수: "+data.length);
		for(int i=0;i<data.length;i++) {
			writer.write(data[i]);
			System.out.println();
			System.out.println("data 수: "+data.length);
		}
		writer.flush();
		writer.close();
	}

}
