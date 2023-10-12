
public class HouredEmp extends Employee {
private double hourlyRate;
private int hrs;
	
	public HouredEmp() {
		this("a","b",12,10);
	}
	public HouredEmp(String firstName, String lastName,int hrs,int hourlyRate) {
		super(firstName,lastName);
		this.hrs=hrs;
		this.hourlyRate=hourlyRate;
		
		
	}
	 public double CalculateSalary() {
//		if(this.hrs>40){
//			this.hourlyRate = this.hourlyRate*40+ (this.hrs-40)*1.5*hourlyRate;
//		}
//		
//			return this.hourlyRate*(this.hrs);
			if(this.hrs<=40){
				return this.hourlyRate*(this.hrs);
			}
			
		
				return this.hourlyRate = this.hourlyRate*40+ (this.hrs-40)*1.5*hourlyRate;
		
		
			
		
	 }
}
