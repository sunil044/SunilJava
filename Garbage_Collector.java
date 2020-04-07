package level_5;

public class Garbage_Collector {

	public static void main(String[] args) {
		
		String str1 = "ASDFLFMVLMBVFMBMBMFGLM";
		
		for(int i = 0; i <= str1.length()-1; i++) {
			String temp = "ch"+i+":"+str1.charAt(i);
		}

	}

}
