package entities;

public class Employee {
	
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee(String name, double grossSalary, double tax) {
		this.name = name;
		this.grossSalary = grossSalary;
		this.tax = tax;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}
	
	public double netSalary() {
		return grossSalary - tax;
	}
	
	public double increaseSalary(double increase) {
		return grossSalary += grossSalary*increase/100.0;
	}
	
	public String toString() {
		return "Employee: "
				+ name 
				+ ", "
				+ "$ "
				+ String.format("%.2f", netSalary());
	}
}
