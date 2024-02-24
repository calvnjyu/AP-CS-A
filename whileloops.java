import java.util.*;

public class whileloops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int price = in.nextInt();
		int sum = 0;
		
		while(price != 0) {
			sum += price;
			price = in.nextInt();
		}
		System.out.println(sum);
	}

}
