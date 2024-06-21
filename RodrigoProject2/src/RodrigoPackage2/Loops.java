package RodrigoPackage2;

public class Loops {
	public static void main(String[] args) {
		
		// for loop
		for (int i=0; i<10; i+=1) {
			System.out.println("'for' value of i: " + i);
		}
		
		// while
		int a=0;
		while (a<10) {
			System.out.println("'while'value of a: " + a);
			a+=1;
		}
		
		//do-while
		int b=0;
		do {
			System.out.println("'do-while' value of b: " +b);
			b+=1;
		}while(b<10);
		
	}
	
}
