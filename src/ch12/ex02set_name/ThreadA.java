package ch12.ex02set_name;

public class ThreadA extends Thread{
	ThreadA(){
		setName("ThreadA");
	}
	public void run() {
		for(int i = 0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}