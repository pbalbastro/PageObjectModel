package com.saucedemo.pages;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.HomePage;
import com.saucedemo.base.Base;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Base {

    @FindBy(css="#user-name")
    WebElement usernameInput;

    @FindBy(css="#password")
    WebElement passwordInput;

    @FindBy(css="#login-button")
    WebElement loginButton;

    //Initializing the Page Objects:
    public LoginPage(){
        PageFactory.initElements(driver, this);
    }

    public HomePage login(String username, String password){
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        //loginBtn.click();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", loginButton);

        return new HomePage();
    }

}
