package Week1Day1;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 // fibonacci series { 0, 1, 1, 2, 3, 5, 8,  13}
		//0+1=1
		//1+1=2
		//2+1=3
		//3+2=5
		//5+8=13
		//13+8=21
			
		int no1 = 0;
		int no2 = 1;
		int total = 0;
		
		
		for (int i = 0; i<6; i++) {
			total=no1+no2;
			
			no1=no2;
			no2=total;
			
		System.out.println("Here is as fibonacci number : " + total);
		}
	}
}


