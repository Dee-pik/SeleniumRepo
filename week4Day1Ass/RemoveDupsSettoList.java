package week4Day1Ass;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDupsSettoList {

	public static void main(String[] args) {

		
		int [] d1 = {12,23,45,67,78,98,12,43,46,65,78};
		
		
		Set<Integer> dups = new LinkedHashSet<Integer>();
		
		//for (int i = 0; i < age.length; i++) {
			
		//}
		
		
			for (Integer data : d1) {
				dups.add(data);
				
			}
		
		System.out.println(dups);
	

	//for printing the index value after removing the dups need to convert from sEt to List
	
List<Integer> value = new ArrayList <Integer>(dups);
	Integer i = value.get(2);
	System.out.println(i);
	
	}	
	
}
