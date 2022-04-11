package programes;

import java.util.ArrayList;

public class Programe44 extends Employee{
	
	public Programe44(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super(id, name, age, gender, department, yearOfJoining, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(12,"name1",26,"male", "Sales", 2022, 6.5);
		Employee e2 = new Employee(13,"name2",20,"female", "Sales", 2021, 5.5);
		Employee e3 = new Employee(14,"name3",27,"male", "Sales", 2023, 9.5);
		Employee e4 = new Employee(15,"name4",23,"female", "Marketing", 2020, 3.5);
		Employee e5 = new Employee(16,"name5",24,"male", "sales", 2010, 2.5);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
		
		int Oldest=0;
		String dep = "";
		String name= "";
		for(int i=0; i<al.size(); i++) {
			Employee ep = (Employee)al.get(i);
			if(ep.getAge() >= Oldest) {
				Oldest = ep.getAge();
				dep = ep.getDepartment();
				name=ep.getName();
			}
		}
		System.out.println("Oldest Emplyoee is : "+name+" With : "+ dep +" Department"+" age is "+Oldest+"");
		
	}

}
