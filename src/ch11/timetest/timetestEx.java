package ch11.timetest;

public class timetestEx {

	public static void main(String[] args) {
		long time1 = System.nanoTime();
		String string;
		for(int i=1;i<=50;i++) {
			string = new String();
			System.gc();
		}
		long time2 = System.nanoTime();
		System.out.println(time2-time1);
	}

}
