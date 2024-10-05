package week3Day1ClassRommStr;

public class OneStringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	String movie = "KannaKanumkalangal";
	
	int count=0;
	for (int i = 0; i < movie.length(); i++) {
		if(movie.charAt(i)=='k') {
			count++;
		}
	}
		
		
	System.out.println(count);
			
		
	}

}
