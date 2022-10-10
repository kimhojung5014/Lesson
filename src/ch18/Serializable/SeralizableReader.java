package ch18.Serializable;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SeralizableReader {

	public static void main(String[] args) throws Exception{
		
		FileInputStream fis = new FileInputStream("C:/Temp/Object.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		ClassA v = (ClassA)ois.readObject();
		System.out.println(v.field1);
		System.out.println(v.field2.field1);
		System.out.println(v.field3);
		System.out.println(v.field4);
		
	
	}

}
