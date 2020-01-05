package loops;

public class Interface_test implements	Interface_1,Interface_2  {
				public void display() {
					System.out.println("hi parant 1");
				}
				
				public void display1() {
					System.out.println("hi parant 2");
				}
	public static void main(String[] args) {
		Interface_test obj =new Interface_test();
		obj.display();
		obj.display1();
				
	}

}
