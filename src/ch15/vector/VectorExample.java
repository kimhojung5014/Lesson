package ch15.vector;

import java.util.List;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		List<Board>list = new Vector<Board>();
		
		class threadA extends Thread{
			public void run() {
				for(int i=1;i<=100;i++) {
					list.add(new Board("1", "1", "1"));
					System.out.println(list.get(i).content);
				}
			}
		}
		class threadB extends Thread{
			public void run() {
				for(int i=1;i<=100;i++) {
					list.add(new Board("2", "2", "2"));
					System.out.println(list.get(i).content);
				}
			}
		}
		
		Thread threadA = new threadA();
		Thread threadB = new threadB();
		threadA.start();
		threadB.start();
		
		for(Board board: list) {
			System.out.println(board.subject+" "+board.content+" "+board.writer);
		}
	}

}
