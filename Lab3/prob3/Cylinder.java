package prob3;

public class Cylinder {
	
	private Circle base;
	private double height;

	
	public Cylinder(Double height, Circle base) {
		
		if (base == null) 
			throw new NullPointerException("Base is Null.");
	
		this.height = height;
		this.base = base;

	}
	
	public double computeVolume() { 
	if(base == null) return 0.0;
	return 
			this.base.computeArea() * height;

	}
	
	
}
