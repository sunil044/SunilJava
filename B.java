//Super_Keyword

package level_6;

public class B extends A {
	
	int num1 = 200;
	
	public void doThis() {
		System.out.println("do this from B");
	}
	
	public void xyz() {
		System.out.println(super.num1);
		super.doThis();
		System.out.println("xyz executed");
	}

	
}
