package interfaces;

public interface Int1 {
	
	static final int a = 100;

	void doThis();
	
	static void xyz() {
		System.out.println("Static xyz from int1");
	}
	
	default void uvw() {
		System.out.println("default uvw from int1");	
		
	}
	
}
