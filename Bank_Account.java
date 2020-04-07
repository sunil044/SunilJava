package Level_3;

public class Bank_Account {
	
	private long acno;
	private String acname;
    private double acbalance;
    
    public void depoit(double amt) {
    	if(amt > 0) {
    		acbalance = acbalance + amt;
    		System.out.println("Successful deposite " + amt);
    	} else {
    		System.out.println("cannot deposite " + amt);
    	}
    }
    
    public void withdraw(double amt) {
    	if(amt > 0) {
    		acbalance = acbalance - amt;
    		System.out.println("Successful withdraw " + amt);
    	} else {
    		System.out.println("cannot withdraw " + amt);
    	}
    }
    
    public void displayCurrentBalance() {
    	System.out.println("your current balace is " + acbalance);
    }
    
    public Bank_Account(long acno, String acname, double acbalance) {
    	this.acbalance = acbalance;
    	this.acname = acname;
    	this.acno = acno;
    }

}
