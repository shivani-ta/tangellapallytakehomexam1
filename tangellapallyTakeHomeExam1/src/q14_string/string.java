/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q14_string;

import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class string {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String String1, String2;
        int Occurence = 0;

        System.out.print("Enter string 1: ");
        String1 = scan.nextLine();
        System.out.print("Enter string 2: ");
        String2 = scan.next();

        int index = 0;

        while (true) {
            index = String1.indexOf(String2, index);
            if (index != -1) {
                Occurence++;
                index += String2.length();
            } else {
                break;
            }
        }

        System.out.println("The number of occurrences of " + String2 + " in the above string are " + Occurence);

    }

}
