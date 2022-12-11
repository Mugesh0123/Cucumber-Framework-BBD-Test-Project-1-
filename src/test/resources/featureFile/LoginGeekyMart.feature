#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Templat
@smoke
Feature: To test login geeky mart functionality
 
  @smoke
  Scenario: user have to login geeky mart
    Given user should be in login page "https://www.geekymart.com/index.php?route=account/login"
    When user have to enter username "mugeshmugesh35@gmail.com"
    And user have to enter password "Mugesh@143"
    Then user should be in home page "Logout"