import java.util.Scanner;


public class EntryPoint {

	public static void main(String[] args) {
		int number;
		Scanner scn= new Scanner(System.in);
		String another;
		do {
		System.out.println("Which service would you like to use?\r\n"
				+ "[1]: Basic week visualizer\r\n"
				+ "[2]: Advanced week visualizer\r\n"
				+ "[3]: Basic calculator\r\n"
				+ "[4]: Employee repertoire\r\n"
				+ "");
		number=scn.nextInt();
		
		
		switch(number) {
		case(1):
		
		BasicWeek.printDays();
		break;
		
		case(2):
		AdvancedWeek.printDays1();
		break;	
		
		case(3):
		Calculator c= new Calculator();
		break;
		
		case(4):
		Employee e= new Employee();
		e.printinfo();
		break;
		
		default : System.out.println("Please make sure that the number is between 1 and 4.");
		}
		System.out.println("would you like to perform another operation? (y/n)");
		scn.nextLine();
		another=scn.nextLine();
	}
		while(another.equals("y"));
		scn.close();
}}

