package com.saucedemo.pages;

import org.openqa.selenium.By;

public class LoginPage extends BasePage{
    private By userNameFld = By.id("user-name");
    private By passwordFld = By.id("password");
    private By LoginBtn = By.id("login-button");
    private By errorMsg = By.tagName("h3");

    public void setUserNameFld(String text){
        set(text,userNameFld);
    }

    public void setPasswordFld(String text){
        set(text,passwordFld);
    }

    public ProductsPage clickLoginBtn(){
        click(LoginBtn);
        return new ProductsPage();
    }

    public ProductsPage loginToTheApplication(String username, String password){
        setUserNameFld(username);
        setPasswordFld(password);
        return clickLoginBtn();
    }

    public String getErrorMsg(){
        return find(errorMsg).getText();
    }
}
