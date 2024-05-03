package RodrigoPackage2;

import java.util.Scanner;

public class day10_loops_conditions {
	public void assig1() {
		//swapping of two number using third variable
		System.out.println("enter to values x and y: ");
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
		int y = ob.nextInt();
		System.out.println("Initial values of x: " + x + " and y:" + y );
		
		int z=0;
		z = x;
		x = y;
		y = z;
		System.out.println("Final values of x: " + x + " and y:" + y );
		
	}
	
	public void assig2() {
		//swapping of two number without using third variable
		System.out.println("enter to values x and y: ");
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
		int y = ob.nextInt();
		System.out.println("Initial values of x: " + x + " and y:" + y );
		
		x = x ^ y ^ (y = x);
		
		System.out.println("Final values of x: " + x + " and y:" + y );
	}
	
	public void assig3() {
		// A number is prime or not
		System.out.println("enter to values x: ");
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
		
		for (int i=2 ; i<x ; ++i ) {
			if (x%i == 0) {
				System.out.println(x + " is NOT prime!");
				break;
			}
			else {
				System.out.println(x + " is prime!");
				break;
			}
			
		}
	}
	
	public void assig4() {
		// A number is palindrome
		System.out.println("enter to values x: ");
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
		
		int x_bk = x;
		int x_reverse=0;
		int length = String.valueOf(x).length();
		for (int i=0 ; i<length; ++i ) {
			x_reverse = x_reverse * 10  + x%10;
			x /= 10;
		}
		if (x_bk == x_reverse) {
			System.out.println("The number " + x_bk + " is palidrome.");
		}
		else {
			System.out.println("The number " + x_bk + " is NOT palidrome.");
		}
		
	}
	
	public void assig5() {
		// A number is Armstrong
		System.out.println("enter to values x: ");
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
	
		int x_bk = x;
		int s = 0;
		int length = String.valueOf(x).length();
		for (int i=0 ; i<length ; ++i) {
			s += (int)Math.pow(x%10, length);
			x /= 10;
		}
		if (s == x_bk) {
			System.out.println("The number " + x_bk + " is Armstrong.");
		}
		else {
			System.out.println("The number " + x_bk + " is NOT Armstrong.");
		}
	}
	
	public void assig7() {
		// Factorial of the number x
		System.out.println("enter to values x: ");
		Scanner ob = new Scanner(System.in);
		int x = ob.nextInt();
		
		int m=1;
		while(x>0) {
			m *= x;
			--x;
		}
		System.out.println(m);
	}
	
	public int assig8(int x) {
		// Fibonacci series
				
		if (x==0) {
			return 0;
		}
		else if ( x==1) {
			return 1;
		}
		else {
			return this.assig8(x-1) + this.assig8(x-2);	
		}
		
	}
	
	public void assig6() {
		//print table
		final Object[][] table = new String[4][];
		table[0] = new String[] {"Barack","Obama","President"};
		table[1] = new String[] {"Kate","Pery","Singer"};
		table[2] = new String[] {"Alan","Guth","Physicist"};
		table[3] = new String[] {"Cristian","Ronaldo","Footballer"};
		
		for (final Object[] row:table) {
			System.out.format("%15s%15s%15s%n", row);
		}
		
		
	}
	public static void main(String[] args) {
		day10_loops_conditions obj = new day10_loops_conditions();
//		obj.assig1();
//		obj.assig2();
//		obj.assig3();
//		obj.assig4();
//		obj.assig5();
//		obj.assig6();
//		obj.assig7();
//		System.out.println(obj.assig8(12));
	}
}

