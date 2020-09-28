/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q12_salary;

/**
 *
 * @author Shivani tangellapally
 */
public class sales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double TotalSales = 30000;
		double SalesAmount = 30000;
		double Percent = 8;
		double CommisionRate = 0;
		do {
			SalesAmount = 5000;
			TotalSales += SalesAmount;
			do {
				if (SalesAmount > 5000 && Percent < 12) {
					CommisionRate += 5000 * (Percent / 100);
					SalesAmount -= 5000;
				} else {
					CommisionRate += SalesAmount * (Percent / 100);
					SalesAmount = 0;
				}
				if (Percent < 12)
					Percent += 2;
			} while (SalesAmount > 0);
		} while (CommisionRate < 30000);

		System.out.println("Total Sale to achieve 30000 must be atleast = " + TotalSales);


    }
    
}
