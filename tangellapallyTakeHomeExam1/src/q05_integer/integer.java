/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q05_integer;

import java.util.Scanner;
/**
 *
 * @author Shivani tangellapally
 */
public class integer {
   /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int Num1, Num2;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        Num1 = scan.nextInt();
        if (Num1 < 0 || Num1 > 8) {
            System.out.println("Number must be between 1 to 7");
            return;
        }

        System.out.print("Enter number 2: ");
        Num2 = scan.nextInt();
        if (Num2 < 0 || Num2 > 8) {
            System.out.println("Number must be between 1 to 7");
            return;
        }
        //for loop to pick numbers from 1 to 7
        for (int i = 1; i <= Num1; i++) {
            for (int j = 1; j <= Num2; j++) {
                System.out.println(i + " " + j);
            }
        }
        System.out.println("Total number of all combinations is: " + Num1 * Num2);
        scan.close();
    }
}
