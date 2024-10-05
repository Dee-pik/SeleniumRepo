package Week4Day2ClassRommAss;

import java.util.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WindowsHandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		
		
		
ChromeOptions Options = new ChromeOptions();
Options.addArguments("--disable-notifications");
ChromeDriver Handles = new ChromeDriver(Options);
Handles.manage().window().maximize();
Handles.get("https://www.irctc.co.in/");
Handles.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();


Set<String> windowHandles = Handles.getWindowHandles();
System.out.println(windowHandles);


List<String> windows=new ArrayList<String>(windowHandles);
String childTitle = Handles.getTitle();
System.out.println("This is child window title" + childTitle);


Handles.switchTo().window(windows.get(0));
String parentTitle = Handles.getTitle();
System.out.println("This is parent window title" + parentTitle);		
		
Handles.close();		
	}

}
