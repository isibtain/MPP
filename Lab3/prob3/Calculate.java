package prob3;

public class Calculate {
	
	public static void main(String[] args) {
		Circle circle = new Circle(5.0);
		
		Cylinder cylinder = new Cylinder(7.0, circle);
		
		System.out.println("Circle Area: " + circle.computeArea());
		System.out.println("Cylinder Volume: " + cylinder.computeVolume());
	}


}
