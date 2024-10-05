package Week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementusingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> arr1 = new ArrayList<Integer>();
		
		arr1.add(1);
		arr1.add(2);
		arr1.add(3);
		arr1.add(4);
		arr1.add(6);
		arr1.add(8);
		arr1.add(10);
		
		Collections.sort(arr1);
		
		System.out.println(arr1);
		
		for (int i = 0; i < arr1.size()-1; i++) {
			
		
		 Integer currentElement = arr1.get(i);
         Integer nextElement = arr1.get(i + 1);
         
         // Compare current element with the next element
         if (!currentElement.equals(nextElement)) {
             System.out.println("Current Element: " + currentElement + ", Next Element: " + nextElement);
             System.out.println("Current Element is not equal to Next Element");
         } else {
             System.out.println("Current Element: " + currentElement + ", Next Element: " + nextElement);
             System.out.println("Current Element is equal to Next Element");

		
		
		}
		
		
		}
		}
		
		
	}


