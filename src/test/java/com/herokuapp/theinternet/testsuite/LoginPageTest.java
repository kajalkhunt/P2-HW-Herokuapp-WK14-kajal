package com.herokuapp.theinternet.testsuite;


import com.herokuapp.theinternet.pages.LoginPage;
import com.herokuapp.theinternet.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends BaseTest {
    LoginPage loginPage = new LoginPage();

    @Test

    public void UserShouldLoginSuccessfullyWithValidCredentials() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Secure Area";
        Assert.assertEquals(loginPage.getSecureAreaText(), expectedMessage, "User Not Logged In");
    }

    @Test

    public void verifyTheUsernameErrorMessage() {
        loginPage.enterUserName("tomsmith1");
        loginPage.enterPassword("SuperSecretPassword!");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your username is invalid!";
        Assert.assertEquals(loginPage.invalidUserAndPasswordMessage(), expectedMessage, "User Logged in Successfully");

    }

    @Test
    public void verifyThePasswordErrorMessage() {
        loginPage.enterUserName("tomsmith");
        loginPage.enterPassword("SuperSecretPassword");
        loginPage.clickOnLoginButton();
        String expectedMessage = "Your password is invalid!";
        Assert.assertEquals(loginPage.invalidUserAndPasswordMessage(), expectedMessage, "User Logged in Successfully");

    }
}
