package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccASS1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver accountCreate = new ChromeDriver();//intialize

accountCreate.get("http://leaftaps.com/opentaps/");//loaded URL

accountCreate.manage().window().maximize();// maximized the browser

accountCreate.findElement(By.name("USERNAME")).sendKeys("DemoSalesManager");//username

accountCreate.findElement(By.name("PASSWORD")).sendKeys("crmsfa");//Pw

accountCreate.findElement(By.className("decorativeSubmit")).click();// clicking login button

accountCreate.findElement(By.linkText("CRM/SFA")).click();// clicking CRM/SFA

accountCreate.findElement(By.linkText("Accounts")).click();//Accouts

accountCreate.findElement(By.linkText("Create Account")).click();// Create Acc

accountCreate.findElement(By.id("accountName")).sendKeys("TessaBea");//Name

accountCreate.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//Description

accountCreate.findElement(By.name("numberEmployees")).sendKeys("1");//creating a web element - can reuse the variable
	
accountCreate.findElement(By.className("smallSubmit")).click();// create acc button after selecting all values
		
String title=accountCreate.getTitle();	//get title
System.out.println(title);

if(title.contains("opentaps CRM")) { // checking whether failed or not
	System.out.println("Page verified successfully");
}else {
	System.out.println("Page verify failed");
}

accountCreate.close();//close browser	
		
	}

}
