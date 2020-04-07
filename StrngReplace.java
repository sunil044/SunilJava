package level2;

public class StrngReplace {

	public static void main(String[] args) {
		
		String str1 = "concetrat1234on 1234mproves w1234th pract1234ce";
		String str2 = "1234";
		String str3 = "I";
		
		System.out.println(str1.replace(str2, str3));
		
		String str4 = "EI%%T$%#HER Y%$%$OU C^(ON%57TROL O^$%UR M^&%IND OR IT WILL CO%$NTROL YOU";
		String patt = "[^A-Za-z0-9\\s]";
		
		System.out.println(str4.replaceAll(patt, ""));

	}

}
