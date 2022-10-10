package ch18.fileRead;

import java.io.FileInputStream;
import java.io.InputStream;

public class ReadExample2 {

	public static void main(String[] args) throws Exception {
		InputStream is = new FileInputStream("C:/Temp/test.txt");
		int readByteNo;
		byte[] readBytes = new byte[3];
		String data = "";
		while(true) {
			readByteNo = is.read(readBytes);
			if(readByteNo==-1)break;
			//데이터를 0,3 byte읽고 data에 넣는다.
			data+=new String(readBytes,0,readByteNo);
			//바이트 배열3칸에 인덱스 0부터 텍스트 파일에 있는 값을 집어 넣는다.
			//배열이3칸이니 3바이트고 utf-8에서 한글은 3바이트니 
			//배열 3칸에 한글자씩 한글이 들어간다.
			System.out.println(data);
		}
		is.close();
	}

}
