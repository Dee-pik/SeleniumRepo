package Week3.Day2.Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AjioList {

	private static final CharSequence ENTER = null;

	public static void main(String[] args) {

		ChromeOptions Options = new ChromeOptions();
		Options.addArguments("--disable-notifications");
		ChromeDriver shoping = new ChromeDriver(Options);
		shoping.manage().window().maximize();
		shoping.get("https://www.ajio.com/");
		shoping.findElement(By.xpath("//input[@aria-label='Search Ajio']")).sendKeys("Bags",Keys.ENTER);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
