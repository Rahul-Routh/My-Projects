package loops;

public class Sum_of_even_and_odd_number {

	public static void main(String[] args) {
		int sum=0;
		int sum1=0;
		for(int i=1;i<=100;i++) {
			if(i%2==0){
				sum=sum+i;
			}else {
				sum1=sum1+1;
			}
		}
		System.out.println("Sum of Even Number 1 to 100 is   "+sum);
		System.out.println("Sum of Odd Number 1 to 100 is   "+sum1);
	}

}
