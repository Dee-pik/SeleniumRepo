package ListPackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NewListPract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List<String> projects = new ArrayList<String>();
		//add the project name
		
		projects.add("Skopick");
		projects.add("Wattawow");
		projects.add("ESYGO");
		projects.add("Happy close");
		projects.add("Vital Radiology");
		
		System.out.println(projects);
		
//bind new value from existing and add new
		
		projects.add(1, "WOW Web");
		System.out.println(projects);
		
//conatisns
boolean contains = projects.contains("Happy close");
System.out.println(contains);
		
//get the index of

String string = projects.get(4);
System.out.println(string);

//remove

projects.remove(2);
System.out.println(projects);
		
		
Collections.sort(projects);
System.out.println(projects);

//for printing all project indiviually

for (int i = 0; i < projects.size(); i++) {
	String string2 = projects.get(i);
	System.out.println(string2);
}
		
		
//clear all

projects.clear();
System.out.println(projects);
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
