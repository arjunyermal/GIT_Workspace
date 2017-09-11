package Framework1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Common_Utils1 
{
  
	 public static WebDriver Driver = null;
	 public static Properties io_file = new Properties();
	 public static FileInputStream fis = null;
	
	public static void Select_Browser() throws IOException
	{
	
		fis=new FileInputStream("C:\\Users\\arjun.rao\\workspace\\FrameWork_Setup\\Common_Params.Properties");
		io_file.load(fis);
		
		if(io_file.getProperty("browser").equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "E:\\Selenium jars\\chromedriver_win32\\chromedriver.exe");
			Driver = new ChromeDriver();			
		}
		else if (io_file.getProperty("browser").equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","E:\\Selenium jars\\Geckodriver\\geckodriver.exe");
			Driver = new FirefoxDriver();
		}		
	}
	
	public static void Login_To_RJ()
	{
		Driver.get(io_file.getProperty("url"));
		Driver.findElement(By.xpath(io_file.getProperty("L_Welcome"))).click();
		Driver.findElement(By.xpath(io_file.getProperty("L_Username"))).sendKeys(io_file.getProperty("D_Username"));
		Driver.findElement(By.xpath(io_file.getProperty("L_Pwd"))).sendKeys(io_file.getProperty("D_Pwd"));
		Driver.findElement(By.xpath(io_file.getProperty("L_Login"))).click();
	}
	
	public static void Logout_of_RJ() throws NumberFormatException, InterruptedException
	{
		Thread.sleep(Integer.parseInt(io_file.getProperty("wait_5s")));
		Driver.findElement(By.xpath(io_file.getProperty("L_Logout"))).click();
	}
}