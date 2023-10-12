
public class CommissionEmp extends Employee {
private int sales;
private double CommisonRate;
public CommissionEmp () {
	this("a","b",10000,0.5);
}
public CommissionEmp (String firstName, String lastName,int sales,double CommisonRate) {
	super(firstName,lastName);
	this.sales=sales;
	this.CommisonRate=CommisonRate;;
}
public double CalculateSalary() {
return CommisonRate*sales;

}
//public static void main(String[] args) {
//	System.out.println("Hi....");
//}
}