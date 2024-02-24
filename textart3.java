import java.util.Scanner;

public class textart3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a word.");
		Scanner in = new Scanner(System.in);
		String s = in.nextLine();
		
		for(int i = 0; i < s.length(); i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print(s.charAt(i));
			}
			System.out.println();
		}
	}
}