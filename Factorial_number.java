package loops;
import java.util.*;
public class Factorial_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int x=sc.nextInt();
		int fact=1;
		for(int i=1;i<=x;i++) {
			fact=fact*i;
		}
		System.out.println("Factorial of "+x+" is "+fact);
	}
}
