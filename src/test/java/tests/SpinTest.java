package tests;


import core.BrowserFactory;
import core.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class SpinTest extends BrowserFactory {
    MainPage mainPage = new MainPage();

    @Test(priority = 1)
    public void start() throws InterruptedException{
        mainPage.open();
        mainPage.spin.start();
        Assert.assertTrue("".contains(""));
        Thread.sleep(6000);

    }
}
