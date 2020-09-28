/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
       package q01_errors;

/**
 *
 * @author Shivani tangellapally
 */
public class logic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Syntax error
        /*
	 * Syntax Errors are those errors which prevent the code from running because of
	 * an incorrect syntax such as a missing semicolon at the end of a statement or
	 * a missing bracket, class not found, etc.
         */
        // Runtime Error
        /*
	 * Run Time errors occur or we can say, are detected during the execution of the
	 * program. Sometimes these are discovered when the user enters an invalid data
	 * or data which is not relevant.
         */
        // Logical Error
        /*
	 * A logic error is when your program compiles and executes, but does the wrong
	 * thing or returns an incorrect result or no output when it should be returning
	 * an output.
         */
        // The below line is syntax error because of missing semi colon
        System.out.println("Hello World") 
        // The below line is run time error because number is not divisible by zero and
        // compiler does not know until we run the program
        System.out.println(12 / 0);

        String FirstName = "Name1";
        String LastName = "Name2";
        // The below line is logical error because we wanted to print first name before
        // the last name
        System.out.println(LastName + FirstName);
    }
}

   
    

