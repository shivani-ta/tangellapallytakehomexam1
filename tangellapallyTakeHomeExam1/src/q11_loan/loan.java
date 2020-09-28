/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q11_loan;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Shivanitangellapally
 */
public class loan {
     /**
     * @param args the command line arguments
     */
    // TODO code application logic here
    private static double InterestRate;
    private static double LoanAmount;
    private static int Years;
    private static double MonthlyRate;
    private static double MonthlyPayment;
    private static int Months;
    private static Scanner Cin = new Scanner(System.in);

    public static void main(String[] Args) {

        System.out.print("Loan Amount: ");
        LoanAmount = Cin.nextDouble();

        System.out.print("Number of Years: ");
        Years = Cin.nextInt();

        System.out.print("Annual Interest Rate: ");
        InterestRate = Cin.nextInt() / 100.0;

        MonthlyRate = InterestRate / 12.0;

        Months = Years * 12;
        MonthlyPayment = (LoanAmount * MonthlyRate) / (1 - Math.pow(1 + MonthlyRate, -Months));

        double balance = LoanAmount;
        double interest;
        double principal;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("Monthly Payment: " + df.format(MonthlyPayment * 100 / 100.0));
        System.out.println("Total Payment: " + df.format(MonthlyPayment * 12 + Years * 100 / 100.0) + "\n");

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");
        for (int i = 1; i <= Months; i++) {
            interest = MonthlyRate * balance * 100 / 100.0;
            principal = MonthlyPayment - interest * 100 / 100.0;
            balance = balance - principal * 100 / 100.0;

            System.out.println(i + "\t\t" + df.format(interest) + "\t\t" + df.format(principal) + "\t\t" + df.format(balance));
        }
    }
}
