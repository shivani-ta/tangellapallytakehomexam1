/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q07_distance;

import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class distance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double X1, X2, Y1, Y2;
        String Data;

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        Data = scan.nextLine();

        String SubStr = "";
        int i = 0;
        for (i = 0; i < Data.length() && Data.charAt(i) != ' '; i++) {
            if (Data.charAt(i) != ' ') {
                if (Data.charAt(i) != ',') {
                    SubStr += Data.charAt(i);
                }
            }
        }

        X1 = Math.toRadians(Double.parseDouble(SubStr));

        SubStr = "";
        for (i++; i < Data.length(); i++) {
            if (Data.charAt(i) != ' ') {
                SubStr += Data.charAt(i);
            } else {
                break;
            }
        }
        Y1 = Math.toRadians(Double.parseDouble(SubStr));

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        Data = scan.nextLine();

        SubStr = "";
        i = 0;
        for (i = 0; i < Data.length() && Data.charAt(i) != ' '; i++) {
            if (Data.charAt(i) != ' ') {
                if (Data.charAt(i) != ',') {
                    SubStr += Data.charAt(i);
                }
            }
        }

        X2 = Math.toRadians(Double.parseDouble(SubStr));

        SubStr = "";
        for (i++; i < Data.length(); i++) {
            if (Data.charAt(i) != ' ') {
                SubStr += Data.charAt(i);
            } else {
                break;
            }
        }
        Y2 = Math.toRadians(Double.parseDouble(SubStr));
        System.out.println("The distance between the two points is " + (6371.01 * Math.acos(Math.sin(X1) * Math.sin(X2) + Math.cos(X1) * Math.cos(X2) * Math.cos(Y1 - Y2)) + " km"));
    }
}
