package com.herokuapp.theinternet.pages;


import com.herokuapp.theinternet.utility.Utility;
import org.openqa.selenium.By;

public class LoginPage extends Utility {

    By userNameBox = By.id("username");

    By userPasswordbox = By.id("password");

    By loginButton = By.xpath("//button[@type='submit']");

    By secureAreaText = By.xpath("//h2[text()=' Secure Area']");

    By invalidCredentialMessage = By.xpath("//div[@id='flash-messages']");


    public void enterUserName(String userNameText) {
        sendTextToElement(userNameBox, userNameText);
    }

    public void enterPassword(String passwordText) {
        sendTextToElement(userPasswordbox, passwordText);
    }

    public void clickOnLoginButton(){
        clickOnElement(loginButton);
    }

    public String getSecureAreaText() {
        return getTextFromElement(secureAreaText);
    }

    public String invalidUserAndPasswordMessage(){
        return getTextFromElement(invalidCredentialMessage).substring(0,25);
    }

}
