@Feature1
Feature: Functionality - send email on the gmail page.
  AS an AccentureTesting@gmail.com user
  I want to send an email
  To expose an introduction to de automation of cucumber tests, and in pickle languange.

  Background: Open the browser on Gmail page and access with AcentureTesting2018 credentials
    Given Given that accenture Testing enters with correoPruebasTesting123 and correoPruebasTesting456_

  @Tag1
  Scenario: TEST TO BE PERFORMED - Send Email from the Gmail page.
    When Accenture Testing wants to send a new email to xabras123@gmail.com with subject Automation of tests and body This message was generated automatically
    Then Accenture Testing expects to have sent your message to your friend with the subject Automation of tests

