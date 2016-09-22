package utils;

import exeption.NoElementFound;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.internal.ClasspathExtension;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.ConfigData;

import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * Created by Dell-user on 9/13/2016.
 */
public class WebElementActions {

   // WebDriver driver = new ChromeDriver();
    WebDriver driver;
    private static WebDriverWait waitForElement;

    public WebElementActions(WebDriver driver) {
        this.driver = driver;
    }

    public void openPage(String siteURL){
        driver.get(siteURL);
    }


    public void clickButton(String ButtonLocator) throws NoElementFound {
        //driver.findElement(By.xpath(ButtonLocator)).click();
        driver.findElement(ConfigData.ui(ButtonLocator)).click();
    }

    public void clickLink(String LinkLocator) throws NoElementFound {
        //System.out.println(ConfigData.ui(LinkLocator));
        driver.findElement(ConfigData.ui(LinkLocator)).click();
    }

    public void clickElement(String elementLocator) throws NoElementFound {
        driver.findElement(ConfigData.ui(elementLocator)).click();
    }

    public void input(String inputLocator, String inputData) throws NoElementFound {
        driver.findElement(ConfigData.ui(inputLocator)).clear();
        driver.findElement(ConfigData.ui(inputLocator)).sendKeys(inputData);
    }

    public void inputAndClickEnter(String inputLocator, String inputData) throws NoElementFound {
        driver.findElement(ConfigData.ui(inputLocator)).clear();
        driver.findElement(ConfigData.ui(inputLocator)).sendKeys(inputData);
        driver.findElement(ConfigData.ui(inputLocator)).sendKeys(Keys.ENTER);
    }

    public void reffreshPage(){
        driver.navigate().refresh();
    }

}
