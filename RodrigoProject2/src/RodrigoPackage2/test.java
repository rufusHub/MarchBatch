package RodrigoPackage2;


public class test {

		float f;
		
		public void m1() {
			System.out.println("This is m1");
		}
		
		public void m2() {
			System.out.println("This is m2");
		}
		
		public test() {
			this.m1();
			this.m2();
			System.out.println("This is m3");
		} 
		
		public static void main(String[] args) {
			test obj = new test();
			obj.f = 12.78F;
			System.out.println("value of 'f': " + obj.f);
		}
}
