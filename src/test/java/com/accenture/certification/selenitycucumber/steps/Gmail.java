package com.accenture.certification.selenitycucumber.steps;

import com.accenture.certification.selenitycucumber.userinterface.CheckEmail;
import com.accenture.certification.selenitycucumber.userinterface.GmailPage;
import com.accenture.certification.selenitycucumber.userinterface.WritePage;
import net.thucydides.core.annotations.Step;

public class Gmail {

    GmailPage gmailPage;
    WritePage writePage;
    CheckEmail checkEmail;

    @Step
    public void isTheHomePage(){
        gmailPage.open();
    }

    @Step
    public void enterCredentials(String username, String password){
        gmailPage.enterKeywords(username, password);
    }

    @Step
    public void createNewMail(){
        writePage.selectNewEmailButton();
    }

    @Step
    public void writeNewEmail(String destinataryEmail, String subject, String bodyMessage){

        writePage.writeEmail(destinataryEmail,subject,bodyMessage);
    }

    @Step
    public void emailSends(){
        checkEmail.buttonSends();
    }

    @Step
    public void checkListEmails(String affair) {
        checkEmail.listEmailSends(affair);
    }



}
