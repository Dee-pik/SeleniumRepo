package week3Day1ClassRommStr;

public class StringPractices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//length
		
String project = "Happyclose";
int Totlen = project.length();
System.out.println("Total length of project character : " + Totlen);

//equals

String entity = " Standalone";
if(entity.equals(project)) {
	System.out.println("Entity equals to project");
}else {
	System.out.println("Entity not equals to project");
}

//equals ignorecase

String e1="Consolidated";
String e2= "Consolidated";
if(e1.equalsIgnoreCase(e2)) {
	System.out.println("Contents are same but case sensitive are ignored");
}else {
	System.out.println("Contents are not same and ignore the case sensitive");
}

//contains

String Apps = "Wattawow";
boolean contains = Apps.contains(Apps);
System.out.println(contains);

//charAt Index

String Dance = "Financial staments";
char charAt = Dance.charAt(3);
System.out.println(charAt);


//cHarAtsequ

String Ather = "Uber moto";
char[] charArray = Ather.toCharArray();
for (int i = 0; i < charArray.length; i++) {
System.out.print(charArray[i]);	
}

}
}
