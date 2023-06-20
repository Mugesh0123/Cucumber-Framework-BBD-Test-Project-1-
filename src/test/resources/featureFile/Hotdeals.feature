@HotDeals
Feature: 
  To test the hotdeals button
   @HotDeals
  Scenario: Successful Hotdeals test
   Given user should be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username "mugeshmugesh35@gmail.com"
    And user have to enter password "Mugesh@143"
    And User have to click the hotdeals button
    And It shows list of Special offers product "5 RCA COMPONENT CABLE DESIGN FOR NINTENDO WII" 
    Then User move into AddToCard 
    And Click the cart
    And view the cart
     

  