package ictModule1;

import java.util.Scanner;

public class Fib {
	public static int element = 0;
	public static void main (String args[] ) {
		Scanner scnr = new Scanner(System.in);
		System.out.println("Input a Number:");
		int num = scnr.nextInt();
		int result = fibonacci(num);
		System.out.println("");
		System.out.println("The Fibonacci for " + num + " is " + result);
	}
	
	public static int fibonacci(int n) {
		if (n <= 1) {
			return n;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}
}
