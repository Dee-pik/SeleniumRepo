package Week3Day1;

public class LoginTestData extends TestData {
	
	public void enterUserName() {
      System.out.println("This method is from child class - enter username : ");	
	}
	public void enterPassword() {
		System.out.println("This method is from child class - enter password:");
	}
      public static void main (String [] args) {
    	  
    	  LoginTestData out  = new LoginTestData();
    	  
    	  out.enterCredentials();
    	  out.navigateToHomePage();
    	  out.enterUserName();
    	  out.enterPassword();
      }

}
