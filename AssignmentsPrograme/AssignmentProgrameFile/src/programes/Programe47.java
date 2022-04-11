package programes;

public class Programe47 {
	int count = 0;
	public synchronized void increment() {
		count++;
	}
	public static void main(String[] args) throws InterruptedException {
		Programe47 p = new Programe47();
		Thread t = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<100; i++) {
					p.increment();
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				for(int i=0; i<100; i++) {
					p.increment();
				}
			}
		});
		t.start();
		t2.start();
		t.join();
		t2.join();
		System.out.println(p.count);
	}

}
