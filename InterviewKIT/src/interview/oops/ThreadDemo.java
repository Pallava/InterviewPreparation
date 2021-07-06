package interview.oops;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());
		MyThread1 t1= new MyThread1();
		t1.start();
		
		MyThread2 t2= new MyThread2();
		Thread t =new Thread(t2);
		t.start();

	}

}


class MyThread1 extends Thread{
	
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+","+i);
		}
	}
	
	
}

class MyThread2 implements Runnable{

	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(Thread.currentThread().getName()+","+i + " ,implements Runnable");
		}
		
	}
	
}