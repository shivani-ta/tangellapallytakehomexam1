/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q02_fan;

/**
 *
 * @author Shivani tangellapally
 */
import java.util.Scanner;

public class fandriver {

    private static Object F;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic hereFan F = new Fan();
        fan F = new fan();//create fan object
        //assigning speed,radius and color
        F.setColor("Red");
        F.setOn(true);
        F.setRadius(1.5);
        F.setSpeed(F.getMEDIUM());

        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Fan Color: ");
        F.setColor(scan.next());

        System.out.print("Enter Fan Radius: ");
        F.setRadius(scan.nextDouble());

        System.out.print("Enter Fan Speed: ");
        F.setSpeed(scan.nextInt());

        System.out.print("Enter Fan Status: ");
        F.setOn(scan.nextBoolean());

        System.out.println();
        System.out.println("Fan Color = " + F.getColor());
        System.out.println("Fan Radius = " + F.getRadius());
        System.out.println("Fan Speed = " + F.getSpeed());
        System.out.println("Fan is " + (F.isOn() ? "On" : "Off"));

        scan.close();

    }
}
