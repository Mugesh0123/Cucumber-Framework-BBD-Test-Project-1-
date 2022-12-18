
@smoke
Feature: To test login geeky mart functionality
 
  @smoke
  Scenario: user have to login geeky mart
    Given user should be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username "mugeshmugesh35@gmail.com"
    And user have to enter password "Mugesh@143"
    Then user should be in home page "Logout"