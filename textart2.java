import java.util.Scanner;

public class textart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Enter a number.");
		Scanner in = new Scanner(System.in);
		printstar(in.nextInt());
		
	}
	
	public static void printstar(int a) {
		int star = 0;
		int space = a;
		
		for(int i = 0; i <= a; i++) {
			for(int j = 0; j < space; j++) {
				System.out.print(" ");
			}
			space--;
			for(int j = 0; j < star; j++) {
				System.out.print("&");
			}
			System.out.print("&");
			for(int j = 0; j < star; j++) {
				System.out.print("&");
			}
			star++;
			System.out.println();
		}
	}
}
