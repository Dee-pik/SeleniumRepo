package Week4Day2ClassRommAss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement scrolldown =driver.findElement(By.xpath("//div[text()='See personalized recommendations']/following::span[text()='Sign in']"));
		
		
		act.moveToElement(scrolldown).perform();
		scrolldown.click();
		
		
		
		
	}

}
