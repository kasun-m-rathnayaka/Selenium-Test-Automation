package com.saucedemo.pages;

import org.openqa.selenium.By;

public class ProductsPage extends BasePage{
    private By productPageHeader = By.xpath("//span[text()=\"Products\"]");

    public boolean isProductHeaderDisplayed(){
        return find(productPageHeader).isDisplayed();
    }
}
