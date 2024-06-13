package Week3Day1;

public class LoginTestData extends TestData {//inherited from parent class
	
	public void enterUserName() {//created a method for enter username
      System.out.println("This method is from child class - enter username : ");	
	}
	public void enterPassword() {//created a method for enterPassWord
		System.out.println("This method is from child class - enter password:");
	}
      public static void main (String [] args) {
    	  
    	  LoginTestData out  = new LoginTestData();//creating a object to call tge method and inherit the method from other class
    	  
    	  out.enterCredentials();
    	  out.navigateToHomePage();
    	  out.enterUserName();
    	  out.enterPassword();
      }

}
