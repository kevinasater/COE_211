


import java.util.Scanner;


public class Employee{
private String firstName, lastName;
private int age;
private double salary;

public Employee() {
	
	
	Scanner scan = new Scanner(System.in);

	// System.out moment
	
	// for loop time
	

	// Scanner moment
	System.out.println("Please input the employee's first name:");
	firstName = scan.nextLine();
	System.out.println("Please input the employee's last name:");
	lastName = scan.nextLine();
	System.out.println("Please input the employee's age:");
	age = scan.nextInt();

	System.out.println("Please input the employee's monthly salary:");
	salary = scan.nextDouble();
	scan.nextLine();
	// Final answer


	}
	
	
	public void printinfo() {
	System.out.println("Employee information: " + firstName + " " + lastName + ", " + age + ", " + salary );
	}
}
