package Week1Day2;

public class FindMissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		//n=8
		//sum=n*(n+1)/2 =36;
		
		int [] missingNumber = {1,4,3,2,8,6,7};
		int a = missingNumber.length +1;
		
		int sum= a*(a+1)/2;
		for (int i = 0; i < missingNumber.length; i++) {
			sum = sum - missingNumber[i];
			
		}
		System.out.println("Missing number : " +sum);
	}
}
