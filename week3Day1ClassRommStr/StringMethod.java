package week3Day1ClassRommStr;

public class StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String project = "Happy close";
		int Totlen = project.length();
		System.out.println("Total length of char : ");
		
		//equals
		
		String fruits = "Green Apple";
		if (fruits.equals(project)) {
			
			System.out.println("Two string is equals ");
		}else {
			System.out.println("Two String are not equals :");
		}
		
		//equals ignore case
		
		String drug ="Green apple";
		if(drug.equalsIgnoreCase(fruits)) {
			System.out.println("Equals but ignore the case sensitive");
		}else {
			System.out.println("Not eqauls so no case sensitive");
		}
		
		//contains
		
		String Drygrape = "Strength";
        boolean contains = Drygrape.contains("Stren");
        System.out.println("This character contains the word : " + contains);
        
        
        //charat index
        
        String p1 = "Fina hQ";
        char charAt = p1.charAt(5);
        System.out.println("Prinr the index of char: " + charAt);
		
        
        //charat Sequence
        
        String Girl = "Gill Grace wenshiba";
        char[] printchar = Girl.toCharArray();
        for (int i = 0; i < printchar.length; i++) {
        System.out.print(printchar[i]);
	}
	}
}
