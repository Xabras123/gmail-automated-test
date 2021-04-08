package com.accenture.certification.selenitycucumber.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.PendingException;
import cucumber.api.SnippetType;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import cucumber.api.junit.Cucumber;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/send_new_email.feature",
        glue = "com.accenture.certification.selenitycucumber.stepdefinitions",
        snippets = SnippetType.CAMELCASE

)
public class SendNewEmail {



}
