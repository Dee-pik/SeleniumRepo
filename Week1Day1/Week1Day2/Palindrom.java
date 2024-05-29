package Week1Day2;

public class Palindrom {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     
		
		int num = 121;
		int temp = 0;
		temp=num;
		
		int rev=0,rem;
	
				
			
while (num!=0) {
			
			rem = num%10; // 34343, 3434.3
			
			rev = rev *10 + rem;  // 0*10+3 ,0+3
			
			num = num/10;
		}
		
		if (rev==temp) {
			
			System.out.println(temp+ " is a Palindrome Number");
		}
		
		else {
	 
			System.out.println(temp+ " is a not Palindrome Number");
		}
	}

	}

