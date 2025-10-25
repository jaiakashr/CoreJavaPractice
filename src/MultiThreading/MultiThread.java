package MultiThreading;

//class Book implements Runnable{
//	public void run() {
//		for(int i =0; i<=5; i++) {
//			System.out.println("Ubdating DB..");
//			try {
//				Thread.sleep(4000);
//			} catch (InterruptedException e) {
//				e.printStackTrace();
//			}
//		}
//	}
//}

class Num extends Thread{
	public void run() {
		for(int i =0; i<=5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(4500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class MultiThread {
	public static void main(String[] args) throws InterruptedException {
		Runnable book = new Runnable() {               // book is a anonymous class
			public void run() {
				for(int i =0; i<=5; i++) {
					System.out.println("Ubdating DB..");
					try {
						Thread.sleep(4000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Num num = new Num();
		Thread t1 = new Thread(book);
		t1.start();
		num.start();
		
		t1.join();    //use of join() method : main thread will wait until book method will completing its work.
		num.join();
		
		System.out.println("End of the program.. ");
	}
}
