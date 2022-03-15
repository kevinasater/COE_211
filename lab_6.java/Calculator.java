
import java.util.Scanner;
public class Calculator {
	private int num1;
    private int num2;
    private String operator;
    private String s;
    
    // Constructor to initialize the calculator
    public Calculator() {
        // Get user input
    	
        Scanner scanCalc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        num1= scanCalc.nextInt();
        System.out.println("Enter the operator");
        operator= scanCalc.next();
        System.out.println("Enter the second number: ");
        num2= scanCalc.nextInt();
        /**
         * Continue code here to ask for the first number, the operator, and the second number, IN THAT ORDER
         */
        
        // Decide on the operation to perform 
        /**
         * Insert code to decide on which function to call, based on the operator the user chose
         * Hint: Switch statement
         */
    
        switch (operator) {
        
        case "+":
   
    	int result = num1+num2;
    	System.out.println(num1 + "+" + num2 + "=" + result);
    	break;
    
        case "-":
    
    	int result1 = num1-num2;
    	System.out.println(num1 + "-" + num2 + "=" + result1);
    	break;
    
    	case"*":
    
    	int result2 = num1*num2;
    	System.out.println(num1 + "*" + num2 + "=" + result2);
    	break;
    
		case"/":
    
    	double e = num1/(double)num2;
    	System.out.println( num1 + "/" + num2 + "=" + (num1/(double)num2) );
    	break;
    	}}
        public String add(int a, int b) {
            operator="+";
            num1=a;
            num2=b;
           s = num1+operator+num2+ "="+(num1+num2);
            return (s);
            		
        }

        public String subtract(int a, int b) {
        	 operator="+";
             num1=a;
             num2=b;
            s=num1+operator+num2+ "="+(num1-num2);
             return (s);
        }

        public String multiply(int a, int b) {
        	 operator="*";
             num1=a;
             num2=b;
            s=num1+operator+num2+ "="+(num1*num2);
             return (s);
        }

        public String divide(int a, int b) {
        	 operator="/";
             num1=a;
             num2=b;
            s=num1+operator+num2+ "="+((double)num1/num2);
             return (s);
        }
    }


