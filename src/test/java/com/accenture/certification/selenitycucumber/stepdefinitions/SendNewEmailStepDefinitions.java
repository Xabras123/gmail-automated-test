package com.accenture.certification.selenitycucumber.stepdefinitions;

import com.accenture.certification.selenitycucumber.steps.Gmail;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SendNewEmailStepDefinitions {

    @Steps
    Gmail user;

    @Given("^Given that accenture Testing enters with (.*) and (.*)$")
    public void givenThatAccentureTestingEntersWithAccentureTestingAndAccenture(String arg1, String arg2) {
        // Write code here that turns the phrase above into concrete actions
        user.isTheHomePage();
        user.enterCredentials(arg1, arg2);

        //throw new PendingException();
    }


    @When("^Accenture Testing wants to send a new email to (.*) with subject (.*) and body (.*)$")
    public void accentureTestingWantsToSendANewEmailToCorreoPruebasTestingWithSubjectAutomationOfTestsAndBodyThisMessageWasGeneratedAutomatically(String arg1, String arg2, String arg3) {
        // Write code here that turns the phrase above into concrete actions
        user.createNewMail();
        user.writeNewEmail(arg1, arg2, arg3);
        //throw new PendingException();
    }

    @Then("^Accenture Testing expects to have sent your message to your friend with the subject (.*)$")
    public void accentureTestingExpectsToHaveSentYourMessageToYourFriendWithTheSubjectAutomationOfTests(String arg1) {
        // Write code here that turns the phrase above into concrete actions
        user.emailSends();
        user.checkListEmails(arg1);
        //throw new PendingException();
    }
}
