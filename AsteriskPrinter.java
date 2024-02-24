
public class AsteriskPrinter {
	
	public static void printKStars(int k) {
		for(int i = 0; i < k; i++) {
			System.out.print("*");
		}
		System.out.println("");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i = 0; i < 9; i++) {
			printKStars(i);
		}
	}

}
