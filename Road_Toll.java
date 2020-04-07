package Level_3;

public class Road_Toll {
	
	String type;
	int tierscount;

	public void calculatetoll() {
		if(tierscount == 2) {
			System.out.println("Your toll amount is 0");
		} else if(tierscount == 4) {
			System.out.println("Your toll amount is 10");
		} else if(tierscount > 4) {
			System.out.println("Your toll amount is 20");
		} else {
			System.out.println("Incorrect tiers count");
		}
		
	}
	
	public Road_Toll() {
			System.out.println("constructed is executed");
		}

	public Road_Toll(String type, int tierscount) {
		this.type = type;
		this.tierscount = tierscount;
	}	
}

