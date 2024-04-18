package RodrigoPackage2;

public class day6_thisKeyword {
	
	public void m1(int x) {
		System.out.println("This is ONE paramererized");
	}
	
	public void m2(int x1, int x2) {
		System.out.println("This is TWO paramererized");
	}
	
	public void m3(int x1, int x2, int x3) {
		System.out.println("This is THREE paramererized");
	}
	
	public void m4(int x1, int x2, int x3, int x4) {
		System.out.println("This is FOUR paramererized");
	}
	
	public void m5() {
		this.m3(0, 0, 0);
		System.out.println("This is DEFAULT");
		this.m1(0);
		this.m2(0, 0);
		this.m4(0, 0, 0, 0);
	}
	
	public static void main(String[] args) {
		day6_thisKeyword obj = new day6_thisKeyword();
		obj.m5();
	}
}
