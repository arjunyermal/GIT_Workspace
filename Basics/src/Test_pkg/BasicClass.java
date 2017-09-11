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

//import com.gargoylesoftware.htmlunit.javascript.host.Iterator;
//import com.gargoylesoftware.htmlunit.javascript.host.Set;

public class BasicClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "E:\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
		WebDriver Driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver","E:\\Selenium jars\\Geckodriver\\geckodriver.exe");
		
		//WebDriver Driver = new FirefoxDriver();
    	
		//String url  = "www.google.com";
		
		Driver.get("http://vmisupqauprjfap.metricstream.com");
		Driver.findElement(By.xpath("//*[@id='loginHref']/img")).click();
		Driver.findElement(By.cssSelector("#login")).sendKeys("bsilva");
	    Driver.findElement(By.xpath("//*[@id='password']")).sendKeys("welcome*123");
		Driver.findElement(By.xpath("//div[@id='middle']/div[2]/div/form/input[3]")).click();
		Thread.sleep(2000);
		Driver.findElement(By.linkText("Metrics Mgmt")).click();
		Thread.sleep(2000);
		Driver.switchTo().frame("MultiWindowIframe1");
		Thread.sleep(2000);
		Driver.findElement(By.xpath(".//*[@id='ext-gen93']/div[1]/table/tbody/tr/td[2]/div")).click();
		Thread.sleep(2000);
		System.out.println("Completed1");
		//Driver.switchTo().frame(0);
		//Thread.sleep(2000);
		//Driver.findElement(By.xpath(".//*[@id='image19']")).click();
		//System.out.println("Completed2");
        //System.out.println(Driver.getWindowHandles().size());
        //System.out.println("Completed3");
        
        
        By element1 = By.xpath(".//*[@id='image19']");
		//By element2 = By.xpath("//button[@id='recaptcha-verify-button']");	
		
		SwitchToFrames(Driver,element1);
		Driver.switchTo().frame("mlovPopup");
		int i = Driver.findElements(By.cssSelector(".x-grid3-cell-inner.x-grid3-col-1")).size();
		
		System.out.println("i = " + i);
		for(int x=0;x<i;x++)
		{
			String text = Driver.findElements(By.cssSelector(".x-grid3-cell-inner.x-grid3-col-1")).get(x).getText();
			System.out.println(text);
			if (text.equalsIgnoreCase("Operational Risk"))
			{
				Driver.findElements(By.cssSelector(".x-grid3-cell-inner.x-grid3-col-1")).get(x).click();
                break;				
			}			
		}
		//Driver.findElement(By.xpath("//div[@id='102980']/div[2]//div[1]/div/div/div/div/div/div/div/div[1]/div[2]/div[1]/div[1]/table/tbody/tr/td[2]/div")).click();
		//Driver.findElement(By.cssSelector("#ext-gen175 > div.x-grid3-row.grid-evenrow.x-grid3-row-first > table > tbody > tr > td.x-grid3-col.x-grid3-cell.x-grid3-td-1.hand-cursor > div")).click();
		//Driver.findElement(By.xpath("//*[@id='ext-gen128']")).click();
		//Driver.findElement(By.xpath("//*[@id='0_Metric_Definition_Name']")).sendKeys("%Test%");
		//Driver.findElement(By.xpath("//*[@id='0_Metric_Definition_Name']")).click();
		//Driver.close();
		///div[@id='middle']/div[2]/div/form/input[3]
		
		//Driver.get("https://book2.spicejet.com/");
		//Driver.findElement(By.xpath("//input[@id='ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT']")).click();
		//Driver.findElement(By.linkText(" Goa (GOI)")).click();
		//Driver.findElement(By.xpath("//*[@text='Goa (GOI)']")).click();
		//Driver.findElement(By.xpath("(//*[@text='Mumbai (BOM)'])[2]")).click();
		//Select pax = new Select(Driver.findElement(By.xpath("//*[@id='ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT']")));
		//pax.selectByVisibleText("4");
		/*Driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_radio");
		Driver.switchTo().frame("iframeResult");
		int size = Driver.findElements(By.xpath("//*[@name='gender']")).size();
		System.out.println(size);
		int i;
		for(i=0;i<size;i++)
		{
			Driver.findElements(By.xpath("//*[@name='gender']")).get(i).click();
		}*/
		//Driver.get("http://www.tizag.com/javascriptT/javascriptalert.php");
		//Driver.findElement(By.xpath("//input[@value = 'Confirmation Alert']")).click();
		//Thread.sleep(5000);
		//Driver.switchTo().alert().accept();
		//Driver.get("https://alaskatrips.poweredbygps.com/");
		//WebElement Source = Driver.findElement(By.id("package-origin"));
		//Source.sendKeys("New York, NY, United States (NYC-All Airports)");
		//WebElement Dest = Driver.findElement(By.id("package-destination"));
		//Dest.sendKeys("Mangalore, India");
		//Driver.findElement(By.id("search-button")).click();
		//Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//WebDriverWait ExpWait = new WebDriverWait(Driver,20);
		//ExpWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id='inpStartDate']")));		
	    //Driver.findElement(By.xpath("//*[@id='inpStartDate']")).click();
        //Driver.findElement(By.xpath("//*[@id='startDateRange']/div/div/div[2]/table/tbody/tr[5]/td[2]/button")).click();
	    //Driver.findElement(By.id("hotelNewSearchLnk")).click();
		//Driver.get("https://www.amazon.com/");
		//Actions a = new Actions(Driver);
		//WebElement target1 = Driver.findElements(By.className("nav-line-1")).get(2);
		//System.out.println(size);
	//a.moveToElement(target1).click().build().perform();
		//WebElement target2 = Driver.findElement(By.xpath("(//a[@class = 'nav-link nav-item']/span)[1]"));
	//	//System.out.println("Reached");
	 //   Driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS)	;
	//	a.click().click(target2).build().perform();
		
		//WebElement target1 = Driver.findElement(By.cssSelector("#twotabsearchtextbox"));
	//	a.moveToElement(target1).click().keyDown(Keys.SHIFT).sendKeys("hello").build().perform();
	//	a.moveToElement(target1).build().perform();
		/*Driver.get("https://accounts.google.com/signup");
		System.out.println(Driver.getTitle());
		Driver.findElement(By.linkText("Learn more")).click();
		System.out.println(Driver.getTitle());
		Set<String>handlez = Driver.getWindowHandles();
		int Size = Driver.getWindowHandles().size();
		System.out.println(Size);
		Iterator<String> Itz=handlez.iterator();
		String Handle1 = Itz.next();
		System.out.println(Handle1);
		
		String Handle2 = Itz.next();
		System.out.println(Handle2);
		System.out.println(Driver.getTitle());
	    Driver.switchTo().window(Handle2);
	    System.out.println(Driver.getTitle());*/
		//String url = "http://jqueryui.com/droppable/";
		//Driver.get(url);
		//Actions a = new Actions(Driver);
		//Driver.switchTo().frame(Driver.findElement(By.cssSelector("iframe.demo-frame")));
		//WebElement Drag = Driver.findElement(By.id("draggable"));
		//WebElement Drop = Driver.findElement(By.id("droppable"));
		//a.dragAndDrop(Drag, Drop).build().perform();
		
	}
	public static void SwitchToFrames(WebDriver Driver, By element) 
	{
		int frameCnt = Driver.findElements(By.tagName("frame")).size();		
		System.out.println("frameCnt = "+frameCnt);
		System.out.println("Entered");
		
		for(int i=0;i<frameCnt;i++)
		{
			Driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
			Driver.switchTo().frame(i);
			int size1 = Driver.findElements(element).size();
			//int size2 = Driver.findElements(By.xpath("//input[@id = 'default-response']")).size();
			if(size1 ==  1 )
					//&& size2 == 0)
			{
				Driver.findElement(element).click();
				System.out.println("Exited");
				break;
			}
			//else if (size2 ==  1 && size1 == 1)
			//{
			//	Driver.findElement(By.xpath("//input[@id = 'default-response']")).sendKeys("Your System is Hacked");
			///	Driver.findElement(By.xpath("//button[@id='recaptcha-audio-button']")).click();
			//	break;
				
			//}
			else
			{			
				//Driver.switchTo().defaultContent();
			}			
		}
	}

}
