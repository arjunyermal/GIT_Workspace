package Test_pkg;

import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		
		
		//System.setProperty("webdriver.chrome.driver", "E:\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		//WebDriver Driver = new ChromeDriver();
		
		System.setProperty("webdriver.gecko.driver","E:\\Selenium jars\\Geckodriver\\geckodriver.exe");
		WebDriver Driver = new FirefoxDriver();
		
		String url = "http://www.protypers.com/register";
		
		Driver.get(url);
		
		By element1 = By.xpath("//span[@id='recaptcha-anchor']/div[5]");
		By element2 = By.xpath("//button[@id='recaptcha-verify-button']");	
		
		SwitchToFrames(Driver,element1);
		Driver.switchTo().defaultContent();
		SwitchToFrames(Driver,element2);
		
		System.out.println("Completed");
			
	}

	public static void SwitchToFrames(WebDriver Driver, By element) 
	{
		int frameCnt = Driver.findElements(By.tagName("iframe")).size();		
		System.out.println("Entered");
		
		for(int i=0;i<frameCnt;i++)
		{
			Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Driver.switchTo().frame(i);
			int size1 = Driver.findElements(element).size();
			int size2 = Driver.findElements(By.xpath("//input[@id = 'default-response']")).size();
			if(size1 ==  1 && size2 == 0)
			{
				Driver.findElement(element).click();
				break;
			}
			else if (size2 ==  1 && size1 == 1)
			{
				Driver.findElement(By.xpath("//input[@id = 'default-response']")).sendKeys("Your System is Hacked");
				Driver.findElement(By.xpath("//button[@id='recaptcha-audio-button']")).click();
				break;
				
			}
			else
			{			
				Driver.switchTo().defaultContent();
			}			
		}
	}
}
