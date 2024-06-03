package Week2Day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbRegclass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		
		
		ChromeDriver driver= new ChromeDriver();//intialize the chrome browser

		driver.manage().window().maximize();// maximize the window
		
	    //selenium wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.get("https://en-gb.facebook.com");//load URL
		
		driver.findElement(By.linkText("Create new account")).click();// linktext
		
		Thread.sleep(10000);
		
		driver.findElement(By.name("firstname")).sendKeys("Deepika");//firstname
		
		driver.findElement(By.name("lastname")).sendKeys("Raja");
		
		driver.findElement(By.name("reg_email__")).sendKeys("6379437349");//user name
		
		driver.findElement (By.name("reg_passwd__")).sendKeys("Test@123");// password
		
		
		driver.findElement(By.name("sex")).click();// radio button for gender
		
       	
		WebElement db = driver.findElement(By.name("birthday_day"));//creating a web element - can reuse the variable
        Select drpdown = new Select(db);// creating object for select element:
        drpdown.selectByVisibleText("2");// call the method
        
        WebElement audit = driver.findElement(By.name("birthday_month"));//creating a web element - can reuse the variable
        Select month = new Select(audit);// creating object for select element:
        month.selectByValue("4");// call the method
        
        WebElement kajol = driver.findElement(By.name("birthday_year"));//creating a web element - can reuse the variable
        Select year = new Select(kajol);// creating object for select element:
        year.selectByValue("2000");//// call the method
 
     
		
	}

}
