package prob4;

public class Condo extends Property  {

	private int numberOfFloors;
	
	public Condo(Location location, int numberOfFloors) {
		super(location);
		this.numberOfFloors = numberOfFloors;
	}

	public double computeRent(){
		return 500 * numberOfFloors;
	}
}
