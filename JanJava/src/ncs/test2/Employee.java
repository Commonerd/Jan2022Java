package ncs.test2;

public abstract class Employee {
	private String name;
	private int number;
	private String department;
	private int salary;
	
	Employee(){}

	public Employee(String name, int number, String department, int salary) {
		super();
		this.name = name;
		this.number = number;
		this.department = department;
		this.salary = salary;
	};
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	abstract double tax();

	public double tax(int salary) {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
