package level2;

public class StrngSlice {

	public static void main(String[] args) {
		
		String str1 = "ABCDEFG";
		String str2 = "A_B_C_D";
		String str3 = "_";
		System.out.println(str1.charAt(5));
		String temp = "";
		for(int i = 0; i <= str1.length()-1; i++) {
			temp = str1.charAt(i) + temp;
		}
		
		System.out.println(temp);
		
		System.out.println(str1.substring(3));
		System.out.println(str1.substring(3,5));
		
		String [] arr = str2.split(str3);
		
		for(String x : arr) {
			System.out.println(x);
		}
		

	}

}
