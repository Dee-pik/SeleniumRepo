package Week3Day1;

public class LoginPage extends BasePage {//enetended Parent class
	
	
	public void performCommonTasks() {
     System.out.println("This is method is overrided from Parent to Child");//overrided
	}
	public static void main(String[] args) {//main method
		
		LoginPage children = new LoginPage();
		children.performCommonTasks();
		
	}
	

}
