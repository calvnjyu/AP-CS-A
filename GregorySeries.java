import java.io.*;
import java.util.*;

public class GregorySeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		double sum = 0;
		int index = in.nextInt();
		int minus = 1;
		
		for(int i = 0; i < index; i++) {
			sum += (double)4/(1 + i*2)*minus;
			minus *= -1;
		}
		System.out.println(sum);
	}

}
