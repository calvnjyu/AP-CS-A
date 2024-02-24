import java.util.Scanner;

public class datastructures0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String[] arr = new String[8];
		
		for(int i = 0; i < 8; i++) {
			String s = "";
			if(i == 1) {
				s = "B";
			} else if(i == 2) {
				s = "C";
			} else if(i == 3) {
				s = "D";
			} else if(i == 4) {
				s = "E";
			} else if(i == 5) {
				s = "F";
			} else if(i == 6) {
				s = "G";
			} else if(i == 7) {
				s = "H";
			} else if(i == 0){
				s = "A";
			}
			System.out.println("please enter your " + s + " block class");
			String ans = in.nextLine();
			arr[i] = ans;
		}
		
		System.out.println("Thank you for your input. Which day of the schedule would you like the week to start on?");
		int start = in.nextInt();
		System.out.println("Understood. Printing...");
		
	}

}
