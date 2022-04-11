package programes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Programe32 extends Employee{
	
	public Programe32(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super(id, name, age, gender, department, yearOfJoining, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(12,"name1",26,"male", "dipart1", 2022, 6.5);
		Employee e2 = new Employee(13,"name2",20,"female", "dipart2", 2021, 5.5);
		Employee e3 = new Employee(14,"name3",27,"male", "dipart1", 2023, 9.5);
		Employee e4 = new Employee(15,"name4",23,"female", "dipart3", 2020, 3.5);
		Employee e5 = new Employee(16,"name5",24,"male", "dipart1", 2010, 2.5);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);
		al.add(e5);
			
		HashSet st = new HashSet();
		for(int i =0; i<al.size();i++) {
			Employee ep = (Employee)al.get(i);
			st.add(ep.getDepartment());
		}
		Iterator<String> it = st.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
