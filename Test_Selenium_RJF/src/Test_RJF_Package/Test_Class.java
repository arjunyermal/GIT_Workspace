package Test_RJF_Package;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Test_Class {

	public static void main(String[] args) throws InterruptedException {
		// declaration and instantiation of objects/variables
    	WebDriver driver ;
    	System.setProperty("webdriver.firefox.marionette","D:\\geckodriver.exe");
    	driver = new FirefoxDriver();
    	
        String baseUrl = "http://vmisupqauprjfap/";
        
        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);
        
        /*
        String expectedTitle = "WELCOME to the GRC Center";
        String actualTitle = "";

        // get the actual value of the title
        actualTitle = driver.getTitle();

        */
        
        /*
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         */
       /* 
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        */
        
        driver.findElement(By.id("loginHref")).click();
        driver.findElement(By.id("login")).clear();
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
    }
	
}
