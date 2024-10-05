package Week4Day1ClassRommAss;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	
		
		ChromeDriver NestedFrame = new ChromeDriver();
		NestedFrame.manage().window().maximize();
		NestedFrame.get("https://leafground.com/alert.xhtml;jsessionid=node01polyl5932d59376y7pocog8q4700255.node0");
		NestedFrame.manage().timeouts().implicitlyWait(Duration.ofSeconds(3000));
		
		NestedFrame.findElement(By.xpath("//i[@class='pi pi-globe layout-menuitem-icon']")).click();//menu icon to click I frame
		
		NestedFrame.findElement(By.xpath("//i[@class='pi pi-fw pi-stop layout-menuitem-icon']")).click();
		
		NestedFrame.switchTo().frame(2);//1st main frame 3rd frame
		
		NestedFrame.findElement(By.id("Click")).click();//clicking click me
		
		NestedFrame.switchTo().parentFrame();
		
		NestedFrame.switchTo().defaultContent();
		
		
		
		
		
	}

}
