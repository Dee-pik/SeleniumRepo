package week4Day1Ass;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDupsString {

	public static void main(String[] args) {

		
		
		String name = "Gill Grace Wenshiba";
		char[] charArray = name.toCharArray();
		String output =" ";
		
		
		Set<Character> dups = new LinkedHashSet<Character>();
		
	 for (Character i : charArray) {
		 dups.add(i);
		 output+=i;
		 
		
	}
		System.out.println(dups);
		
		
		
		
		
		
		
	}

}
