package level_4;

public class StringbuilderClass1 {

	public static void main(String[] args) {
		
		String str1 = "I";
		
		str1 = str1 + " Like";
		
		str1 = str1 + " Java";
		
		System.out.println(str1);
		
		StringBuilder sb1 = new StringBuilder("I");
		
		sb1.append(" Like");
		sb1.append(" Java");
		
		System.out.println(sb1);

	}

}
