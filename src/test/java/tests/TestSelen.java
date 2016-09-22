package tests;

import exeption.NoElementFound;
import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.SystemClock;
import pages.MainPage;
import utils.WebElementActions;
//import org.testng.annotations.*;

import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Dell-user on 9/11/2016.
 */
public class TestSelen extends Fixture {


    @Test
    public void test() throws NoElementFound {
        MainPage mainPage = new MainPage(driver);
        web.openPage(baseURL);
        mainPage.reffreshPAge();
        mainPage.clickLoginLink();

    }
}
