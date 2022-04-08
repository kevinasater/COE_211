

import java.io.*;  
import java.util.Scanner;
public class ExpensesTracker{
    public static void main (String[] args) throws IOException {
        String answer;
        Scanner scan = new Scanner(System.in);
        FileWriter fw = new FileWriter(new File("expenses.txt"));
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter ot = new PrintWriter(bw);

        double payment;
        String purchase;
        
        do {


            System.out.println("Input your name: ");
            String name = scan.nextLine();
            System.out.println("What did you purchase?");
            purchase = scan.nextLine();
            System.out.println("How much did you pay ? (in USD)");
            payment = scan.nextDouble();
            
            
            ot.println(name + " purchased " + purchase + " for " + payment + " US Dollars ");


            System.out.println("Would you like to log another purchase? (y/n)");
            scan.nextLine();
            answer= scan.nextLine();

        } 
        while (answer.equals("y"));


        System.out.println("Get off of ZoodMall!");
        System.out.println("Would you like to read a summary of your purchases? (y/n)");
        String answer1 = scan.nextLine();
        scan.close();
         ot.close();
         
         if (answer1.equals("y")) {
             Scanner fileScan = new Scanner(new File("expenses.txt"));
             String url;
                     while (fileScan.hasNext()) {
                         url = fileScan.nextLine();
                         System.out.println(url);
                     }
          }


}}
