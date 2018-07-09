package tests;


import core.BrowserFactory;
import core.MainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class BetTest extends BrowserFactory {
    MainPage mainPage = new MainPage();

    @Test(priority = 2)
    public void level() throws InterruptedException{
        mainPage.open2();
        mainPage.bet.up.clck();
        mainPage.bet.up.clck();
        mainPage.spin.start();
        Assert.assertTrue("".contains(""));
        Thread.sleep(6000);

    }
}

