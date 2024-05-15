# new feature
# Tags: optional
@Test_Stay_Page
Feature: Verifying Booking.com Stays page

  Scenario: Test Stays page
      Given User has the booking.com url
      When User click on the Stays button
      And Enters New York on the Where are you going? section
      And Enters May 15 for check-in date
      And Enters May 20 for check-out date
      And Two Adults and One room for occupancy box
      Then Click the search button