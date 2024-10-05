package Week4Day1ClassRommAss;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClassRoom {


	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		ChromeDriver promptAlert = new ChromeDriver();
		promptAlert.get("https://www.leafground.com/alert.xhtml");
		promptAlert.manage().window().maximize();
		promptAlert.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
		
		Alert Abox = promptAlert.switchTo().alert();
		
		Abox.sendKeys("Deepika Test");
		Abox.accept();
		promptAlert.findElement(By.id("confirm_result")).getText();
		System.out.println(Abox);
		
		
	}

}
