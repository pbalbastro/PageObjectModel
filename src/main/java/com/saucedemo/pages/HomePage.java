package com.saucedemo.pages;

import com.saucedemo.base.Base;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Base {

    public HomePage() {
        PageFactory.initElements(driver, this);
    }
}
