package RodrigoPackage2;

import java.util.Scanner;

public class Conditions {
	public static void main(String[] args) {
		System.out.println("Please enter a value of a: ");
		Scanner obj = new Scanner(System.in);
		int a = obj.nextInt();
		
		// ************
		// if - if/else
		// ************
		if(a%2 == 0) {
			System.out.println("Number is even: " + a);
		}
		else {
			System.out.println("number is odd: " + a);
		}
		
		// ***********
		// else if
		// ***********
		System.out.println("Please enter a value of marks");
		Scanner obj2 = new Scanner(System.in);
		int marks = obj2.nextInt();
		
		if (marks>=0 && marks<35) {
			System.out.println("Failed......" + marks);
		}
		else if (marks>=35 && marks<60) {
			System.out.println("Pass......" + marks);
		}
		else if (marks>=60 && marks<80) {
			System.out.println("First division...." + marks);
		}
		else if (marks>=80 && marks<=100) {
			System.out.println("Merit...." + marks);
		}
		else {
			System.out.println("Please enter correct marks");
		}		
		
		// *******
		// nested
		// *******
		System.out.println("Please enter a value of a: ");
		Scanner obj3 = new Scanner(System.in);
		int b = obj.nextInt();
		
		if(b>0) {
			if (b%2 == 0) {
				System.out.println("Even number...");
			}
			else {
				System.out.println("Odd number...");
			}
		}
		else {
			System.out.println("Please enter a +ve number.");
		}
		
		// *******
		// case
		// *******
		System.out.println("Please enter a value of x and y: ");
		Scanner obj4 = new Scanner(System.in);
		int x = obj4.nextInt();
		int y = obj4.nextInt();
		System.out.println("Enter operator: ");
		int op = obj4.nextInt();
		
		int result;
		switch(op) {
		case 1:
			 result = x + y;
			 System.out.println("Result is: " + result);
			break;
		case 2:
			 result = x - y;
			 System.out.println("Result is: " + result);
			break;
		case 3:
			 result = x * y;
			 System.out.println("Result is: " + result);
			break;
		case 4:
			 result = x / y;
			 System.out.println("Result is: " + result);
			break;
		default:
			System.out.println("Enter valid operator");
			break;
		}
		
	}
}
