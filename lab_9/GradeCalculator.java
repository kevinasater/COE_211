import java.util.Scanner;

public class GradeCalculator {

	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		int sum=0;
		int[]array =new int[5];
		
		for(int i=0; i<5; i++) {
			System.out.println("input the grade of assignment "+(i+1));
			int NbofA= scan.nextInt();
			array[i] = NbofA;
			
		}
		
	System.out.println("input the number of attended labs ");
	int attendance= scan.nextInt();
	System.out.println("enter your midterm grade ");
	int midterm = scan.nextInt();
	
	for(int i=0; i<5; i++) {
		sum+= array[i];
	}
	double totA = ((double)sum/5)*0.3;
	double totAtt = ((double) attendance/7) *100 * 0.05;
	double totMid = midterm* 0.3;
	
	System.out.println("Assignment (30%): " + (int)totA);
	System.out.println("Attendance (5%) " + (int)totAtt);
	System.out.println("Midterm (30%); " + (int)totMid);
	
    int x= (int) ((80-(totA+ totAtt + totMid))/0.35);
	
    System.out.println("You need "+x+" points over 100 on the final to get B on this course.");
	}
}