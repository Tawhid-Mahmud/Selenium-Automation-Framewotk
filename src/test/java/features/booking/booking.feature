@Test2
Feature: Verify booking.com flight page
    Scenario: Validating booking.com page
      Given User has the url
      When User clicks on the Flight button from the nev bar
      Then User clicks the round trip option

    Scenario: Validating where from field
      Given User has the field to click where from option
      When user types "new" in the input field
      Then user choose the third option "jfk"

    Scenario: Validating where to field
      Given User has the where to field to click
      When user can type "bangla" in the input field
      Then user can choose the first option

    Scenario: Validating the date field
      Given User has the option to click on the date field
      When user clicks on the date field, calendar shows up
      Then user can choose the departure date and return date
      And user can can click the search button

    Scenario: Validating the result options
      Given user can see multiple flight options
      When user can click on the "Cheapest" button
      Then from the first option user can click "View details" button
      And click the "Select" button

    Scenario: Confirming trip summary
      Given user navigated to the choose your fare page
      When user confirms trip summary
      Then test is done