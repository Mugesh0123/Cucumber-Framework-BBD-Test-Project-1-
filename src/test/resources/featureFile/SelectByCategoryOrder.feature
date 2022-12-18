@sanity
Feature: user have to purchage the product through category (end to end test)


  @sanity
  Scenario: user have to purchage the product by category
    Given user should be in login pages geekymart "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter vaild usernames "mugeshmugesh35@gmail.com"
    And user have to enter vaild passwords "Mugesh@143"
    #//*[contains(text(),'Shop By Categories')]
    And user have to hover Shop By Categories option
    #//*[contains(text(),'Home & Lifestyle')]
    And user have to hover Home & Lifestyle option
    #(//*[contains(text(),'Home Decor')])[2]
    And user have to click Home Decor option
    #//*[contains(text(),'Award Winning Wall Gear Clock')]
    And user have to hover Award Winning Wall Gear Clock
    #(//*[contains(@class,'btn btn-outline') and contains(@type,'button')])[12]
    And user have to click addtocard option
    Then user should be verify the view to card "Award Winning Wall Gear Clock" 
    
    
