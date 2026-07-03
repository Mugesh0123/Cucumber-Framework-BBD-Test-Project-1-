@login1
Feature: Login the website

Scenario: User should login the website

Given user should be in login  page "https://demowebshop.tricentis.com/"
    When user have to click login option
    When user  enter username "mugesh1@gmail.com"
    And user enter password "Mugesh@1"
    And user click login button
    Then user should be in webshop home page "Logout"
