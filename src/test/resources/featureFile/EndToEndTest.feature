@regression
Feature: To test login geeky mart functionality
 

  Scenario: user have to login geeky mart
    Given user should be in login page1 "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username1 "mugeshmugesh35@gmail.com"
    And user have to enter password1 "Mugesh@143"
    And user have to click all category and choose the product
    And user have to search the product and click
    And user have to add to card
    Then user should be verify view to card "4 Ports Changing Mood Light USB Hub with Digital Clock and Alarm"
    
    