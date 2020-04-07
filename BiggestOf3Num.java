package pkg1;

public class BiggestOf3Num {

	public static void main(String[] args) {
		
		int num1 = 400 ;
		int num2 = 500 ;
		int num3 = 300 ;
		
		if(num1 >= num2 && num1 >= num3) {
			System.out.println("num1 is bigger");
		} else if(num2 >= num1 && num2 >= num3){
			System.out.println("num2 is bigger");
		} else {
			System.out.println("num3 is bigger");
		}
		
	}
	
}	
