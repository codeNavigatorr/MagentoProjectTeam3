Feature: Login to Magento Functionality


  Scenario Outline:
    Given Navigate to Magento
    When Enter username and password and click login button at Magento
    Then User should login succesfully at Magento
    Then User should reach address book at magento

    When Add new Additionaladdress and Create a Phone Number  as "<phone>" Street Address as "<street>" City as "<city>" state as "<state>" Country as "<country>" Zipcode as "<zipcode>"
    When Address Saved Successfully confirmation
    Then Edit billing address at magento PhoneNumber as "5555555"
    Then Edit shipping address at magento city as "cityEditShippingAdress"
    Then delete address from additional address entries at magento

    Examples:
      | phone        | street              |city    |country|zipcode|
      | 11111111111  | sreetAdditonnal1    |cityAdd1|Turkey |34580  |
      | 22222222222  | sreetAdditonnal2    |cityAdd2|Turkey |34590  |
      | 33333333333  | sreetAdditonnal3    |cityAdd3|Turkey |34600  |







