Feature: To test geeky mart home button functionality
 
  @regression
  Scenario: user have to login geeky mart click home button
    Given user  login page "https://www.geekymart.com/index.php?route=account/login"
    When user  enter username "mugeshmugesh35@gmail.com"
    And user  enter password "Mugesh@143"    
    Then user  in home page "Logout"
    And user click home button
    