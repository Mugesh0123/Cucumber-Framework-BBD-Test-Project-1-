@class1
Feature: To test click home button
 
  @class1
  Scenario: user have to login geeky mart
    Given user should be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username "mugeshmugesh35@gmail.com"
    And user have to enter password "Mugesh@143"
    Then user should be in home page "Logout"
    And click hot deal button in page
    And click product1 button in page