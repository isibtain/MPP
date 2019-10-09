import java.time.Month;
import java.time.Year;

class Hourly extends Employee {
	double hourlyWage;
	double hoursPerweek;

	Hourly(String eid, double hWage, double hPerWeek) {
		super(eid);
		this.hourlyWage = hWage;
		this.hoursPerweek = hPerWeek;
	}

	double calcGrossPay(int month,int year)
	{
		// Since there are 4 week in a month on average
		return this.hourlyWage * this.hoursPerweek * 4;
	}
}
