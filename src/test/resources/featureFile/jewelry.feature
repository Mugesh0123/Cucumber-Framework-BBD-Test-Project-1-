@page
Feature: Test the books page module

@page  

Scenario: 
    Then validated page title "Demo Web Shop. Books"
    Given user have click the books
    And user have  click the Computing and Internet
    And user  click the add to cart button
    Then user select shopping card button
    And user click the terms of shopping
    And  user click checkout button
    And user click  billing continue
    And user have click  shipping continue
    Then user have click  ground button
    And user have click  method continue
    Then user have click  cash
    And user have click  delivery continue
    Then user have click  userfinal


