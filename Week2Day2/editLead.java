package Week2Day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class editLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

ChromeDriver editLead = new ChromeDriver();//Intialized the browser

editLead.get("http://leaftaps.com/opentaps/");// passef the URL
		
editLead.manage().window().maximize();//maximized

editLead.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));//implicit wait

editLead.findElement(By.id("username")).sendKeys("DemoSalesManager");//user name

editLead.findElement(By.id("password")).sendKeys("crmsfa");//password

editLead.findElement(By.className("decorativeSubmit")).click();//login button

editLead.findElement(By.linkText("CRM/SFA")).click();//CRMSFA

editLead.findElement(By.linkText("Leads")).click();// leads button

editLead.findElement(By.linkText("Create Lead")).click();//create lead

editLead.findElement(By.xpath("(//input[@name='companyName'])[2]")).sendKeys("Company Test ltd");//company name

editLead.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Deepka");//firstname

editLead.findElement(By.xpath("(//input[@name='lastName'])[3]")).sendKeys("Raja");//lastname

editLead.findElement(By.xpath("//input[@name='firstNameLocal']")).sendKeys("Deep");//firstname(Local)

editLead.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("RajaDuraisamy");//last local name

editLead.findElement(By.xpath("//input[@name='departmentName']")).sendKeys("QA Team");//Department

editLead.findElement(By.xpath("//textarea[@id='createLeadForm_description']")).sendKeys("This is QA team and we are practicing the xpath");// create a descrption

editLead.findElement(By.xpath("(//input[@name='primaryEmail'])[4]")).sendKeys("Deepikatest@mail.com");//entered an email address

WebElement  province = editLead.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));//creating a web element - can reuse the variable
Select Newyork = new Select(province);// creating object for select element
Newyork.selectByVisibleText("New York");// call the method

editLead.findElement(By.name("submitButton")).click();//create lead

editLead.findElement(By.linkText("Edit")).click();//edit

editLead.findElement(By.id("updateLeadForm_description")).clear();//cleared the descrption

editLead.findElement(By.id("updateLeadForm_importantNote")).sendKeys("QA Team should know the Importance of Testing");//Important note

editLead.findElement(By.xpath("(//input[@class='smallSubmit'])[1]")).click();//clicked on update

String title = editLead.getTitle();// get current page title
System.out.println(title);

editLead.quit();// quiting the browser
		
		
		
		
	}

}
