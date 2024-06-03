package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class createAccount {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

ChromeDriver leafTaps = new ChromeDriver();//intialized the chrom driver
	
leafTaps.get("http://leaftaps.com/opentaps/");//loaded URL
        
leafTaps.manage().window().maximize();// maximized the browser

leafTaps.findElement(By.id("username")).sendKeys("DemoSalesManager");//username

leafTaps.findElement(By.id("password")).sendKeys("crmsfa");//Pw

leafTaps.findElement(By.className("decorativeSubmit")).click();// clicking login button

leafTaps.findElement(By.linkText("CRM/SFA")).click();// clicking CRM/SFA

leafTaps.findElement(By.linkText("Accounts")).click();//Accouts

leafTaps.findElement(By.linkText("Create Account")).click();// Create Acc

leafTaps.findElement(By.id("accountName")).sendKeys("Testy3");//Name

leafTaps.findElement(By.name("description")).sendKeys("Selenium Automation Tester");//Description
	
WebElement Industry = leafTaps.findElement(By.name("industryEnumId"));//creating a web element - can reuse the variable
Select dropdown = new Select(Industry);// creating object for select element:
dropdown.selectByVisibleText("Computer Software");// call the method	
		
WebElement Ownership = leafTaps.findElement(By.name("ownershipEnumId"));//creating a web element - can reuse the variable
Select owner = new Select(Ownership);// creating object for select element:
owner.selectByVisibleText("S-Corporation");// call the method			

WebElement Source = leafTaps.findElement(By.name("dataSourceId"));//creating a web element - can reuse the variable
Select Employee = new Select(Source);// creating object for select element:
Employee.selectByVisibleText("Employee");// call the method

WebElement  marketingCampaign = leafTaps.findElement(By.id("marketingCampaignId"));//creating a web element - can reuse the variable
Select eCommerceSiteInternalCampaign = new Select(marketingCampaign);// creating object for select element:
eCommerceSiteInternalCampaign.selectByValue("9000");// call the method

WebElement  State = leafTaps.findElement(By.id("generalStateProvinceGeoId"));//creating a web element - can reuse the variable
Select Texas = new Select(State);// creating object for select element:
Texas.selectByValue("TX");// call the method

leafTaps.findElement(By.className("smallSubmit")).click();// create acc button after selecting all values

String title = leafTaps.getTitle();// get current page title
System.out.println(title);

String currentUrl = leafTaps.getCurrentUrl();// current page URL
System.out.println(currentUrl);

String text = leafTaps.findElement(By.className("tabletext")).getText();//account name displayed correctly
System.out.println(text);

Thread.sleep(10000);

if(title.contains("Account Details |"))
{
	System.out.println(" Details verified");
}
else
{
	System.out.println("Account not verified");
}

	}

		
	}


