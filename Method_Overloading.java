package loops;

public class Method_Overloading {
		void sum( int a,int b) {
			System.out.println("the sum of "+a+"+"+b+" = "+ (a+b));
			System.out.println();
		}
		void sum(int a,int b,int c) {
			System.out.println("the sum of "+a+"+"+b+"+"+c+" = "+ (a+b+c));
		}
		public static void main(String args[]) {
			Method_Overloading obj=new Method_Overloading();
			obj.sum(5, 7);
			obj.sum(4, 5, 7);
		}
}
