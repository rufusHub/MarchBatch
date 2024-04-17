package RodrigoPackage2;

public class day1_Student {

	int rollNo;
	
	int age;
	
	public void display_1() {
		System.out.println("Welcome to all of you");
	}
	
	public void display_2() {
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		day1_Student student = new day1_Student();
		student.rollNo = 20;
		student.age = 41;
		System.out.println("Roll numeber is: " + student.rollNo + " and age: " + student.age);
		student.display_1();
		student.display_2();
	}
}
