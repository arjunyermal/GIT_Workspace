package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Login {
	public WebDriver Driver;
	//int Y;
	int x;
	public Login(WebDriver Driver,int x)
	{
		this.x = x;
		System.out.println("Constructor Called");
		this.Driver = Driver;
		PageFactory.initElements(Driver, this);
	}
	
	
	//By Login = By.xpath("//img[@src='/si_image/FirstLogin_img.png']");
	@FindBy(xpath = "//img[@src='/si_image/FirstLogin_img.png']")
	WebElement Login;
	
	
	public WebElement Log_In()
	{
		int Y = x;
		System.out.println("Value of X = " + x);
		System.out.println("Value of Y = " + Y);
		//return Driver.findElement(Login);
		return Login;
		
	}

}