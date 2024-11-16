package HYR;

import org.testng.annotations.Test;

public class TestClass extends BaseTest {

    @Test
    public void testGoogle(){
        driver.get("https://www.google.com");
        System.out.println("Title: " +driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
    }

    @Test
    public void testFacebook(){
        driver.get("https://www.facebook.com");
        System.out.println( "Title: "+driver.getTitle());
        System.out.println("URL: " + driver.getCurrentUrl());
    }
}
