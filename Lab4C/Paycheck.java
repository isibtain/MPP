final class Paycheck {
	private double grossPay=0.0;
	private  double fica=0.0;
	private  double state=0.0;
	private  double local=0.0;
	private  double medicare=0.0;
	private  double socialSecurity=0.0;
	Paycheck(double grossOfAll)
	{
		this.grossPay=grossOfAll;
		this.fica = grossOfAll * 23 / 100;
		this.state = grossOfAll * 5 / 100;
		this.local = grossOfAll * 1 / 100;
		this.medicare = grossOfAll * 3 / 100;
		this.socialSecurity = grossOfAll * 7.5 / 100;			
		
		
	}
	
	void print()
	{
		System.out.println("# Paycheck Info #");
		System.out.println("Gross Payment :"+this.grossPay);
		System.out.println("Federal Insurance Contributions :"+this.fica);
		System.out.println("State Tax :"+this.state); 
		System.out.println("Local Tax :"+this.local);
		System.out.println("Medicare tax :"+this.medicare);
		System.out.println("Social Security :"+this.socialSecurity);
		System.out.println("Net payment :"+getNetPay()+"\n");
	}
	double getNetPay()
	{
		return this.grossPay-(fica+state+local+medicare+socialSecurity); 
	}

}
