package simplepkg1;

import java.util.Scanner;

public class Javaconsole {
	  
    

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;  // ERROR!!!
	}

	public int divide(int a, int b) {
		return a / b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}
	
	public  static void main(String args[])
	  {
	  
		Scanner sc = new Scanner(System.in);
        
        /* Get the input of two variables */
        System.out.print("Enter the Two Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        /*
         * Call Function addition_two_numbers, subtraction_two_numbers,
         * multiplication_two_numbers, and division_two_numbers with two Parameters
         */
        Javaconsole myobj = new Javaconsole();
        myobj.sum(a, b);
        myobj.minus(a, b);
        myobj.divide(a, b);
        myobj.multiply(a, b);

        /* Display sum, Subtraction, Multiplication, and Division of two numbers */
             sc.close();
    
	  }
}
