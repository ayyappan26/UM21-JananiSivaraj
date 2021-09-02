package remove.elements;

import java.util.ArrayList;

public class RemoveElements {

	public static void main(String[] args) {
		/*
		 * creating 2 arraylist objects
		 */
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		
		/*
		 * adding data in arraylist 1
		 */
		list1.add("Janani");
		list1.add("Vimal");
		list1.add("orange");
		list1.add("banana");
		
		
		/*
		 * adding data in arraylist 2
		 */
		list2.add("list2data01");
		list2.add("list2data02");
		list2.add("orange");
		list2.add("banana");
		
		/*
		 * removing elements from list1 specified in list 2 by using removeall method
		 */
		list1.removeAll(list2);
		System.out.println(list1);
		System.out.println("**********************************");
		System.out.println(list2);
		System.out.println("**********************************");
	}

}
