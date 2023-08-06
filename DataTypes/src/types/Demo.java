package types;

public class Demo {
	
	byte age = 25;
	
	short empCode = 2333;
	
	long atmNumber = 948806703297888183L;
	
	int phoneNumber = 948806703;
	
	double salary = 15000.25;
	
	float netSalary = 13000.955456F;
	
	char initial = 'P'; 
	
	boolean allDetails = true;
	
	
	
public static void main(String[] args) {
		
	Demo d = new Demo();
	
    System.out.println("Salary = "+d.salary);
     
	System.out.println("Atm Number = "+d.atmNumber);
	
	System.out.println("Phone Number = "+d.phoneNumber);
	
	System.out.println("Employee Code = "+d.empCode);
	
	System.out.println("Net Salary = "+d.netSalary);
	
	System.out.println("My initial  " +d.initial);
	
	 System.out.println("Above mentioned information are "+ d.allDetails);
		

	}

}
