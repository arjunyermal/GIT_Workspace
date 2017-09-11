package testng;

import org.testng.annotations.Test;

public class UnitLevelTesting {    

    @Test
    public void unitTest1() {
        System.out.println("testng.UnitLevelTesting 1");
    }
    
    @Test
    public void unitTest2() {
        System.out.println("testng.UnitLevelTesting2");
    }
    
    @Test(groups="someFeature")
    public void unitTest3() {
        System.out.println("testng.UnitLevelTesting (someFeature) 3");
    }
}
