package com.shristi.stream;

import java.util.*;
import java.util.stream.Stream;

public class EmpMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		List<Employee> empList = new ArrayList<>();

		empList.add(new Employee("Nayeem", "Hyderabad", "E168"));
		empList.add(new Employee("ahmed", "Vijayawada", "E169"));
		empList.add(new Employee("shaik", "Chennai", "E170"));
		empList.add(new Employee("nas", "Bangalore", "E171"));
		empList.add(new Employee("John", "Mumbai", "E172"));

		System.out.println("List of Employees");
		for(Employee emp: empList) {
			System.out.println(emp);
		}
		System.out.println();
		
		System.out.println("Enter your input");
		System.out.println("-----------------");
		System.out.println("For search by city PRESS 1");
		System.out.println("For search by Employee Id PRESS 2");
		System.out.println("For sorting Employee List PRESS 3");
		System.out.println("For search name start with the letter k PRESS 4");
		int input = scanner .nextInt();
		switch (input) {
		case 1:
			System.out.println("Enter city to search");
			String inputCity = scanner.next();
			Stream<Employee> listStream = empList.stream();
			Stream<Employee> filterByCity = listStream.filter((c) -> c.city.equalsIgnoreCase(inputCity));
			
			Iterator<Employee> it = filterByCity.iterator();
			while(it.hasNext()) {
				Employee city = it.next();
				System.out.println(city);
			}
			break;
		case 2:
			// search by Employee id
			try {
				System.out.println("Enter Employee Id");
				String empid = scanner.next();
				Stream<Employee> empStream = empList.stream();
				
				Optional<Employee> byIdStream = empStream.filter((i)->{
					return i.empId.equals(empid);}).findFirst();
				if(byIdStream.isEmpty()) {
					throw new EmployeeNotFoundException("Employee not found: Please check your input");
				}else {
					System.out.println(byIdStream.get());
				}
				
			}catch(EmployeeNotFoundException e) {
				System.out.println(e.getMessage());
			}
			
			System.out.println();
			
			break;
		case 3:
			Collections.sort(empList, (emp1, emp2) -> {
				return emp1.name.compareTo(emp2.name);
			});
			System.out.println(empList);
			break;
		case 4:
			Stream<Employee> filterByChar = empList.stream();
			Stream<Employee> charStream = filterByChar.filter((x)->{
				return x.name.startsWith("k");
			});
			if(charStream.findAny().isEmpty()) {
				System.out.println("Not in first place");
			}else {
			charStream.forEach(System.out::println);
			}

		default:
			break;
		}
		
	scanner.close();
		


		
		
		
		
		
		
	}

}
