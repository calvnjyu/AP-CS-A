import java.util.ArrayList;
import java.util.Scanner;

public class spellingbee {
	public static void main(String[] args) {
		String letters = "abcdefghijklmnopqrstuvwxyz";
		ArrayList<String> lettersArray = new ArrayList<>();
		for (int i = 0; i < letters.length(); i++) { //create arraylist of alphabetic chars
			lettersArray.add(letters.substring(i,i+1));
		}
		
		int number = 0;
		ArrayList<String> sevenLetters = new ArrayList<String>();		
		for (int k = 0; k < 7; k++) { //make arraylist of seven letters
			number = (int)(Math.random()*(25-0));
			sevenLetters.add(lettersArray.get(number));
		}
		
		String special_letter = "";	
		int special_index = (int)(Math.random()*(6-0)); //generate index of special letter
		special_letter = sevenLetters.get(special_index); //special number
		
		System.out.println(sevenLetters);
		System.out.println("The letter you must include is: " + special_letter);
	
        ArrayList<String> responses = new ArrayList<String>(); //arraylist for user inputs
        Scanner kboard = new Scanner(System.in);
        
        //need to add text for rules
		System.out.println("Make a word with these letters, "
				+ "including the special letter. "); 
		System.out.println("Enter end when you are finished."); //instructions
		
		boolean end = false; //to end the while for inputs
		while(!end) {
			String str = kboard.nextLine();
			if (str.equals("end")) {
				end = true;
			} else {
				if(!responses.contains(str)) { //no duplicates
					responses.add(str); //add
				}
			}
		}
	
		for (int j = 0; j < responses.size(); j++) { //modify responses array
			boolean letter_does_not_exist_in_array = true;
			boolean special_letter_exists = false;
			String word = responses.get(j);
			for (int n = 0; n < word.length(); n++) { //check chars of each word
				if(word.substring(n, n+1).equals(special_letter)) { //check for special letter in response
					special_letter_exists = true;
				} 
				if (sevenLetters.contains(word.substring(n, n+1))) { //check if char at n exists in the sevenLetters arraylist
					letter_does_not_exist_in_array = false;
				} 
			}
			if (letter_does_not_exist_in_array == true || special_letter_exists == false) {
				responses.remove(j); //remove if contains letter not given or doesn't contain special letter
			}

		}
		
		//points
		int count_letters = 0;
		int points = 0;
		for (int j = 0; j < responses.size(); j++) { 
			ArrayList<String> responseChars = new ArrayList<String>(); //arraylist for chars of a response
			
			String word = responses.get(j);
			for (int n = 0; n < word.length(); n++) {
				responseChars.add(word.substring(n, n+1)); //add characters of one response into arraylist	
				count_letters++;
			}
			
			boolean containsAll = true; //response has all 7 characters
			for(String s : sevenLetters){ //check if all seven letters are used at least once
				if(responseChars.contains(s)){
				   
				} else {
					containsAll = false;
				}
			}
			
			if (count_letters == 4) { //1 points for 4 lettered words
				points += 1;
			} else { //as many points as letters in the word
				points += count_letters;
			} if (containsAll == true) { //if all letters are used, + extra 7
				points += 7;
			}
			count_letters = 0; //reset
		}
		
		System.out.println("These were your valid answers: " + responses);
		System.out.println("You earned " + points + " points.");
	}
	
	
}