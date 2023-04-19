package collections;

import java.io.Serializable;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;





public class SetDemo {
	public static void main(String[] args) {
	Set<Integer> inset=new TreeSet<Integer>();
		inset.add(10);
		inset.add(30);
		inset.add(20);
		
		System.out.println(inset);
		
		
		Set<String> strset=new TreeSet<String>();
		strset.add("ram");
		strset.add("am");
		strset.add("kirshna");
		strset.add("for");
		
		System.out.println(strset);
		
		Set<String> strset2=new TreeSet<String>(new StringComparator());
		strset2.add("ram");
		strset2.add("am");
		strset2.add("kirshna");
		strset2.add("for");	
		System.out.println(strset2);
		
		Set<Employee> employees=new TreeSet<Employee>();
		employees.add(new Employee(1, "Max Fuller", 8000, "Aq2001"));
		employees.add(new Employee(2, "john Fuller", 9000, "Bq2001"));
		employees.add(new Employee(3, "ravi ", 7000, "Cq2001"));
		employees.add(new Employee(4, "william", 5000, "Dq2001"));
		employees.add(new Employee(1, "zoo", 6000, "Eq2001"));
		System.out.println(employees);
		
		Set<Employee> emps = new TreeSet<Employee>(new EmpNameComparator());
		emps.add(new Employee(1, "Max Fuller", 8000, "Aq2001"));
		emps.add(new Employee(2, "john Fuller", 9000, "Bq2001"));
		emps.add(new Employee(3, "ravi ", 7000, "Cq2001"));
		emps.add(new Employee(4, "william", 5000, "Dq2001"));
		emps.add(new Employee(1, "zoo", 6000, "Eq2001"));
		System.out.println(emps);
	}

}

class StringComparator implements Comparator<String>{

	public int compare(String str1, String str2) {
		// TODO Auto-generated method stub
		
		int l1=str1.length();
		int l2=str2.length();
		
		if(l1<l2) {
			return -1;
		}else if(l1>l2) {
			return 1;
		}
		return str1.compareTo(str2);
	}
	
}

class Employee implements Comparable<Employee> {
	int id;
	String name;
	int salary;
	String adhar;

	Employee(int id, String name, int salary, String adhar) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.adhar = adhar;
	}

	public String toString(){
		return this.id +"|"+ this.name + "|" + this.salary + "|" + this.adhar;

	}

	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		return this.id< o.id?-1: this.id>o.id? 1:0;
	}
}
	class EmpNameComparator implements Comparator<Employee>{
		
		public int compare(Employee o1, Employee o2) {
			return o1.name.compareTo(o2.name);
		}
	}

	


	