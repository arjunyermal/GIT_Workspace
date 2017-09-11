package Framework2;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Framework1.Common_Utils1;

public class Test1 extends Common_Utils1
{
	
	@BeforeTest
	public void Login() throws IOException, NumberFormatException, InterruptedException
	{
		Select_Browser();
		Login_To_RJ();
    }
	
	
	@AfterTest
	public void Logout() throws IOException, NumberFormatException, InterruptedException
	{
		Logout_of_RJ();
    }
}
