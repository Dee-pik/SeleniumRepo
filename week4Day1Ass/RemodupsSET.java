package week4Day1Ass;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemodupsSET {

	public static void main(String[] args) {

		
		int[] age = {23,45,34,12,45,67,89,90,76,43,67};
		
		Set<Integer> RemoveDups = new LinkedHashSet<Integer>();
	//	for (int i = 0; i < age.length; i++) {
			
		//}
		
		for(Integer data : age) {
			RemoveDups.add(data);
		}
		
		System.out.println(RemoveDups);
		
		
		
		
		
		
	}

}
