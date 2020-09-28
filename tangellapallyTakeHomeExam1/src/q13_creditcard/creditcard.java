/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package q13_creditcard;

import java.util.Scanner;

/**
 *
 * @author Shivani tangellapally
 */
public class creditcard {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       
System.out.println("Enter a credit card number as a long integer: ");
		Scanner scan = new Scanner(System.in);
		long C1 = scan.nextLong();
		System.out.println(C1 + " is " + (isValid(C1)?"valid":"invalid"));
	}

	/** Return true if the card number is valid */
	public static boolean isValid(long number) {
		if (getSize(number) == 16)
			if (prefixMatched(number, 4) || prefixMatched(number, 5) || prefixMatched(number, 37)
					|| prefixMatched(number, 6))
				if ((sumOfDoubleEvenPlace(number) + sumOfOddPlace(number)) % 10 == 0)
					return true;
		return false;
	}

	/** Get the result from Step 2 */
	public static int sumOfDoubleEvenPlace(long number) {
		int CountNum = 0;
		int Result = 0;
		while (number > 0) {
			if (CountNum % 2 == 0) {
				Result += getDigit((int) (number % 10));
			}
			CountNum++;
			number = number / 10;
		}
		return Result;
	}

	/**
	 * Return this number if it is a single digit, otherwise, return the sum of the
	 * two digits
	 */
	public static int getDigit(int number) {
		if (number > 9) {
			number = (int) (number / 10) + (number % 10);
		}
		return number;
	}

	/** Return sum of odd-place digits in number */
	public static int sumOfOddPlace(long number) {
		int CountNum = 0;
		int Result = 0;
		int Num = 0;
		while (number > 0) {
			if (CountNum % 2 == 1) {
				Result += getDigit(((int) (number % 10)) * 2);
			}
			CountNum++;
			number = number / 10;
		}
		return Result;
	}
        /** Return true if the digit d is a prefix for number */
	public static boolean prefixMatched(long number, int d) {
		return (getPrefix(number, 0)) == d;
	}
        /** Return the number of digits in d */
	public static int getSize(long d) {
		int CountNum = 0;
		while (d > 0) {
			CountNum++;
			d = d / 10;
		}
		return CountNum;
        }
        /**
	 * Return the first k number of digits from number. If the number of digits in
	 * number is less than k, return number.
	 */
	public static long getPrefix(long number, int k) {
		while (number > 10) {
			number = number / 10;
		}
        		return (number % 10);
        }
}
 