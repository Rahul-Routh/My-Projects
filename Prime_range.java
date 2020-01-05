package loops;
import java.util.Scanner;
public class Prime_range {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number");
		int x=sc.nextInt();
		System.out.println("Prime Number is = ");
		for(int i=2;i<=x;i++) {
			int temp=0;
			for(int j=2;j<i-1;j++) {
					System.out.println("inside for loop"+j);
						if(i%j==0) {
							temp=temp+1;
							System.out.println("temp increase");
							break;
						}
				}
				if(temp==0) {
					System.out.println("inside temp loop");
					System.out.println(i);
					
				}else {
					temp=0;
					
					System.out.println("temp reset");
				}
		}
	}
}
