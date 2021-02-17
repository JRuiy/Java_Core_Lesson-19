package ua.lviv.lgs;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File file = new File("serializedEmployee.txt");
		Employee em = new Employee("Ivan", 2, 10000);
		Methods m = new Methods();
		m.serialize(em, file);
		System.out.println(m.deserealize(file));
		
		File file2 = new File("serializedEmployeeCollection.txt");
		List<Employee> listEmployees = new ArrayList<Employee>();
		listEmployees.add(em);
		listEmployees.add(new Employee("Vadim", 22, 15000));
		listEmployees.add(new Employee("Yana", 21, 12000));
		m.serialize((Serializable) listEmployees, file2);
		System.out.println(m.deserealize(file2));
		
	}
	
}
