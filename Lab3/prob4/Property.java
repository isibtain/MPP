package prob4;

public abstract class Property {
	
	
	private Location location;
	private double rent;
	
	protected Property(Location location) {
		this.location = location;
	}

	
	abstract double computeRent();

	
	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	public double getRent() {
		return rent;
	}

	public void setRent(double rent) {
		this.rent = rent;
	}


}
