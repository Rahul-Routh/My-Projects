package loops;
import java.util.*;
public class Reverse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
			int x=sc.nextInt();
			int r,rev=0,temp=0;
			while(x!=0) {
				r=x%10;
				rev=rev*10+r;
				x=x/10;
			}
			System.out.println("The Reverse Number is "+rev);
	}
}
