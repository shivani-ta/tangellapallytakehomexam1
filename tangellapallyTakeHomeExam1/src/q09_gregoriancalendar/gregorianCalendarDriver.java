/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q09_gregoriancalendar;

/**
 *
 * @author Shivani tangellapally
 */
public class gregorianCalendarDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a GregorianCalendar object
        gregoriancalendar GC = new gregoriancalendar();
        //Display the current year, month, and day in format Mth/Day/Year
        System.out.print(GC.getMonth() + " ");
        System.out.print(GC.getDate() + ", ");
        System.out.print(GC.getYear());
        // elapsed time since January 1, 1970 to 1234567898765L
        System.out.println();
        GC.setDate(1234567898765L);

        System.out.print(GC.getMonth() + " ");
        System.out.print(GC.getDate() + ", ");
        System.out.print(GC.getYear());

    }

}
