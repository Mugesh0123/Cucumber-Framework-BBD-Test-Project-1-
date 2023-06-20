
@testfile
Feature: To test click the hot deals button
 
  @testfile
  Scenario: user have to login geeky mart
    Given user should be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username "mugeshmugesh35@gmail.com"
    And user have to enter password "Mugesh@143"
    #Then user should be in home page "Logout"
    Then user click hot deal button  in page
    And user have to select the product"Car Lighter Port USB Adapter"
    And user  have to click the select drop button 
    And user have to click the select black
    And user have to click the addtocart
     
    