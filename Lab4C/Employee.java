import java.time.Month;
import java.time.Year;

public abstract class Employee {
	String empid;

	Employee(String id) {
		this.empid = id;
	}
 void print()
 {
	 System.out.println("# Person Id :"+this.empid +"#");
		Paycheck payCheck= calcCompensation(0, 0); // we no
		payCheck.print(); // printing all the details of paycheck
	 
 }
	void print(int month,int year)
	{
		System.out.println("# Person Id :"+this.empid +"#");
		Paycheck payCheck= calcCompensation(month, year);
		payCheck.print(); // printing all the details of paycheck
		
	}

	Paycheck calcCompensation(int month, int year)
	{
		double grossOfAll = calcGrossPay( month,year);			
	   
		Paycheck paycheck=new Paycheck(grossOfAll);
		return paycheck;
	}

	abstract double calcGrossPay(int month,int year);
}
