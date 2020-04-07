package Level_3;

public class Classroom {

	private String sub;
	private int stdcount;
	
	
	public String getSub() {
		return sub;
	}


	public void setSub(String sub) {
		this.sub = sub;
	}


	public int getStdcount() {
		return stdcount;
	}


	public void setStdcount(int stdcount) {
		this.stdcount = stdcount;
	}


	public void displayDetails() {
		System.out.println("This is a " + sub + " classroom and it has " + stdcount + " students");
	}
}
