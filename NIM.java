import java.io.*;
import java.util.*;

public class NIM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		Scanner in = new Scanner(System.in);
		
		while(n > 1) {
			int rem = in.nextInt();
			n -= rem;
			System.out.println(n);
			
			if(n <= 3) {
				n -= (n-1);
				System.out.println(n);
				break;
			}
			int mysteryNum = (int) (3 * Math.random() + 1);		
			n -= mysteryNum;
			System.out.println(n);
		}
		
	}
	
	
}
