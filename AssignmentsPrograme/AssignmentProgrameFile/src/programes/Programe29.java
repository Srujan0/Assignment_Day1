package programes;

import java.io.File;

public class Programe29 {
	public static void main(String ag[]) {
		try {
			File file =new File("F:\\Java\\Assignments\\src\\day1.java");
			if(file.exists()) {
				System.out.println(file.length()/1024*1024 +"MB");
				System.out.println(file.length()/1024+"KB");
				System.out.println(file.length() +"Byte");
			}else {
				System.out.println("No File Found");
			}
		}catch(Exception e) {
			System.out.print(e);
		}
			
	}
}
