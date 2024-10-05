package week4day2ClassAss;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class AmazonHints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		ChromeDriver driver  = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		//driver.findElement(By.xpath("//input[@class='a-button-input']")).click();
		
		//
//		ChromeOptions options = new ChromeOptions();
//		options.addExtensions(new File("C:\\Users\\Deepika\\MavenProject\\buster_captcha_solver.crx"));
//		WebDriver driver = new ChromeDriver(options);

		
	}

}
