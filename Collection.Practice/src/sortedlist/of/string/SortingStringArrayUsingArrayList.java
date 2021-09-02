package sortedlist.of.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingStringArrayUsingArrayList {

	public static void main(String[] args) {

		/*
		 * creating string array of elements
		 */
		String string_array[] = { "orange", "apple", "123", "*&^", "zebra" };
		/*
		 * converting string array to list
		 */
		List<String> list1 = Arrays.asList(string_array);
		/*
		 * printing the list of sting array
		 */
		System.out.println("before sorting");
		System.out.println(list1);
		/*
		 * sorting the list using Collections.sort(list)
		 */
		
		Collections.sort(list1);
		System.out.println("after sorting");
		System.out.println(list1);
	}

}
