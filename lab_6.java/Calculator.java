import java.util.Scanner;

public class Calculator {
	private int num1;
    private int num2;
    private String operator;
    
    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1= scanCalc.nextInt();
        System.out.println("Enter the second number: ");
        num2= scanCalc.nextInt();
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
        System.out.println("Enter the operator");
        operator= scanCalc.next();
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    
        switch (operator) {
        
        case (+):
    public String add(int a, int b) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Input the first number: ");
    	int num1 = scan.nextInt();
    	System.out.print("Input the second number: ");
    	int num2 = scan.nextInt();
    	scan.close();
    	int result = num1+num2;
    	System.out.println(num1 + "+" + num2 + "=" + result);
    	break;
    }
        case (-):
    public String subtract(int a, int b) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Input the first number: ");
    	int num1 = scan.nextInt();
    	System.out.print("Input the second number: ");
    	int num2 = scan.nextInt();
    	scan.close();
    	int result = num1-num2;
    	System.out.println(num1 + "-" + num2 + "=" + result);
    }

    public String multiply(int a, int b) {
    	Scanner scan = new Scanner(System.in);
    	System.out.print("Input the first number: ");
    	int num1 = scan.nextInt();
    	System.out.print("Input the second number: ");
    	int num2 = scan.nextInt();
    	scan.close();
    	int result = num1*num2;
    	System.out.println(num1 + "*" + num2 + "=" + result);
    }

    public String divide(int a, int b) {
    	Scanner scan = new Scanner(System.in);
    	System.out.println("Input the first number: ");
    	int a = scan.nextInt();
    	System.out.println("Input the second number: ");
    	int b = scan.nextInt();
    	if(a%b == 0) {
    	System.out.println( a + "/" + b + "=" + (a/b) );
    	} else {
    	double e = a/(double)b;
    	System.out.println( a + "/" + b + "=" + (a/(double)b) );
    	}
    }
}

