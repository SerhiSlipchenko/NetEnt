package core;

import org.openqa.selenium.WebDriver;

public class MetodsFactory {
    static ThreadLocal<WebDriver> DRIVER = new ThreadLocal<WebDriver>();

    public  static WebDriver driver(){
        return DRIVER.get();
    }
}