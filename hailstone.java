import java.io.*;
import java.util.Scanner;

public class hailstone {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int i = in.nextInt();
		System.out.println(i);
		
		while(i != 1) {
			if(i%2==1) {
				i *= 3;
				i += 1;
			} else {
				i /= 2;
			}
			System.out.println(i);
		}
	}

}
