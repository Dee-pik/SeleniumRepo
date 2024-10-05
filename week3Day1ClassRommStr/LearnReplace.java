package week3Day1ClassRommStr;

public class LearnReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   //length
		
		String name = "Gill grace wenshiba";
		int length = name.length();
		System.out.println(length);
		
		
	//equals
		
		String veggies = "Green veggies";
		if(veggies.equals(name)) {
			System.out.println("Equals");
		}else {
			System.out.println("Not Equals");
		}
	//equalsto
		
		String Movies = "Kanna kanum kalangal";
		if(Movies.equalsIgnoreCase(name)) {
		System.out.println("Equals & Ignored case");
		
		}else {
			System.out.println("Not Equlas & ignore case");
		}
	//charat index()
		
		String Task = "Testing";
		char index = Task.charAt(2);
		System.out.println("To know the Index : " +index);
		
		
	//charAt()
		
		String nature ="Rainfall season";
		char[] charArray = nature.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			System.out.print(charArray[i]);
		}
		
		System.out.println();
	//contains
		String Amma  = "Geetha";
		boolean contains = Amma.contains("Geeth");
		System.out.println(contains);
		
		
		
		
	//Split()
		
		
		String newton = "Third law";
		String[] split = newton.split(" ");
		for (int i = 0; i < split.length; i++) {
		System.out.print(split[i]);
		}
		
		System.out.println();
		
	//replace()
		
		String project = "Vitall Radiloge";
		String replace = project.replace('e','y' );
		System.out.println(replace);
		
	//replaceall()
		
		
		
		String launguage = "DEEpikaRaja70@gmail.Com";
		String replaceAll = launguage.replaceAll("[^a-z 0-9]", " ");
		System.out.println(replaceAll);
	
		
		
	
	//replace all ()
		String money = "Nivashraja70@gmail.com";//*interview ques
		
	    String replaceAll2 = money.replaceAll("[^A-z a-z]", "#"); //input string = "A2B3C4D5";
	    System.out.println(replaceAll2);
	     //Output  = "A#B#C#D";
		
		
		
		
		
		
	//substring
	    
	    String Homepage = "Welcome to test leaf application";
	    String substring = Homepage.substring(9);
	    System.out.println(substring);
	    
	    
	 //sub string method 2;
	    
	    String Module = "Leaf taps ground application is well and Good";
	    String substring2 = Module.substring(11, 18);
	    System.out.println(substring2);
	    
	    
	//to uppercase
	    
	    
	    String up = "deepika raja";
	    String upperCase = up.toUpperCase();
	    System.out.println(upperCase);
	//to lowercase
	    
	    String lc = "GILL GRACE WENSHIBA";
	    String lowerCase = lc.toLowerCase();
	    System.out.println(lowerCase);
		
	  //convert string to int
	    
	    String number = "2024";
	    int parseInt = Integer.parseInt(number);
	    System.out.println(parseInt);
		
		//one program
	    
	    
	    String project1 = "Gill Grace Wenshiba";
	    	int count =0;
	    	
	    	for (int i = 0; i < project1.length(); i++) {
	    		if(project1.charAt(i)=='G') {
	    			count++;
	    		}

			}
	    
			System.out.println(count);

	    
	    
	}

}
