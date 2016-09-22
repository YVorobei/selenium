package tests;

import exeption.NoElementFound;
import org.apache.commons.logging.impl.Log4JLogger;
import org.junit.Test;
import pages.LoginPage;
import pages.MainPage;

/**
 * Created by Dell-user on 9/21/2016.
 */
public class LoginTest extends Fixture{

    //Success login +

    @Test
    public void positiveLogin() throws NoElementFound {
        web.openPage(baseURL);
        web.reffreshPage();

        MainPage mainPage = new MainPage(driver);
        mainPage.clickLoginLink();

        LoginPage loginPage = new LoginPage(driver);
        loginPage.fillLoginForm("ellostest@mailinator.com", "ellostest");
        loginPage.confirmLoginForm();
        loginPage.logOut();

     }
}
