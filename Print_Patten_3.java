package loops;

public class Print_Patten_3 {

	public static void main(String[] args) {
		int val=3;		
		
		int space=(val*2)-2;
		
		for(int i=1;i<=val;i++) {
			//System.out.println();
	//---------------------------------------------left part
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
	//-------------------------------------------------spaces
			for(int l=1;l<=space;l++) {
				System.out.print(" ");
			}
	//----------------------------------------------right part
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			space=space-2;
			System.out.println();
		}
	}
}
