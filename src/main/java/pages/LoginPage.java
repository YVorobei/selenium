package pages;

import exeption.NoElementFound;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import utils.WebElementActions;

import java.io.IOException;

/**
 * Created by Dell-user on 9/13/2016.
 */
public class LoginPage {

    WebElementActions web;

    public LoginPage(WebDriver driver) {
        web = new WebElementActions(driver);
    }
    //private static final Logger log = Logger.getLogger(ClassNameUtil.getCurrentClassName());
    static final Logger log = Logger.getLogger(LoginPage.class);


    public void fillLoginForm(String email, String password) throws NoElementFound {
        web.input("EmailField", email);
        log.info("type email field");
        web.clickElement("PassField");
        log.info("type password field");
        web.input("PasswordField", password);
    }

    public void confirmLoginForm() throws NoElementFound {
        web.clickButton("LoginButton");
        log.info("click button");
    }

    public void logOut() throws NoElementFound {
        web.clickElement("LogoutLink");
        log.info("click logOut");
    }
}
