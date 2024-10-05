package week4day2ClassAss;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandling {

	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");//diabling the notification for that website
		
		ChromeDriver driver  = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();   //new wiundow  
	
		
		    String parentwindow = driver.getWindowHandle(); //getwindowhandle
		    System.out.println("Paren window address : " + parentwindow);//getting the ADDRESS OD PARENT WINDOW
		    String GetParentwindowtitle = driver.getTitle();//getting parentwindow title
		    System.out.println("Parent window title name : "+GetParentwindowtitle);//getting parent window title name
		
		
		//get window handles so that onlty we can get data fpor 2 nd window details
		    
		    Set<String> childwindow = driver.getWindowHandles();//set<string> only will displays so that it will not allow the duplicate
		    System.out.println("Getchild window address : " + childwindow);//getting the ADDRESS OD CHILD WINDOW
		   
		

		   //convert set into list> when i need some thing to interact with child window
		   
		   List<String> windows = new ArrayList<String>(childwindow);//convert list in to set
		   driver.switchTo().window(windows.get(1));//getting a control of child window
		   String gettitleofchildwindowcontrol = driver.getTitle();
		   System.out.println("Getting child window address : " + gettitleofchildwindowcontrol);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();//clicking the search button to confirm whethjer got control with child window
		   
		   
		   //closing the current controoll window or Tab
		   
		   driver.close();
		   
		   //getting controll to main window using driver.swtichto().window(windows.get());
		   driver.switchTo().window(windows.get(0));
		   driver.findElement(By.xpath("//a[@aria-label='Menu Flight. Website will be opened in new tab']")).click();   //new window 
		   
		   
		   
	}

}
