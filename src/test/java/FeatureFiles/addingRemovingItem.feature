Feature: Adding/removing item Functionality
  Background:
    Given Navigate to the website
    When Click on the  sing in button
    When Enter userName and Password and click sing in button
    Then User should login  successfully

  Scenario: Adding/removing item from shopping cart
      And Click on the Element
      |randomItem|
      |itemSize|
      |itemColor|
      |itemQTY|
      And User sendKeys in the Element
      |itemQTY|2|
      And Click on the Element
      |addToCart|
      |shoppingCartBox|
      |deleteButton|
      |OK|

