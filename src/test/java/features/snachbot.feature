
@Test
Feature: Verify the Snachbot functionality for the users

    Scenario: Validating that user can click create new account button
       Given User has facebook url
       When user clicks create new account
       Then user sees the sign up page
       
    

