import java.util.Scanner;
import java.lang.NullPointerException;

public class SortArray {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int array[]= {15,25,97,41,78,63},total_count=6,counter,sum=0 ;
		float average;
		for (counter = 0 ; counter < total_count - 1; counter=counter+1)
		{
		for (int counter1 = 0 ; counter1 < total_count - counter - 1; counter1=counter1+1)
		{
		if (array[counter1] > array[counter1+1]) /* For decreasing order use < */
		{
		int swap_var        = array[counter1];
		array[counter1]   = array[counter1+1];
		array[counter1+1] = swap_var;
		}
		}
		}
		System.out.println("Below is the list of elements sorted in ascending order:");
		for (counter = 0; counter < total_count; counter=counter+1) {
		String str_array = Integer.toString(array[counter]);
		System.out.print(str_array);
		System.out.print("  ");
		sum +=array[counter];
		}
		average = sum/6;
		String str_average= Float.toString(average);
		String str_sum = Integer.toString(sum);
		System.out.println(" \nThe sum of this array is: "+str_sum);
		System.out.println("The average value of this array is: "+str_average);
		
		
		System.exit(0);
	}
}

	


