package tests;

import org.apache.log4j.Logger;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.WebElementActions;

import java.util.concurrent.TimeUnit;

/**
 * Created by Dell-user on 9/20/2016.
 */
public class Fixture {

    static WebDriver driver;
    static WebElementActions web;
    static String baseURL = "http://ellos.se/";
    private static final Logger log = Logger.getLogger(Fixture.class);


    @BeforeClass
    public static void setUP() {
        driver = new ChromeDriver();
        web = new WebElementActions(driver);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        log.info("<---Start Login tests--->");
        log.info("");
        //System.setProperty("webdriver.chrome.driver", "c:\\tools\\chromedriver.exe");

    }

    @AfterClass
    public static void tearDown() throws Exception{
        log.info("<---Finish tests--->");
        log.info("Close browser");
        driver.quit();
    }

}
