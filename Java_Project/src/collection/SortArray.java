package collection;

import java.util.Arrays;
import java.util.Collections;

public class SortArray {

	public static void main(String[] args) {

		int arr[] = new int[5]; // declaration and instantiation
		arr[0] = 5; // initialization
		arr[1] = 8;
		arr[2] = 1;
		arr[3] = 4;

		// to print array
		System.out.println(Arrays.toString(arr));

		// to sort array
		Arrays.sort(arr);

		for (int i = 0; i < arr.length; i++)

			System.out.println(arr[i]);

		// to clone array
		int arr2[] = arr.clone();
		System.out.println(Arrays.toString(arr2));
		
		Integer a[] = {33,3,4,5}; // declaration, instantiation and initialization
		System.out.println(Arrays.toString(a));
		// to print array in reverse order data type should be Integer
		Arrays.sort(a, Collections.reverseOrder());
		System.out.println(Arrays.toString(a));
		
		String a2[] = {"akshay", "suraj", "umesh", "swapnil"};
		System.out.println(Arrays.toString(a2));
		Arrays.sort(a2);
		System.out.println(Arrays.toString(a2));
		Arrays.sort(a2, Collections.reverseOrder());
		System.out.println(Arrays.toString(a2));
		
	}

}
