package programes;

import java.io.File;
import java.io.FileInputStream;

public class Programe26 {

	public static void main(String[] args) {
		try {
			FileInputStream file = new FileInputStream("F:\\Java\\Assignments\\src\\day1.java");
			FileInputStream file2 = new FileInputStream("F:\\Java\\Assignments\\src\\day1.java");
						
			int i = 0;
			int j = 0;
			
			while(i != -1 && j != -1) {
				i =file.read();
				j =file2.read();
				if(i != j)
					break;
			}
			if(i != j) {
				System.out.print("Diff");
			}else {
				System.out.print("Same");
			}
		}catch(Exception e) {
			System.out.print(e);
		}

	}

}
