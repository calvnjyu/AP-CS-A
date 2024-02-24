import java.io.*;
import java.util.*;

public class sort5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[10];
		for(int i = 0; i < 10; i++) {
			arr[i] = (int) (10 + 90*Math.random());
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		
		selectionsort(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i = 0; i < 10; i++) {
			arr[i] = (int) (10 + 90*Math.random());
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubblesort(arr);
		
		for(int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static void selectionsort(int arr[]){
        int N = arr.length;
        
        for (int i = 0; i < N - 1; i++) {
            int min = i;
            
            for (int j = i+1; j < N; j++)
                if (arr[j] < arr[min]) min = j;
            
            swap(arr, min, i);        
            }
    }
	
	public static void bubblesort(int arr[]){
        int n = arr.length;
        
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (arr[j] > arr[j + 1]) {
                    swap(arr, j, j+1);
                }
    }

	public static void swap(int[] arr, int i, int j) {
		int hold = arr[i];
		arr[i] = arr[j];
		arr[j] = hold;
	}
}
