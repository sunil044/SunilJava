package pkg1;

public class LogicBitwiseOpr {

	public static void main(String[] args) {
		
		boolean a = true;
		boolean b = false;
		int num1 = 60;
		int num2 = 42;
		
		System.out.println(a && b);
		System.out.println(a || b);
		System.out.println(!a);

		System.out.println(num1 & num2);
		System.out.println(num1 | num2);
		System.out.println(~num1);
	}

}
