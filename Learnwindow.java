package week5.day3;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Learnwindow {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leafground.com/pages/Window.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//handle old window
		String oldWindow=driver.getWindowHandle();
		driver.findElement(By.id("home")).click();
        Set<String> windowhandles=driver.getWindowHandles();
        List<String> openWindow=new ArrayList<String>(windowhandles);
		//System.out.println(windowhandles.size());
        //set does not get method.because, index value change for implementation class.so,convert list
        //get --index value for first open window
		driver.switchTo().window(openWindow.get(1));
		//print 1st open window CD value
		System.out.println(openWindow);
		
	//click edit 
        driver.findElement(By.xpath("//h5[text()='Edit']")).click();
        driver.findElement(By.id("email")).sendKeys("sowmiya@gmail.com");
        driver.close();
        
		 
        //find the number of opened windows
        driver.switchTo().window(oldWindow);
		driver.findElement(By.xpath("//button[text()='Open Multiple Windows']")).click();
         Set<String> windowhandles1=driver.getWindowHandles();
		List<String> openWindow1=new ArrayList<String>(windowhandles1);
		//get window size
		System.out.println(openWindow1.size());
		//close opened windows
		
		for (int i = 1; i < openWindow1.size(); i++) {
			
			driver.switchTo().window(openWindow1.get(i)).close();
		}
		
		
		
		
//		driver.switchTo().window(openWindow1.get(1));
//		driver.close();
//		driver.switchTo().window(openWindow1.get(2));
//		driver.close();
		//print window value 
		System.out.println(openWindow1);
		
		
		//close all expect this window
		
		driver.switchTo().window(oldWindow);
		driver.findElement(By.xpath("//button[text()='Do not close me ']")).click();
		Set<String> windowhandles2=driver.getWindowHandles();		
		List<String> openWindow3=new ArrayList<String>(windowhandles2);
		System.out.println(openWindow3.size());
		
		for (int i = 1; i <  openWindow3.size(); i++) {
			driver.switchTo().window(openWindow3.get(i)).close();
	}
		
		
		//Wait for 2 new Windows to open
		
	driver.switchTo().window(oldWindow);	
    WebElement Element = driver.findElement(By.xpath("//button[text()='Wait for 5 seconds']"));
    Element.click();
    

    Set<String> windowhandles3=driver.getWindowHandles();
    
    List<String> openWindow4=new ArrayList<String>(windowhandles3);
    
    driver.switchTo().window(openWindow4.get(0)).close();
    driver.switchTo().window(openWindow4.get(2));
    driver.manage().window().maximize();
    driver.close();
    
   
    driver.switchTo().window(openWindow4.get(1));
    driver.manage().window().maximize();
    driver.findElement(By.linkText("Go to Home Page")).click();
    System.out.println(driver.getTitle());
    
}

}
