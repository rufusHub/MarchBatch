package RodrigoPackage2;

public class Child_class_1 extends Parent_class_1
{ 
	public Child_class_1() {
		this(0, 0);
		System.out.println("Child DEFAULT constructor");
	}
	public Child_class_1(int x1) {
		this();
		System.out.println("Child ONE paremeterized constructor");
	}
	public Child_class_1(int x1, int x2) {
		super(0);
		System.out.println("Child TWO paremeterized constructor");
	}
	public Child_class_1(int x1, int x2, int x3) {
		this(0);
		System.out.println("Child THREE paremeterized constructor");
	}
	public static void main(String[] args) {
		Child_class_1 obj = new Child_class_1(0,0,0);
		
	}
}
