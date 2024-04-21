package RodrigoPackage2;

public class Child_class_2 extends Parent_Class_2
{ 
	public Child_class_2() {
		this(0);
		System.out.println("Child DEFAULT constructor");
	}
	public Child_class_2(int x1) {
		super(0, 0, 0);
		System.out.println("Child ONE paremeterized constructor");
	}
	public Child_class_2(int x1, int x2) {
		this();
		System.out.println("Child TWO paremeterized constructor");
	}
	public Child_class_2(int x1, int x2, int x3) {
		this(0, 0);
		System.out.println("Child THREE paremeterized constructor");
	}
	public static void main(String[] args) {
		Child_class_2 obj = new Child_class_2(0,0,0);
		
	}
}
