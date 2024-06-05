package Week2Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class deleteLead {

	
	public static void main(String[] args) throws InterruptedException {
	
ChromeDriver leadDelete = new ChromeDriver();//intialized
leadDelete.get("http://leaftaps.com/opentaps/");//passed URL
leadDelete.manage().window().maximize();//maximized

leadDelete.findElement(By.xpath("//p[@class='top']/input")).sendKeys("DemoSalesManager");//Parent to child Reltion/username
leadDelete.findElement(By.xpath("(//div[@id='form']//input)[2]")).sendKeys("crmsfa");//grandparent to Grand child/pw
leadDelete.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
leadDelete.findElement(By.linkText("CRM/SFA")).click();//Click CRM/SFA
leadDelete.findElement(By.linkText("Leads")).click();//Click Leads button
leadDelete.findElement(By.linkText("Find Leads")).click();//click find leads
leadDelete.findElement(By.xpath("//span[text()='Phone']")).click();//click Phone tab
leadDelete.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("200200200");//entered leads num
leadDelete.findElement(By.xpath("//button[text()='Find Leads']")).click();//Click Find leads

Thread.sleep(5000);//can see the page loading

leadDelete.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();//clicking the fist result
leadDelete.findElement(By.xpath("//a[text()='Delete']")).click();//click delete
leadDelete.findElement(By.linkText("Find Leads")).click();//click find leads
leadDelete.findElement(By.xpath("//span[text()='Name and ID']")).click();//name and id
leadDelete.findElement(By.name("id")).sendKeys("11964");//Search
leadDelete.findElement(By.xpath("//button[text()='Find Leads']")).click();//Click Find leads

String message = leadDelete.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
if (message.equals("No records to display")) {
	System.out.println("Lead deleted successfully");
} else {
	System.out.println("Lead not deleted");
}

leadDelete.close();


	}
}
