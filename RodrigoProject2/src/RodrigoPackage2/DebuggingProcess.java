package RodrigoPackage2;

public class DebuggingProcess {
	
	int deepak;
	
	public void m1() {
		System.out.println("first line of method");
		System.out.println("second line of method");
	}
	
	public void m2() {
		System.out.println("third line...");
		System.out.println("fourth line...");
	}
	
	public static void main(String[] args) {
		System.out.println("first line of the main method");
		System.out.println("second line............");
		System.out.println("main method");
		DebuggingProcess d = new DebuggingProcess();
		d.deepak = 123;
		System.out.println(d.deepak);
		d.deepak = 44;
		System.out.println(d.deepak);
		d.m1();
		System.out.println("inside main method");
		d.m2();
		
				
	}
	
	
}
