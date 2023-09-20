package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter with employee data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Gross Salary: ");
		double grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		double tax = sc.nextDouble();
		Employee employee = new Employee(name, grossSalary, tax);

		employee.netSalary();
		System.out.println(employee.toString());
		
		System.out.println("Which percentege to increase salary ? ");
		double increass = sc.nextDouble();
		employee.increaseSalary(increass);
		
		System.out.println("Updated data: " + employee.toString());
		
		
		sc.close();

	}

}
