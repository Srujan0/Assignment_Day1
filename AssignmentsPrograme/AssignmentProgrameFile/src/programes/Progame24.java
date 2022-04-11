package programes;
import java.io.File;
public class Progame24 {

	public static void main(String[] args) {
	
		String path = "Programe22.java";
		String act = "read,write";
		try {
			File file = new File("F:\\Java\\Assignments\\src\\day1.java");
			
			
			System.out.println("File Read-> "+file.canRead());
			System.out.println("File write-> "+file.canWrite());
		}catch(Exception e){
			System.out.println("error");
		}
	}

}