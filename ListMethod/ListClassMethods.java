package ListMethod;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListClassMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> Girls = new ArrayList<String>();
		
		Girls.add("Gill Grace Wenshiba");
		Girls.add("Jef agnes");
		Girls.add("Uma bharathi");
		Girls.add("Aishwarya");
		Girls.add("Gayathri");
		Girls.add("Swetha");
		Girls.add("Kavya");
		Girls.add("nandy");
		System.out.println(Girls);
		
		//
		Girls.add(6, "PoorVarsha");
		System.out.println(Girls);
		
		
		//contains
		boolean contains = Girls.contains("Kavya");
		System.out.println(contains);
		
		//Get
		
		Girls.get(6);
		System.out.println(Girls);
		
		Girls.remove(6);
		System.out.println(Girls);
		
		Collections.sort(Girls);
		System.out.println(Girls);
		
		for (int i = 0; i < Girls.size(); i++) {
			String string = Girls.get(i);
			System.out.println(string);
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
