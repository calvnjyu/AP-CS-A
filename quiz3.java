import java.util.ArrayList;

public class quiz3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> words = new ArrayList<String>();
		words.add("expect");
		words.add("exclamation");
		words.add("expert");
		words.add("expression");
		words.add("exception");
		words.add("excellence");
		words.add("examination");
		for(int k = 0; k < words.size(); k++) {
			if(words.get(k).charAt(2) == 'c') words.remove(k);
		}
		System.out.println(words.size());
	}

}
