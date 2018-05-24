package Employeee;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.setEmployeeId(1234);
		emp.setFirstname("Poorna");
		emp.setLastname("Sama");
		
		System.out.println("Employee Id: "+emp.getEmployeeId());
		System.out.println("Employee First Name: "+emp.getFirstName());
		System.out.println("Employee Last Name: "+emp.getLastname());
		
		System.out.println();
		//Using without setters, Using Constructor to pass the arguments..
		Employee emp1 = new Employee("Rahul", "Dravid",100 );
		System.out.println("Employee Id: "+emp1.getEmployeeId()+"\nEmployee First Name: "+emp1.getFirstName()+
					"\nEmployee Last Name: "+emp1.getLastname());

	}

}
