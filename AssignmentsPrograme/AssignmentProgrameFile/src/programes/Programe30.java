package programes;

import java.io.FileInputStream;

public class Programe30 {

	public static void main(String[] args) {
		byte[] b = new byte[100];
		try {
			FileInputStream fi = new FileInputStream("F:\\Java\\Assignments\\src\\day1.java");
			for(int i=0; i<100; i++) {
				b[i] = (byte)fi.read();
			}
			for(int j=0; j<100; j++) {
				System.out.println((char)b[j]);
			}
		}catch(Exception e) {
			System.out.print(e);
		}
	}
	

}
