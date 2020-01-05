package loops;

public class Mutiplication_table_of_prime_number {

	public static void main(String[] args) {
		int x=10;									//--------------mutiplication table of prime number range 1-10
		for(int i=2;i<=x;i++) {
			int temp=0;
			for(int j=2;j<=i-1;j++) {
			if(i%j==0) {
				temp=temp+1;
			}
		}
		if(temp==0) {
				System.out.println(x+" * "+i+" = "+x*i);
		}
	}
	}
}
