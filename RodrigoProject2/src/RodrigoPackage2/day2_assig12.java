package RodrigoPackage2;

public class day2_assig12 {

	public int sum(int x, int y) {
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y; 
	}
	
	public int mult(int x , int y) {
		return x * y;
	}
	
	public void div(int x, int y) {
		System.out.println("Division result is: " + x/y);
	}
	
	public static void main(String[] args) {
		
		int var = 2;
		int varx = 10;
		
		day2_assig12 assg1 = new day2_assig12();
		int a = assg1.sum(varx, var);
		int b = assg1.sum(a, var);
		int c = assg1.sub(b, var);
		int d = assg1.mult(c, var);
		assg1.div(d, var);
		
		day2_assig12 assg2 = new day2_assig12();
		int e = assg2.mult(varx, var);
		int f = assg2.sum(e, var);
		int g = assg2.sub(f, var);
		int h = assg2.mult(g, var);
		assg2.div(h, var);
	}
}
