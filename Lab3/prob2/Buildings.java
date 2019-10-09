package prob2;

import java.util.List;

public class Buildings {
	
	private List<Appartments> appartments;
	private double maintainanceCost;
	
	Buildings(List<Appartments> appartments, double mantainanceCost) throws Exception{
		if(appartments == null) throw new NullPointerException("No allowed a null list of appartments");
		else if(appartments.isEmpty()) throw new Exception("Not allowed empty lists. Must contain at least one appartment per building");
		this.appartments = appartments;
		
		this.maintainanceCost = mantainanceCost;
	}
	
	public double getRentProfit() {
		double result = 0;
		
		for(Appartments a : this.appartments) {
			result += a.getRent();
		}
		
		return result - this.maintainanceCost;
	}

	

}
