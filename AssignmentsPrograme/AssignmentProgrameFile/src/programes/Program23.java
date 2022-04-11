package programes;

import java.io.File;

public class Program23 {

	public static void main(String[] args) {
		try{
            File file = new File("F:\\Java\\Assignments\\src\\day1.java");

            File[] files = file.listFiles();//create the list of file
                if(file.isFile()){
                    System.out.println("Yes");
                }else {
                	System.out.println("No");
                }
        }catch(Exception e){
            e.getStackTrace();
        }
	}

}
