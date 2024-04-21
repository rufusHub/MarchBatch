package RodrigoPackage2;

public class Parent_class_1 {
	public Parent_class_1() {
		this(0,0,0);
		System.out.println("Parent DEFAULT constructor");
	}
	public Parent_class_1(int x1) {
		this(0, 0);
		 System.out.println("Parent ONE paramererized constructor");
	}
	public Parent_class_1(int x1, int x2) {
		this();
		System.out.println("Parent TWO paramererized constructor");
	}
	public Parent_class_1(int x1, int x2, int x3) {
		System.out.println("Parent THREE paramererized constructor");
	}
	public static void main(String[] args) {
		Parent_class_1 obj = new Parent_class_1(0);
	}
	
}
