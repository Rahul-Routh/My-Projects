
//------------------------program for ordering the accessibility of normal block, static block, constructor, method.

package loops;

public class Block_Constructor_Method {
	{
		System.out.println("Normal Block");
	}
	static {
		System.out.println("Static block");
	}
	Block_Constructor_Method(){
		System.out.println("Constructor");
	}
	void display() {
		System.out.println("Method");
	}
	public static void main(String[] args) {
		Block_Constructor_Method obj=new Block_Constructor_Method();
		obj.display();

	}

}
