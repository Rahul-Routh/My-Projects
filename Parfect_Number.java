package loops;
import java.util.Scanner;;
public class Parfect_Number {
	public static void main(String[] args) {
			int i,sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter the Number is = ");
			int x=sc.nextInt(); 
			for(i=1;i<x;i++) {
				if(x%i==0) {
					sum=sum+i;	
				}
			}
			if(sum==x) {
					System.out.println(x+" is Perfect Number");
			}
			else {
				System.out.println(x+" is not Perfect Number");
			}
	}
}
