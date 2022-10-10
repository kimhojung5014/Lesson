package ch18.Reader;

import java.io.FileReader;
import java.io.Reader;

public class ReadExample3 {

	public static void main(String[] args) throws Exception {
		Reader reader = new FileReader("C:/Temp/test.txt");
		int readCharNo;
		char[] cbuf = new char[1];
		String data = "";
		int i=0;
		while(true) {
			++i;
			readCharNo =reader.read(cbuf);
			if(readCharNo==-1)break;
			data += new String(cbuf,0,readCharNo);
			System.out.println(data);
		}
		System.out.println("읽은 수:"+i);
		reader.close();
	}

}
