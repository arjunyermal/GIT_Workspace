package testng;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FunctionalTesting {
    @BeforeSuite
    public void beforeSuite() {
        System.out.println(" testng.FunctionalTesting beforeSuite");
    }
    
    @BeforeTest
    public void beforeTest() {
        System.out.println("testngRao.FunctionalTesting beforeTest");
    }
    
    @BeforeMethod
    public void beforeMethod() {
        System.out.println("testngRao.FunctionalTesting beforeMethod");
    }
    
    @Test
    public void scenario1() {
        System.out.println("testngRao.FunctionalTesting Scenario1");
    }
    
    @Test(groups="someFeature")
    public void scenario2() {
        System.out.println("testngRao.FunctionalTesting (someFeature) Scenario2");
    }
    
    @Test
    public void scenario3() {
        System.out.println("testngRao.FunctionalTesting Scenario3");
    }
    
    @AfterMethod
    public void afterMethod() {
        System.out.println("testngRao.FunctionalTesting afterMethod");
    }
    
    @AfterTest
    public void afterTest() {
        System.out.println("testngRao.FunctionalTesting afterTest");
    }
    
    @AfterSuite
    public void afterSuite() {
        System.out.println("testngRao.FunctionalTesting afterSuite");
    }
}
