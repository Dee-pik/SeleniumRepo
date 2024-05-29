package Week1Day1;

public class IsPrimeNumber {

	
	static boolean number = false;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

			int a = 5;
			
			for (int i = 2; i < a/2; i++) {
				
			if(a%2==0) {
				//5%2==0 // reminder =1
				System.out.println("Not a prime number");
			     number = true;
			     break;
				}
			}
				if(!number) {
					System.out.println("Prime number");
				}
			}
}


