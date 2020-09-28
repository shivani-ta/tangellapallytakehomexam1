/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q10_addition;

/**
 *
 * @author Shivani tangellapally
 */
public class additionDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        addition A = new addition();

        A.AddVar(5, 6);
        System.out.println(A);

        A.AddVar(5, 6, 9);
        System.out.println(A);

        A.AddVar(5.0, 6.0);
        System.out.println(A);

        A.AddVar(5.0, 6.0, 7.0);
        System.out.println(A);

        A.AddVar("First", "Last");
        System.out.println(A);

        A.AddVar("First", "Middle", "Last");
        System.out.println(A);
    }

}
