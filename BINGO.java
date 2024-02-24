
public class BINGO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sing("Bingo", "B-I-N-G-O");
		sing("Bingo", "(clap)-I-N-G-O");
		sing("Bingo", "(clap)-(clap)-N-G-O");
		sing("Bingo", "(clap)-(clap)-(clap)-G-O");
		sing("Bingo", "(clap)-(clap)-(clap)-(clap)-O");
		sing("Bingo", "(clap)-(clap)-(clap)-(clap)-(clap)");
	}
	public static void sing(String name, String spelledname) {
		System.out.println("There was a farmer who had a dog,");
		System.out.println("And " + name + " was his name-o.");
		System.out.println(spelledname);
		System.out.println(spelledname);
		System.out.println(spelledname);
		System.out.println("And " + name + " was his name-o.");
	}

}
