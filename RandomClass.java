package level_4;

import java.util.Random;

public class RandomClass {

	public static void main(String[] args) {

		Random r1 = new Random();
		
		for(int i = 1; i <= 100; i++) {
			//System.out.println(r1.nextInt(9000) + 1000);
			
			System.out.println((int)(Math.random() * 1000));
		}

	}


}
