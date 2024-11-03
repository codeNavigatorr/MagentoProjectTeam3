Feature: Search Functionality
  Background:
    Given Navigate to the website
    When Click on the  sing in button
    When Enter userName and Password and click sing in button
    Then User should login  successfully

@SmokeTest
  Scenario: Search item with SKU code
    And User sendKeys in the Element
      |searchInput|MJ12|
      And Click on the Element
        |searchButton|
        |productPhoto|
    Then SKU number should be displayed

  Scenario: Search item with SKU code Negative
    And User sendKeys in the Element

      |searchInput|MJ00|

    And Click on the Element
      |searchButton|
    Then Negative message notice should be displayed




