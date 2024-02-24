import java.util.Scanner;

public class webassign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
		Scanner in = new Scanner(System.in);
		int wrong = 0;
		int right = 0;
		
		while(count < 10) {
			int a = (int) (10 * Math.random() + 1);		
			int b = (int) (10 * Math.random() + 1);
		System.out.println(a + " * " + b + " = ?");
			int input = in.nextInt();
			
			if(correct(a, b, input)) {
				count++;
				System.out.println("CORRECT");
				right++;
			} else {
				System.out.println("INCORRECT");
				count = 0;
				wrong++;
			}
		}
		in.close();
		System.out.println("Congratulations. You have finished the assignment. You got " + wrong + " questions wrong and " + right + " questions right.");
	}
	
	static boolean correct (int a, int b, int input) {
		return input == a*b;
	}
}
