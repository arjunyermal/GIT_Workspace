package testng;

import org.testng.annotations.Test;

public class UITesting {
    @Test(groups="someFeature")
    public void ui1() {
        System.out.println("UITesting(someFeature) UI1");
    }
    
    @Test
    public void ui2() {
        System.out.println("UITesting UI2");
    }
        
    @Test
    public void ui3() {
        System.out.println("UITesting UI3");
    }
    
    @Test
    public void ui4() {
        System.out.println("UITesting UI4");
    }
}
