package serialiazation;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SeralizationDemo {

	public static void main(String[] args) {
		seralizaion();
		deserilazation();
	}

	private static void seralizaion() {
		try (FileOutputStream fos = new FileOutputStream("C:\\Users\\mrajendra\\readhello.txt");
			ObjectOutputStream oss = new ObjectOutputStream(fos)) {

			Employee emp1 = new Employee(1, "Max Fuller", 8000, "Aq2001");
			oss.writeObject(emp1);
			Employee emp2 = new Employee(2, "ram Fuller", 9000, "Bq2001");
			oss.writeObject(emp2);
			System.out.println("object Seralized");
			System.out.println(emp1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void deserilazation() {
		try (FileInputStream fis = new FileInputStream("C:\\Users\\mrajendra\\readhello.txt");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
			Employee emp1 = (Employee) ois.readObject();
			System.out.println("object Deserialize object -" + emp1);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}

class Employee implements Serializable {
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

}
