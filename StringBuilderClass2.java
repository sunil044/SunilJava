package level_4;

public class StringBuilderClass2 {

	public static void main(String[] args) {
		
		StringBuilder sb1 = new StringBuilder("Learning is fun");
		
		sb1.insert(9, "java ");
		
		System.out.println(sb1);
		
		sb1.replace(9, 13, "everything");
		
		System.out.println(sb1);
		
		String str1 = "AAFGDKLRNKSSSKFGFGAAAGH";
		
		System.out.println(str1.replace("AA", "@"));
		
		sb1.deleteCharAt(0);
		
		System.out.println(sb1);
		
		sb1.delete(2, 10);
		
		System.out.println(sb1);
		
		sb1.reverse();
		
		System.out.println(sb1);
		
		
		

	}

}
