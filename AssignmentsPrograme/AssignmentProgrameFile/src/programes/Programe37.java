package programes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Programe37 extends Employee{
	
	public Programe37(int id, String name, int age, String gender, String department, int yearOfJoining,
			double salary) {
		super(id, name, age, gender, department, yearOfJoining, salary);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Employee e1 = new Employee(12,"name1",26,"male", "dipart1", 2022, 6.5);
		Employee e2 = new Employee(13,"name2",20,"female", "dipart2", 2021, 5.5);
		Employee e3 = new Employee(14,"name3",27,"male", "dipart1", 2023, 9.5);
		Employee e4 = new Employee(15,"name4",23,"female", "dipart3", 2002, 3.5);
		Employee e5 = new Employee(16,"name5",24,"male", "dipart1", 2010, 2.5);
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(e4);

		HashSet st = new HashSet();
		for(int i =0; i<al.size();i++) {
			Employee ep = (Employee)al.get(i);
			st.add(ep.getDepartment());
		}
		Iterator<String> it = st.iterator();
		ArrayList al2= new ArrayList();
		while(it.hasNext()) {
			al2.add(it.next());
		}
		
		for(int j=0; j<al2.size(); j++) {
			for(int i=0; i<al.size(); i++) {
				Employee ep = (Employee)al.get(i);
				String dip = (String)al2.get(j);
				String dip2=  (String)ep.getDepartment();
				if(dip == dip2) {
					System.out.print(dip2);
				}
				System.out.println();
			}
		}
			
	}

}
