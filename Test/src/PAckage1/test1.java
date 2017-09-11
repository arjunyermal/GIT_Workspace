package PAckage1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class test1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
System.setProperty("webdriver.gecko.driver","E:\\Selenium jars\\Geckodriver\\geckodriver.exe");

		WebDriver driver= new FirefoxDriver();
		//driver.get(arg0);
String baseUrl = "http://vmisupqauprjfap/";
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        Thread.sleep(2000);   
       // driver.findElement(By.("loginHref")).click();
        driver.findElement(By.id("loginHref")).click();
        /*driver.findElement(By.id("login")).clear();
        driver.findElement(By.id("login")).sendKeys("bsilva");
        driver.findElement(By.id("password")).clear();
        driver.findElement(By.id("password")).sendKeys("welcome*123");
        driver.findElement(By.id("go")).click();
        
        Thread.sleep(5000);
        driver.findElement(By.id("tab-panel1__RJF - Metrics")).click();
        Thread.sleep(5000);
       
       // driver.findElement(By.id("ext-gen193")).click();
        driver.findElement(By.className("div")).findElement(By.className("x-grid3-cell-inner")).findElement(By.className("x-grid3-col-1")).click();
        //close Fire fox
       // driver.close();
       
        // exit the program explicitly
        //System.exit(0);
         
         */
	}

}
