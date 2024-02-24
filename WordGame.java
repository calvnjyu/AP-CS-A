import java.util.*;

public class WordGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		ArrayList<String> random = new ArrayList<String>();
		
		System.out.println("Your choice of letters: ");
		for(int i = 0; i < 7; i++) {
			int randy = (int)(Math.random()*25) + 97;
			char c = (char) randy;
			
			random.add(Character.toString(c));
			System.out.print(c + " ");
		}
		System.out.println();
		
		int ind = (int)(Math.random()*7);
		System.out.println("Your must include letter: " + random.get(ind));
		
		boolean end = false;
		ArrayList<String> enter = new ArrayList<String>();
		
		System.out.println("Please enter your words now. Only lowercase please! Type \"STOP\" to stop.");
		while(!end) {
			String str = in.nextLine();
			if(str.equals("STOP")) {
				end = true;
			} else {
				if(!enter.contains(str)) {
					enter.add(str);
				}
			}
		}
		
		int scorecount = 0;
		
		for(String s : enter) {
			ArrayList<String> str = new ArrayList<>();
			
			for(int i = 0; i < s.length(); i++) {
				str.add(s.substring(i, i+1));
			}
			
			boolean contained = true;
			boolean has = false;
			for(int i = 0; i < s.length(); i++) {
				if(!random.contains(Character.toString(s.charAt(i)))) contained = false;
				if(random.get(ind).equals(Character.toString(s.charAt(i)))) has = true;
			}
			boolean total = contained && has;
			
			if(total) {
				boolean all = true;
				for(int i = 0; i < random.size(); i++) {
					if(str.contains(random.get(i))) {
						
					} else {
						all = false;
					}
				}
				if(all) scorecount+= 7;
				if(str.size() > 4) scorecount += str.size();
				else if(str.size() == 4) scorecount += 1;
			}
//			System.out.println(total);
		}
		System.out.println("You entered the answers: " + enter);
		System.out.println("You scored " + scorecount);
	}

}
