package level2;

public class Strng {

	public static void main(String[] args) {
		
		String str1 = "Attra";
		String str2 = " Infotech";
		String str3 = " Pvt";
		String str4 = str1 + str2;
		
		String str5 = str4.concat(str3);
		 System.out.println(str4);
		 System.out.println(str5);
		 
		 int num1 = 100;
		 String str8 = ""; 		 
		 System.out.println(str1 + num1);
		 System.out.println(str1.length());
		 
	     String str6 = "   dfdgfgfgfg sdGHFHGgfg   ";
	     System.out.println(str6.trim());
	     System.out.println(str6.toUpperCase());
	     System.out.println(str6.toLowerCase());
	     System.out.println(str4.isEmpty());
	     System.out.println(str8.isEmpty());
	}

}
