package TestNG;
import java.net.URL;
import java.net.MalformedURLException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Desired_Cap {

	@Test
	public void Test_DC() throws MalformedURLException
	{
		
		DesiredCapabilities dc=  DesiredCapabilities.chrome();
		dc.setCapability("version", "60");
		dc.setCapability("platform", "WIN7");
		
		WebDriver driver = new RemoteWebDriver(new URL("http://arjunrao:a470e41b-9797-4fba-9cb8-87f4dadc8102@ondemand.saucelabs.com:80/wd/hub"),dc);

driver.get("https://rj.uat.metricstream.com/");
System.out.println(driver.getTitle());
System.out.println("Test");

	}
	
}
