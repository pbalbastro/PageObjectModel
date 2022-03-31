package com.saucedemo.test;

import com.saucedemo.base.Base;
import com.saucedemo.pages.HomePage;
import com.saucedemo.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTest extends Base {
    LoginPage loginPage;
    HomePage homePage;

    public LoginTest() {
        super();
    }

    @BeforeMethod
    public void setUp() {
        initialization();
        loginPage = new LoginPage();
    }

    @Test()
    public void loginTest() {
//        homePage = loginPage.login("standard_user", "secret_sauce");
        homePage = loginPage.login(prop.getProperty("standard_user"), prop.getProperty("secret_sauce"));
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }
}
