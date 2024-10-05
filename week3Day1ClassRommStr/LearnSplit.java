package week3Day1ClassRommStr;

public class LearnSplit {

	public static void main(String[] args) {

		String Movie = "The Bate parkem Traingle";
		
		String[] split = Movie.split(" ");//on passing empty args it keyword of split (),It removes the space between the args
		
		for (int i = 0; i < split.length; i++) {
			System.out.print(split[i]);
			System.out.println(" ");
		}
		
		//if pass some args inside the method
		
		
		String veggies = "sand wichas";
		
		String[] split2 = veggies.split("a");
		
		for (int i = 0; i < split2.length; i++) {
			System.out.println(split2[i]);
		}
		
	}

}
