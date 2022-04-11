package programes;

import java.io.File;

public class Programe22 {
	public static void main(String ag[]) {
		try{
            File file = new File("F:\\Java\\Assignments\\src\\day1.java");
            String fileName = file.toString();
            int i = fileName.lastIndexOf(".");
            if(i  > 0) {
            	String extention = fileName.substring(i+1);
            	System.out.println(extention);
            }
        }catch(Exception e){
            e.getStackTrace();
        }
	}
}
