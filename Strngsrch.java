package level2;

public class Strngsrch {

	public static void main(String[] args) {
		
		String str1 = "I love jaVa and love cobol";
		String str2 = "Java";
		
		System.out.println(str1.contains(str2));
        System.out.println(str1.toLowerCase().contains(str2.toLowerCase()));
        System.out.println(str1.startsWith("I"));
        System.out.println(str2.endsWith("a"));
        System.out.println(str1.indexOf("love"));
        System.out.println(str1.indexOf("love",8));
        System.out.println(str1.lastIndexOf("love"));
        
	}

}
