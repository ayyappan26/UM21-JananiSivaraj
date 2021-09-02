package Unique.Collection.And.Sorted.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
//import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueCollectionAndSortedOrder {

	public static void main(String[] args) {
		/*
		 * Declared and initialized String array with duplicate values which are not sorted 
		 */
		String elements[]= {"blue","apple","red","orange","red","blue"};
		/*
		 * converting String array to list so that we can put into Hashset
		 */
		List<String> elementlist=Arrays.asList(elements);
		
		/*
		 * converting list to hashset to delete the duplicates
		 */
		Set<String> LHS=new HashSet<String>();
		LHS.addAll(elementlist);
		/*
		 * printing the unique elements which are unsorted.
		 */
		System.out.println(LHS);
		System.out.println("*******************");
		/*
		 * converting Set to list so that we can get sorted elements.
		 */
		List<String> sortedlist=new ArrayList<String>(LHS);
		Collections.sort(sortedlist);
		System.out.println(sortedlist);
		

	}

}
