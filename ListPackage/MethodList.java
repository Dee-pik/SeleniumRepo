package ListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> Testingteam = new ArrayList <String>();
		Testingteam.add("Mani Rajsekaran");
		Testingteam.add("Yuvaraj ganarsekaran");
		Testingteam.add("Sathesh kumar");
		Testingteam.add("Jagtheesh kumar");
		Testingteam.add("Reeshma fahed");
		
		
		System.out.println("List of member in Testingteam : " + Testingteam);
		
		//replce the one person and add my name 
				
		Testingteam.add(4, "Deepika Raja");
		
		
		System.out.println("List of member in Testingteam : " + Testingteam);

	// get name using indedx
		
		
		String string = Testingteam.get(4);
		
		System.out.println(string);
		
		
	//check whether contains deepika raja
		
		boolean contains = Testingteam.contains("Deepika Raja");
		System.out.println(contains);
		
		
		
	//remove>remove particular member
		
		Testingteam.remove(1);
		Testingteam.remove(4);

		System.out.println("Printing the list after removing a person : "+Testingteam);
	
		//Arranginf in order wise using collection.sort
		Collections.sort(Testingteam);
		System.out.println(Testingteam);
		
		
		//how to print individually
		
		for (int i = 0; i < Testingteam.size(); i++) {
			String string2 = Testingteam.get(i);
			System.out.println(string2);
			
		}
		
		//clear the list
		
		Testingteam.clear();
		System.out.println(Testingteam);
		
		
	}

}
