package programes;

public class Programe48 {

	public static void main(String[] args) {
		//Join make out main thread to wait
		Thread t1= new Thread(()-> {
			for(int i=1; i<=5; i++) {
				System.out.println("hi");
				try{
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		Thread t2= new Thread(()-> {
			for(int i=1; i<=5; i++) {
				System.out.println("hello");
				try{
					Thread.sleep(1000);
				}catch(Exception e) {
					System.out.println(e);
				}
			}
		});
		
		t1.start();
		t2.start();
//		try {
//			t1.join();
//			t2.join();
//		}catch(Exception e) {
//			System.out.println(e);
//		}
		System.out.println("Finished");
	}

}
