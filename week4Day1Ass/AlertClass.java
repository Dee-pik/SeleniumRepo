package week4Day1Ass;

import java.time.Duration;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ChromeDriver Alert = new ChromeDriver();
		Alert.manage().window().maximize();
		Alert.get("https://leafground.com/alert.xhtml;jsessionid=node01polyl5932d59376y7pocog8q4700255.node0");
		Alert.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
        Alert.findElement(By.xpath("//span[text()='Show'][1]")).click();
        
        
        Alert Abox = Alert.switchTo().alert();
        String getAlerttext = Abox.getText();
        System.out.println(getAlerttext);
        
         Abox.accept();
         
         //Confirmation Alert
         Alert.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[2]")).click();
         Alert CAlert = Alert.switchTo().alert();
         String getConAlerText = CAlert.getText();
         System.out.println(getConAlerText);
         
         CAlert.dismiss();
         
         //Sweet Alert
         
         Alert.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
         Alert.findElement(By.xpath("//span[text()='Dismiss']")).click();           
           

         
         
         //prompt Alert
         
         Alert.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[6]")).click();
         Alert promptAlert = Alert.switchTo().alert();
         promptAlert.sendKeys("Deepika Test");
         promptAlert.accept();
         String text = promptAlert.getText();
 		System.out.println(promptAlert);
         
         
         
	}

}
