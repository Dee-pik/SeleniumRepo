package Week4Day2ClassRommAss;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.ajio.com/");
		Actions act = new Actions(driver);
		WebElement mouseover = driver.findElement(By.xpath("//span[@aria-label='MEN']"));
		act.moveToElement(mouseover).perform();
		
		
	}

}
