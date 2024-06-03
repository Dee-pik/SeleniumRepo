package Week2Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	ChromeDriver facebook = new ChromeDriver();
		
		// maximize the window
		
		facebook.manage().window().maximize();
		
		
		// pass URL:
		
		facebook.get("https://www.facebook.com/");
		
		//username
		facebook.findElement(By.xpath("//input[@id='email']")).sendKeys("radhakrishnan@testleaf.com");
		
		//password
	
		facebook.findElement(By.xpath("//input[@id='pass']")).sendKeys("Sparrow@123");
		//login
		
		facebook.findElement(By.xpath("//button[@name='login']")).click();	
		
	}

}
