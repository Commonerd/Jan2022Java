package ncs.test2;

public class Sales extends Employee implements Bonus {
	Sales(){}

	public Sales(String name, int number, String department, int salary) {
		super(name, number, department, salary);
	}
	@Override
	public double tax() {
		return getSalary() *0.13;
	}
	
	@Override
	public void incentive(int pay) {
		setSalary((int)(pay * 1.2) +getSalary());
	}
	
	
}
