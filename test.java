import java.util.ArrayList;
import java.util.Arrays;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> myData = new ArrayList<Integer>();
		int[] mydata2 = {2, 7, 5, 5, 5, 5, 6, 6, 3, 3, 3};
		for(int i : mydata2) {
			myData.add(i);
		}
		
		int k = 1;

		  while (k < myData.size())

		  {

		    if (myData.get(k).equals(myData.get(k - 1)))

		    {

		      myData.remove(k);

		    }

		    k++;

		  }
		  System.out.println(myData);
	}

}
