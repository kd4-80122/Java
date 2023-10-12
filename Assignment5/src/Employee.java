
public abstract class Employee {

	String firstName;
	String lastName;
	public Employee() {
		this("a","b");
	}
	public Employee(String firstName, String lastName) {
	
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public abstract double CalculateSalary();
}
