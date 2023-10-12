
public class SalariedEmp extends Employee{
	private double weeklySalary;

	public SalariedEmp() {
//		super();
		this("a","b",200);
			
	}

	public SalariedEmp(String firstName, String lastName,double weeklySalary) {
        super(firstName,lastName);
		this.weeklySalary = weeklySalary;
	}

	public double CalculateSalary() {
		return this.weeklySalary;
	}
}
