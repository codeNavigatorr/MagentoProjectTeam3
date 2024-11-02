Feature: MagentoLogin Functionality

  Scenario :opening a new user account


    Given Navigate to Magento
    When Creat an account
      | creatAccount |

    Then enter the requested information
      | firstName       | muhammet              |
      | lastName        | yazici                |
      | Email           | technoStudy@gmail.com |
      | password        | techno!123            |
      | ConfirmPassword | techno!123            |

    When Creat an account
      | creartAccountBTN |

    And User should login successfully
    And navigate to magento
    And Return to home page
