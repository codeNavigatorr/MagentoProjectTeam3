Feature: DataTable Functionality
  @SmokeTest
  Scenario:  user login
    Given Navigate to the website
    When Click on the  sing in button
    When Enter userName and Password and click sing in button
    When The Forgot Your Password? should be displayed
    Then User should login  successfully
