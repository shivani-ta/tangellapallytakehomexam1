/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q08_math;

import java.util.Random;

/**
 *
 * @author Shivani tangellapally
 */
public class math {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic herepublic static void main(String[] Args) {

		System.out.println(Math.sqrt(4));
		System.out.println(Math.sin(2 * Math.PI));
		System.out.println(Math.cos(2 * Math.PI));
		System.out.println(Math.pow(2, 2));
		System.out.println(Math.log(Math.E));
		System.out.println(Math.exp(1));
		System.out.println(Math.max(2, Math.min(3, 4)));
		System.out.println(Math.rint(-2.5));
		System.out.println(Math.ceil(-2.5));
		System.out.println(Math.floor(-2.5));
		System.out.println(Math.round(-2.5f));
		System.out.println(Math.round(-2.5));
		System.out.println(Math.rint(2.5));
		System.out.println(Math.ceil(2.5));
		System.out.println(Math.floor(2.5));
		System.out.println(Math.round(2.5f));
		System.out.println(Math.round(2.5));
		System.out.println(Math.round(Math.abs(-2.5)));

		// 8.2 True or false? The argument for trigonometric methods is an angle in
		// radians.
		// True

		// 8.3 Write a statement that converts 47 degrees to radians and assigns the
		// result to a variable.
		double Var = Math.toRadians(47);
		System.out.println(Var);

		// 8.4 Write a statement that converts π/7 to an angle in degrees and assigns
		// the result to a variable.
		Var = Math.toDegrees(Math.PI / 7);
		System.out.println(Var);

		/*
		 * 8.5 Write an expression that obtains a random integer between 34 and 55.
		 * Write an expression that obtains a random integer between 0 and 999. Write an
		 * expression that obtains a random number between 5.5 and 55.5
		 */

		Random Rand = new Random();
		System.out.println(Rand.nextInt((55 - 34) + 1) + 34);

		System.out.println(Rand.nextInt(999));

		System.out.println(5.5 + (55.5 - 5.5) * Rand.nextDouble());

		// 8.6 Why does the Math class not need to be imported?
		// The Math class is the java.lang package. Any class in the java.lang package
		// is automatically imported. So there is no need to import it explicitly

		// 8.7 
		
		// What is Math.log(Math.exp(5.5))? 
		// This will get the exponent of 5.5 then do the log of the exponent of 5.5
		
		// What is Math.exp(Math.log(5.5))? 
		// This expression will compute log of 5.5 then compute the exponent of log of 5.5
		
		// What is Math.asin(Math.sin(Math.PI / 6))? 
		// This expression will compute PI / 6 then compute asin of the result and then again compute asin of the new result
		
		// What is Math.sin(Math.asin(Math.PI / 6))?
		// This expression will compute PI / 6 then compute asin of the result and then compute sin of the new result
    }
    
}
