
public class BasedCommEmp extends CommissionEmp {
	private double baseSalary;
	
//public BasedCommEmp () {
//	this("a","b",1000,0.5,200);
//}


	public BasedCommEmp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BasedCommEmp(String firstName, String lastName, int sales, double CommisonRate,double baseSalary) {
		
		super(firstName, lastName, sales, CommisonRate);
		this.baseSalary=baseSalary;
		// TODO Auto-generated constructor stub
	}
	 public double CalculateSalary() {
		 return super.CalculateSalary()+this.baseSalary*1.10;
	 }

}
//public class BasedCommEmp extends CommissionEmp {
//
//}
