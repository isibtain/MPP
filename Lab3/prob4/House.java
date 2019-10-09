package prob4;

public class House extends Property {

	private double lotSize;
	

	public House(Location location, double lotSize) {
		super(location);
		this.lotSize = lotSize;
	}
	

	public double computeRent(){
		return 0.1 * lotSize;
	}
}
