package RodrigoPackage2;

public class Parent_Class_2 {
	public Parent_Class_2() {
		this(0,0);
		System.out.println("Parent DEFAULT constructor");
	}
	public Parent_Class_2(int x1) {
		this();
		 System.out.println("Parent ONE paramererized constructor");
	}
	public Parent_Class_2(int x1, int x2) {
		System.out.println("Parent TWO paramererized constructor");
	}
	public Parent_Class_2(int x1, int x2, int x3) {
		this(0);
		System.out.println("Parent THREE paramererized constructor");
	}
	public static void main(String[] args) {
		Parent_Class_2 obj = new Parent_Class_2(0, 0, 0);
	}
	
}
