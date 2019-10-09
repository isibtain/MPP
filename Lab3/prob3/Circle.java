package prob3;

public class Circle {
	
		private double radius;
		private final Double pi = Math.PI;

		
		Circle(double radius){
			this.radius = radius;
		}
		
		public double computeArea() {
			return pi * radius * radius;
		}

		

}
