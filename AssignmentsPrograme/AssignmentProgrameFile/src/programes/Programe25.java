package programes;

import java.io.File;

public class Programe25 {

	public static void main(String[] args) {
		try {
			File file = new File("F:\\Java\\Assignments\\src");
			if(file.isDirectory() == true) {
				System.out.println("This is Directory");
			}else {
				System.out.println("This is file");
			}
		}catch(Exception e) {
			e.getStackTrace();
		}
	}

}
