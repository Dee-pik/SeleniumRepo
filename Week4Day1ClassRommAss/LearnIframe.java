package Week4Day1ClassRommAss;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnIframe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
ChromeDriver frames = new ChromeDriver();
frames.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
frames.manage().window().maximize();
frames.switchTo().frame(0);
frames.findElement(By.xpath("//button[text()='Try it']")).click();
Alert alert = frames.switchTo().alert();
alert.accept();
String text =frames.findElement(By.id("demo")).getText();
if (text.contains("Ok")) {
	
	System.out.println(text + "correct");
}
else {
	System.out.println(text + "Not correct");
}
		
		
		
		
		
	}

}
