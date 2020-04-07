package pkg1;

public class BrknCnt {

	public static void main(String[] args) {
		
         int a = 100;
         int b = 100;
		
		while(a > 50) {
			
			a-=5;
			if(a == 75) {
				break;
			}
			System.out.println(a);
		

	}
		while(b > 50) {
			
			b-=5;
			if(b == 75) {
				continue;
			}
			System.out.print(" b = ");
			System.out.println(b);
		

	}

}
	
}
