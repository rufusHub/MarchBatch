package RodrigoPackage2;

import java.util.Scanner;


public class day5_scanner {
	
	int cont;

	public int mult(int x, int y) {
		return x * y;
	}
	
	public int sum(int x, int y) {
		
		return x + y;
	}
	
	public int sub(int x, int y) {
		return x - y;
	}
	
	public void div(int x, int y) {
		System.out.println((float)x/y);
	}
	
	public int callValues() {
		cont +=1;
		System.out.println("Please enter values 'x" + cont + "': " );
		Scanner obj1 = new Scanner(System.in);
		int x = obj1.nextInt();
		return x;
		
	}
	
	public static void main(String[] args) {
	//Assig_1;
	System.out.println("Assignment_1");
	day5_scanner ob = new day5_scanner();	
	ob.cont = 0;
	int x1 = ob.callValues();
	int x2 = ob.callValues();
	int m = ob.mult(x1, x2);
	int x3 = ob.callValues();
	int s = ob.sum(m, x3);
	int x4 = ob.callValues();
	int r = ob.sub(s, x4);
	int x5 = ob.callValues();
	int s1 = ob.sum(r, x5);
	int x6 = ob.callValues();
	ob.div(s1, x6);
	
	//Assig_2;
	System.out.println("Assignment_2");
	ob.cont = 0;
	int y1 = ob.callValues();
	int y2 = ob.callValues();
	int rr = ob.sub(y1, y2);
	int y3 = ob.callValues();
	int ss = ob.sum(rr, y3);
	int y4 = ob.callValues();
	int mm = ob.mult(ss, y4);
	int y5 = ob.callValues();
	int rr1 = ob.sub(mm, y5);
	int y6 = ob.callValues();
	ob.div(rr1, y6);
	}
}
