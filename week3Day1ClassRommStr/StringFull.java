package week3Day1ClassRommStr;





public class StringFull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//String -> length
		
		String project = "Happy close";
		int length = project.length();
		System.out.println("Total length of string : " + length);
		
		//Equals->comparing both strings
		
		String project2 = "Vital Radiology";
		if(project.equals(project)) {
			System.out.println("Equal");
		}else {
			System.out.println("Not Equals");
		}
		
//equals ignore case -> compare bot string and ignore the case senstive
		
	String Testing  = "Vital RADIOlogy";
	if(Testing.equalsIgnoreCase(project2)) {
		System.out.println("Contents are equals and ignoring the case sensitive");
	}else {
		System.out.println("Contents are not same and ignoring case sensitive");
	}
		
//contains>Check whether string contains the char or not in boolean
	
	String sex = "female";
	boolean contains = sex.contains("fem");
	System.out.println(contains);
	
//charAt Index> Get the index of the given character
	
String dry = "chai seeds";
char charAt = dry.charAt(2);
System.out.println("Get the char for the index : " + charAt);
	
//tochar Array

String tour = "Himachal pradesh";
char[] charArray = tour.toCharArray();
for (int i = 0; i < charArray.length; i++) {
	System.out.print(charArray[i]);	
}

System.out.println();

//split() > remove the gap between two gaps

String Girl = "Gill Grace wenshiba";
String[] split = Girl.split(" ");
for (int i = 0; i < split.length; i++) {
	System.out.print(split[i]);
}

System.out.println();


//replace

String game = "Bingoes";
String replace = game.replace('o', ' ');
System.out.println("This char replce that char : " + replace);
		
//replce all

String food = "Fish gravy";
String replaceAll = food.replaceAll("gravy", "fry");
System.out.println(replaceAll);
		
//Sub string   > M1

String Homepage = "Welcome to Test Automation";
String substring = Homepage.substring(11);
System.out.println(substring);
		
//Sub string   > M1

String H1 = "welcome to Testleaf";
String substring2 = H1.substring(0, 11);
System.out.println(substring2);

//to uppercase

String study ="twelth standard";
String upperCase = study.toUpperCase();
System.out.println(upperCase);
		
		
//to lowercase

String study1 ="TENTH standard";
String lowerCase = study1.toLowerCase();
System.out.println(lowerCase);		
		
		
	}
	
}
