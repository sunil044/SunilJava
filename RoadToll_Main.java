package Level_3;

public class RoadToll_Main {

	public static void main(String[] args) {
		Road_Toll rtl = new Road_Toll();
		
		rtl.type = "sadan";
		rtl.tierscount = 4;
		rtl.calculatetoll();
		
		Road_Toll rtl2 = new Road_Toll("truck", 6);
		rtl2.calculatetoll();

	}

}
