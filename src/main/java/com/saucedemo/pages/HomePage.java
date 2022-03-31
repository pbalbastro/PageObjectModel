package com.saucedemo.pages;

import com.crm.qa.base.TestBase;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends TestBase {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
