package loops;
import java.util.*;
public class Prime_Number {
	public static void main(String[] args) {
			int temp=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the number = ");
			int x=sc.nextInt();
			if(x==0||x==1) {
				System.out.println(x+" is not prime");
			}else {
			for(int i=2;i<=x-1;i++) {
				if(x%i==0) {
						temp=temp+1;
				}
			}
			if(temp==0) {
				System.out.println(x+" is prime");
			}
			else{
				System.out.println(x+" is not prime");
			}
}
}
}
