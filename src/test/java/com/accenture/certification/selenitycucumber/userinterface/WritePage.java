package com.accenture.certification.selenitycucumber.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.support.FindBy;

public class WritePage extends PageObject {

    @FindBy(xpath = "//div[@class='T-I T-I-KE L3']") private WebElementFacade redactEmailButton;
    @FindBy(xpath = "//textarea[@name='to']") private WebElementFacade emailDestinataryField;
    @FindBy(xpath = "//input[@name='subjectbox']") private WebElementFacade emailSubjectField;
    @FindBy(xpath = "//div[@class='Am Al editable LW-avf tS-tW']") private WebElementFacade emailBodyTextArea;
    @FindBy(xpath = "//div[@class='T-I J-J5-Ji aoO v7 T-I-atl L3']") private WebElementFacade sendEmailButton;


    public void selectNewEmailButton(){

        System.out.println("mori aca");
        this.redactEmailButton.waitUntilVisible().click();
        System.out.println("mori aca2");

    }
    public void writeEmail(String destinataryEmail, String subject, String bodyMessage){

        this.emailDestinataryField.waitUntilClickable().sendKeys(destinataryEmail);
        this.emailSubjectField.waitUntilClickable().sendKeys(subject);
        this.emailBodyTextArea.waitUntilClickable().sendKeys(bodyMessage);
        this.sendEmailButton.waitUntilClickable().click();
    }


}
