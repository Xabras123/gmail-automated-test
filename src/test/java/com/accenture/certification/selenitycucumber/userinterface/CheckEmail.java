package com.accenture.certification.selenitycucumber.userinterface;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class CheckEmail extends PageObject {


    boolean check;
    @FindBy(xpath = "//div[@class='TO']//a[@href='https://mail.google.com/mail/u/0/#sent']")
    private WebElementFacade sendsButton;

    private List<WebElement> emailsRecivedElements;

    @FindBy(xpath = "(//span[@data-hovercard-id='xabras123@gmail.com' and text()='xabras123'])[1]")
    private WebElementFacade firstEmailRecivedElement;

    public void buttonSends(){
        sendsButton.waitUntilEnabled();
        sendsButton.waitUntilVisible().click();

    }

    public void listEmailSends(String affair){

        System.out.println("valorrrr1 ");
        firstEmailRecivedElement.waitUntilPresent();
        System.out.println("valorrrr2 ");
        emailsRecivedElements = getDriver().findElements(By.xpath("//span[@class='bog']//span"));
        System.out.println("valorrrr3 ");
        check = emailsRecivedElements.get(8).getText().equals(affair) ;

        System.out.println("valorrrr4 " + emailsRecivedElements.get(8).getText());

        if (check){
            assertTrue(true);
        }else{
            assertTrue(false);
        }

    }


}
