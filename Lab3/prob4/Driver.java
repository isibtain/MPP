package prob4;

public class Driver {

	public static void main(String[] args) {
		
		Property[] objects = { new House(new Location("NY","NYC", "401 N 21St", "001A"), 9000), new Condo(new Location("LA", "Los Angeles", "5500 19th S", "003B"), 2), new Trailer(new Location("IL", "Chicago", "991 W 32nd S", "013K	")) };

		//Object[] objects = { new House(9000), new Condo(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println(totalRent);
	}
}
