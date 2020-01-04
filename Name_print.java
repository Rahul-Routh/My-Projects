package loops;
import java.util.*;
public class Name_print {
			String name;
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your Name = ");
		String name=sc.nextLine();
		System.out.print("how many time print "+name+" = ");
		int x=sc.nextInt();
		
		for(int i=0;i<x;i++) {
			System.out.println(name);
		}
		
	}

}
