
@Test_Facebook

Feature: Verify the Snachbot functionality for the users

    Scenario: Validating that user can click create new account button
       Given User has facebook url
       When user clicks create new account
       Then user sees the sign up page

#    Scenario: Verify sign up page
#      Given user is in sign up page
#      When user fills first name, last name, mobile number, password, date of birth, and gender
#      Then user can click the sign up page
#      And create an account successfully



    

