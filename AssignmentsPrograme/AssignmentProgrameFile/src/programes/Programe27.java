package programes;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Programe27 {
	public static void main(String ag[]) {
		try {
			File file = new File("F:\\Java\\Assignments\\src\\day1.java");
			long time = file.lastModified();
			System.out.println(time);
			
			DateFormat df = new SimpleDateFormat("MMMM dd. yyy hh:mm a");
			System.out.println(df.format(time));
			
		}catch(Exception e) {
			System.out.println(e);
		}

	}
	
}
