package programes;

import java.util.Scanner;

public class Programe45 {

	public static void main(String[] args) {
		String s = new String("asdfjkl;");
		String s2= new String(";lkjgfdsa");
		System.out.println(s.equals(s2));
		
		//.equals() method is use to compare two objs but
		//hasjCode() returns the hashCode of the given input
		System.out.println("Enter");
		Scanner readInput = new Scanner(System.in);
		Integer i = readInput.nextInt();
		readInput.close();
		int hashValue = i.hashCode();
		System.out.println(hashValue);
	}

}
