@smoke
Feature: To test login geeky mart functionality
 
  @smoke
  Scenario: Successful Login with Valid Credentials in geekymart
    Given user have to be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter the username "subabose6@gmail.com"
    And user have to enter the password "Priya@99"
    Then user get in to  home page "Logout"
    