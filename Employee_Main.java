package Level_3;

public class Employee_Main {

	public static void main(String[] args) {
		
		Exercise_1 emp1 = new Exercise_1();
		Exercise_1 emp2 = new Exercise_1();
		
		emp1.employee = "Bob";
		emp1.empID = 111;
		emp1.salary = 12345;
		
		emp1.displayEmployeeBonus();
		
		emp2.employee = "Sunil";
		emp2.empID = 11141;
		emp2.salary = 10000;
		
		emp2.displayEmployeeBonus();
	}

}
