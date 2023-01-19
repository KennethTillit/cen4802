package ictModule1;

import java.util.Scanner;

public class Fib {
	public static void main (String args[] ) {
		/**
		 * @author Kenny
		 * This sequence opens a scanner, then asks the user for a number.
		 * The number is then taken and uses the fibonacci method below.
		 * Once the fibonacci method is complete, the findings are printed
		 * out, including the original number, and the number representing
		 * it in the fibonacci sequence.
		 */
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input a Number:");
		int num = scnr.nextInt();
		int result = fibonacci(num);
		System.out.println("");
		System.out.println("The Fibonacci for " + num + " is " + result);
	}
	
	public static int fibonacci(int n) {
		/**
		 * @author Kenny
		 * This sequence is used to determine what number correlates to
		 * the number provided based on the fibonacci sequence.
		 * It takes the number given from the console, and return's n.
		 * It uses recursive means to determine the number.
		 * @param n
		 * @return n
		 */
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
