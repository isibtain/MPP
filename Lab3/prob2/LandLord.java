package prob2;

import java.util.LinkedList;
import java.util.List;

public class LandLord {
	
	
private List<Buildings> buildings;
	
	LandLord(List<Buildings> builds) throws Exception{
		if(builds == null) throw new NullPointerException("Null list of appartments");
		else if(builds.isEmpty()) throw new Exception("Empty lists. At least one appartment per building");
		this.buildings = builds;
	}
	
	public double getRentProfit() {
		double result = 0;
		
		for(Buildings b : this.buildings) {
			result += b.getRentProfit();
		}
		
		return result;
	}
	
	public static void main(String[] args) throws Exception {
		Appartments a1 = new Appartments(1, 450.0);
		Appartments a2 = new Appartments(2, (double) 500);
		List<Appartments> Appartments2 = new LinkedList<>();
		Appartments2.add(a1);
		Appartments2.add(a2);
		
		Buildings b1 = new Buildings( Appartments2, 200);
		
		Appartments a3 = new Appartments(1, 450.0);
		Appartments a4 = new Appartments(2, (double) 500);
		List<Appartments> Appartments3 = new LinkedList<>();
		Appartments3.add(a3);
		Appartments3.add(a4);
		
		Buildings b2 = new Buildings( Appartments3, 200);
		
		List<Buildings> buildings = new LinkedList<>();
		buildings.add(b1);
		buildings.add(b2);
		LandLord landLord = new LandLord(buildings);
		
		System.out.println("Profits: " + landLord.getRentProfit());
	}
}


