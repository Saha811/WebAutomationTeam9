Feature: Ebay Login Feature
  Scenario: Ebay Login Test Scenario
    Given User is already on the login page
    When Title of login page is eBay
    Then User click on "Sign In"
    Then User enters username and password
    And User clicks on login button
    And User is on homepage
