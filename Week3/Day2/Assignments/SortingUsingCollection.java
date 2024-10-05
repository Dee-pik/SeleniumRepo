package Week3.Day2.Assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<String> companies = new ArrayList<String>();//implementation class for collection of list
		
		companies.add("HCL");//companies has been added
		companies.add("Wipro");
		companies.add("Aspire system");
		companies.add("CTS");
		
		Collections.sort(companies);//using collections.sort>can sort the array
		for (int i = companies.size()-1; i>=0; i--) {
            System.out.print(companies.get(i) + " ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
