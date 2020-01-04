package loops;
import java.util.*;
public class Armstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number = ");
		int x=sc.nextInt();
		int r,sum=0,temp=x;
		while(x>0) {
			r=x%10;
			x=x/10;
			sum=sum+r*r*r;
		}
		if(temp==sum) {
			System.out.println("Its is Armstrong Number");
		}else {
			System.out.println("Its is not Armstrong Number");
		}
	}
}
