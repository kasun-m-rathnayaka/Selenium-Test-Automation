package com.saucedemo.test.test.login;

import com.saucedemo.test.base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void testLoginErrorMessage(){
        loginPage.setUserNameFld("standard_user");
        loginPage.setPasswordFld("xyz");
        loginPage.clickLoginBtn();
        String actualMsg = loginPage.getErrorMsg();
        Assert.assertTrue(actualMsg.contains("Epic sadface"));
    }
}
