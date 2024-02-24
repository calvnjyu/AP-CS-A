import java.util.Scanner;

public class textart1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number.");

		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		
		for(int i = n; i > 0; i--) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
