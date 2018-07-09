package core;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import static core.MetodsFactory.DRIVER;
import static core.MetodsFactory.driver;

public class BrowserFactory {

    @BeforeTest
    public void setUp(){
        DRIVER.set(new ChromeDriver());

    }

    @AfterTest
    public void tearDown(){
        driver().quit();
    }
}
