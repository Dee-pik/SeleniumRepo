package week4Day1Ass;


import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class NestedFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               ChromeDriver driver = new ChromeDriver();
				driver.manage().window().maximize();

				driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
				WebDriver frame = driver.switchTo().frame(1);
			    WebElement element = driver.findElement(By.name("Try it"));	
			    element.click();
				Alert alert = driver.switchTo().alert();
				
				alert.accept();
				String getText = driver.findElement(By.xpath("//p[@id='demo']")).getText();
				if(getText.contains("Hello Hary")) {
					System.out.println("It has the Hary text");
				}else {
					System.out.println("It dont have Hary");
				}
				
				
				
				
				
			}
		
	}

