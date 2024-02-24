import java.util.*;
import java.io.*;

public class sortingassignment4 {

	public static void main(String[] args) {
		// TODO Auto-genera	ted method stub
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = (int) (10 + 90*Math.random());
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			int ind1 = (int) (10*(Math.random()));
			int ind2 = (int) (10*(Math.random()));
			int hold = arr[ind1];
			arr[ind1] = arr[ind2];
			arr[ind2] = hold;
		}
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}

}
