package Week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecLargestnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(3);
		list.add(2);
		list.add(11);
		list.add(4);
		list.add(6);
		list.add(7);
		
		
	if(list.size()<2) {
	System.out.println("couldnt find");
	return;
	}
	Collections.sort(list);
	
	Integer Seclarnum = list.get(list.size()-2);
	
	System.out.println("This is sec larg numer :" +  Seclarnum);
		
		
		
		
		
		
		
		
		
	}

}
