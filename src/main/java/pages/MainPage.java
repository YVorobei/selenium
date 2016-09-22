package pages;

import exeption.NoElementFound;
import org.openqa.selenium.WebDriver;
import utils.WebElementActions;

import java.io.IOException;

/**
 * Created by Dell-user on 9/13/2016.
 */
public class MainPage {
    WebElementActions web;

    public MainPage(WebDriver driver){
        web = new WebElementActions(driver);
    }

    public void clickLoginLink() throws NoElementFound {
        web.clickLink("LoginLink");
    }

    public void clickLogo() throws NoElementFound {
        web.clickElement("Logo");
    }


    public void reffreshPAge(){
        web.reffreshPage();
    }

}
