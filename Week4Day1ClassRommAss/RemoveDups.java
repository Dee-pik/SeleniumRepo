package Week4Day1ClassRommAss;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "DeepikaRaja";
		char[] ch = name.toCharArray();
		String Result =" ";
		
		
		Set<Character>removedups = new LinkedHashSet<Character>();
		
		for(Character repeat : ch) {
			
			removedups.add(repeat);
			
			
		}
		System.out.println(removedups);
		for(Character repeat : removedups) {
			Result+=repeat;
		}
		
		System.out.println(Result);

	}

}
