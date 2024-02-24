import java.util.*;

import java.io.*;

public class wordle {
	public static final String ANSI_RESET = "\033[0m";
	public static final String ANSI_GREEN = "\033[0;32m";
	public static final String ANSI_YELLOW = "\033[0;33m";

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		ArrayList<String> arr = new ArrayList<>();
		Scanner reader = new Scanner(new File("5"));
		while(reader.hasNext()) {
			arr.add(reader.nextLine());
		}
//		System.out.println(arr.size());
		
		String answer = arr.get((int)(Math.floor(Math.random() * arr.size()))).toUpperCase();
//		System.out.println(answer);
		System.out.println("Welcome to knockoff Wordle ! Please enter a word !");
		System.out.println("The system will take your guesses and tell you which letters are in the right place. \n\"G\" = right place right letter, \"Y\" = right letter wrong place, and \" \" is wrong.");

		Scanner in = new Scanner(System.in);
		
		for(int i = 0; i < 6; i++) {
			String s = in.nextLine().toUpperCase();
			
			if(s.length() < 5 || s.length() > 5) {
				System.out.println("Please enter a new word ! That is too short or too long.");
				i--;
				continue;
			}
			
			int[] lettercount = new int[26];
			boolean[] chartru = new boolean[5];
			int count = 0;
			
			for(int j = 0; j < s.length(); j++) {
				if(s.charAt(j) == answer.charAt(j)) {
					chartru[j] = true;
					count++;
				} else {
					int a = (int) answer.charAt(j)-65;
					lettercount[a]++;
				}
			}
			
			if(count == 5) {
				System.out.println("CORRECT !");
				break;
			}
			String str = "";
			
			for(int j = 0; j < s.length(); j++) {
				if(chartru[j]) {
					str += "G";
				} else {
					int a = (int) s.charAt(j)-65;
					
					if(lettercount[a] > 0) {
						str += "Y";
						lettercount[a]--; 
					} else {
						str += " ";
					}
				}
			}
			
			System.out.println(str);
			if(5-i == 1) System.out.println("You have " + (5-i) + " attempt left.");
			else System.out.println("You have " + (5-i) + " attempts left.");
			
		}
		
		System.out.println("Sorry ! The answer was " + answer + ".");
		
	}

}
