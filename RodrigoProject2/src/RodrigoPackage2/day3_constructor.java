package RodrigoPackage2;

public class day3_constructor {

	public day3_constructor(int a, int b, int c) {
		System.out.println("Three parameterized constructor");// TODO Auto-generated constructor stub
	}
	public day3_constructor() {
		this(1,2,3);
		System.out.println("Default constructor");// TODO Auto-generated constructor stub
	}
	public day3_constructor(int a, int b, int c, int d) {
		this();
		System.out.println("Four parameterized constructor");// TODO Auto-generated constructor stub
	}
	public day3_constructor(int a) {
		this(1,2,3,4);
		System.out.println("One parameterized constructor");// TODO Auto-generated constructor stub
	}
	public day3_constructor(int a, int b) {
		this(1);
		System.out.println("Two parameterized constructor");// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		day3_constructor obj = new day3_constructor(1, 2);
	}
}
