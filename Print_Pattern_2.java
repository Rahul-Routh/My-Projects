package loops;

public class Print_Pattern_2 {

	public static void main(String[] args) {
		int val=5;
		int m=1;
			for(int i=1;i<val;i++) {
				
				
				for(int j=0;j<i;j++) {
					
					System.out.print(" "+m++);
					System.out.print(" ");
				}
				System.out.println();
			}
			}
}
