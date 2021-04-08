package com.accenture.certification.selenitycucumber.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin")
public class GmailPage extends PageObject {

    @FindBy(xpath = "//input[@id='identifierId']") private WebElementFacade userField;
    @FindBy(xpath = "//input[@name='password']") private WebElementFacade passwordField;

    public void enterKeywords(String username, String password) {

        this.userField.waitUntilClickable().typeAndEnter(username);
        this.passwordField.waitUntilClickable().typeAndEnter(password);


    }
}
