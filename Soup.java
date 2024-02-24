import java.util.*;

public class Soup implements Comparable{
	private ArrayList<String> ingredients;
	private String soupname;
	private int hotness_level;
	
	public Soup(String mysoup, int myhot, ArrayList<String> myingredients) {
		this.soupname = mysoup;
		this.hotness_level = myhot;
		this.ingredients = myingredients;
	}
	
	public void addingred(String newing) {
		this.ingredients.add(newing);
		System.out.println("added " + newing + " to " + this.soupname);
	}
	
	public void boil(int inc) {
		this.hotness_level += inc;
		System.out.println(this.hotness_level);
	}
	
	public boolean equals(Soup otherDog) {
		if (this.soupname.equals(otherDog.soupname) && this.hotness_level == otherDog.hotness_level)
			return true;
		return false;
	}
	
	public boolean isempty() {
		return this.ingredients.isEmpty();
	}
	
	public void resetsoup() {
		while(!this.ingredients.isEmpty()) {
			this.ingredients.remove(0);
		}
		System.out.println("Soup has been emptied.");
	}
	
	public static void main(String[] args) {
		ArrayList<Soup> soups = new ArrayList<Soup>();
		ArrayList<String> tomatosoup = new ArrayList<>(Arrays.asList("tomato", "cream", "onion", "basil", "garlic"));
		
		Soup newsoup = new Soup("tomato soup", 10,tomatosoup);
		newsoup.boil(2);
		
		newsoup.resetsoup();
		System.out.println(newsoup.isempty());
		soups.add(newsoup);
		
		ArrayList<String> clamchowder = new ArrayList<>(Arrays.asList("cream", "potato", "onion", "butter", "celery"));
		Soup newsoup2 = new Soup("clam chowder", 15, clamchowder);
		newsoup2.addingred("clam");
		soups.add(newsoup2);
		
		ArrayList<String> onion = new ArrayList<>(Arrays.asList("onion", "water"));
		Soup newsoup3 = new Soup("onion soup", 10, onion);
		soups.add(newsoup3);

		for(Soup s : soups) System.out.print(s.soupname + " ");
		Collections.sort(soups);
		System.out.println();
		for(Soup s : soups) System.out.print(s.soupname+ " ");
	}

	@Override
	public int compareTo(Object other) {

		Soup otherSoup = (Soup) other;
		return this.soupname.compareTo(otherSoup.soupname);
	}
}

