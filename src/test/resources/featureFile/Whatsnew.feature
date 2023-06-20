@new
Feature: To test click the hot deals button
 
  @new
  Scenario: user have to login geeky mart
    Given user should be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username "mugeshmugesh35@gmail.com"
    And user have to enter password "Mugesh@143"
    #Then user should be in home page "Logout"
    Then user click Whatsnew button  in page
    And user have to select the product "TOOL KIT"
    And user  have to click the select dropdown button 
    And user have to click the select red
    And user have to click the addtocart1