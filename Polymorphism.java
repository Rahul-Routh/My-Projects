//------------------------------------------a program for polymorphism
package loops;

public class Polymorphism {
		void display() {
			System.out.println("Default Method");
		}
		void display(int x) {
			System.out.println("Only one Paramiter");
		}
		void display(int x,int y) {
			System.out.println("Two Paramiter");
		}
		void display(int x,float f) {
			System.out.println("Interger and Float");
		}
		void display(float f,double d) {
			System.out.println("Float and Double");
		}
	public static void main(String[] args) {
		Polymorphism po=new Polymorphism();
		po.display();
		po.display(5);
		po.display(5,6);
		po.display(7,4f);
		po.display(6f,4.1);

}

}
