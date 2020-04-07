package level2;

public class Strngcomp {

	public static void main(String[] args) {
		
		String str1 = "ABCD";
		String str2 = "ABcd";

		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if(str1.equals(str2)) {
			   System.out.println("Strings are equal");
		    }else {
		    	System.out.println("Strings are not equal");
		    }
		
		System.out.println(str1.compareTo(str2));
		System.out.println(str1.compareToIgnoreCase(str2));
    }
}