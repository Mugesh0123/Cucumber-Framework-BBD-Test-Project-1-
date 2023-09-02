@shop
Feature: To test login webshop functionality
 Background:
Given user should be in login page "https://demowebshop.tricentis.com/"
 
  @shop
  Scenario Outline: user have to login geeky mart
    #Given user should be in login page "https://demowebshop.tricentis.com/"
    When user Should be in logout 
    When user click login option
    When user have to enter <username> 
    And user have to enters <password> 
    And user click login submit button
    Then user should be in homepage <status>

  
    Examples: 
      |  username            | password   | status                              |
      | "mugesh1@gmail.com" | "Mugesh@1" |"Log out"                             |
      | "amala1@gmail.com"  | "amala@1"  |"No customer account found"           |
      
      
      
