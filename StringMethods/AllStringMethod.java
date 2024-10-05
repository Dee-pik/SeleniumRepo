package StringMethods;

public class AllStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
//String methods
//1. length()
//2. equals
//3. equalsIgnorecase()
//4. Contains()
//5. CharAT Index()
//6. ToCharArry()
		
//length
		
String project = "Voyeger";
int length = project.length();
System.out.println(length);

//equals

String entity = "consolidated vij";
if(entity.equals(project)) {
System.out.println("Both String are same");
}else {
System.out.println("Both are not same");
}

//equalsIgnorecase

String Project1 = "Consolidated Vij";
if(Project1.equalsIgnoreCase(entity)) {
System.out.println("contents are same and equals ignore case");
}else {
	System.out.println("Contents are not same");
}

//contains

String moviw  = "Vranam aaiyam";
boolean contains = moviw.contains("ran");
System.out.println(contains);

//chatAT Index

String fruits  = "Green Apple";
char charAt = fruits.charAt(3);
System.out.println("Printing the char for the gv index : " + charAt);
		
//Tochar arrar

String veggies = "Drum stick";
char[] charArray = veggies.toCharArray();
for (int i = 0; i < veggies.length(); i++) {
	System.out.print(charArray[i]);
	System.out.println();
}
//Split
//replace
//replace all
//substring
//lower case
//upper case
//
	
	
	
//split
	String tour  = "Himachal pradesh";
	String[] split = tour.split(" ");
	for (int i = 0; i < split.length; i++) {
	
	
	System.out.print(split[i]);
	}
	System.out.println();
		
//replace ->>>> Replace the character
	
	String Tc ="FinahQ";
	String replace = Tc.replace('h', 'G');
	System.out.println(replace);
	
//replaceall> for replacing the strings
	
String song = "Iruvili unthu";
String replaceAll = song.replaceAll(song, "Iruvizhi unathu");
System.out.println(replaceAll);
		
//Substring	> It will print where the character has to start from

String project3 = "Maven projects are always the best projects";
String substring = project3.substring(6);
System.out.println(substring);
		
//Substring	> It will print where the character has to start from and end it

String git = "Cherry pick and master merge";
String substring2 = git.substring(0, 11);
System.out.println(substring2);
		
		
//TO UPPER CASE---->Convert Lowrcase into Uppercase

String grl = "Weni cutieeeee";
String upperCase = grl.toUpperCase();
System.out.println("Coverting UP to LC : "+upperCase);

//TO UPPER CASE---->Convert Lowrcase into Uppercase

String grl1 = "DEEPIKA RAJA";
String lowerCase = grl1.toLowerCase();
System.out.println("Coverting LC to UP : "+lowerCase);
		
		
		
		
		
		
		
		
		
	}

}
