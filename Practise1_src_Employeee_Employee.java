package Employeee;

/**
 * Create a class Employee with instance variables firstName, lastName,
 * employeeId and encpasulate the variables 
 * -Create setter and getter methods
 * -Create another class EmployeeTest with main() method 
 * -Create objects for the Employee class in the main() method and try to access the instance variables
 * using setters and getters -Try out how primitive data types works 
 * -Create a method and try to print out the default values for the instance varaibles
 * -Create and print a local Variable and see how it works 
 * -Work with the static
 * variables
 */

public class Employee {

	private String firstname, lastname;
	private int employeeId;

	public Employee() {

	}

	public Employee(String firstname, String lastname, int employeeId) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

}
