/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q06_pentagon;

import java.text.DecimalFormat;
import java.util.Scanner;
/**
 *
 * @author Shivani tangellapally
 */
public class pentagondriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double Length, Side, Area;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the length from the center to a vertex: ");
        Length = scan.nextDouble();
        //area of the pentagon
        Side = 2 * Length * Math.sin(Math.PI / 5);
        Area = (5 * Math.pow(Side, 2)) / (4 * Math.tan(Math.PI / 5));

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println("The area of the pentagon is " + df.format(Area));
    }
}
