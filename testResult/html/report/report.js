$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/muges/eclipse-workspace/test/src/test/resources/featureFile/LoginGeekyMart.feature");
formatter.feature({
  "name": "To test login geeky mart functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@smoke"
    }
  ]
});
formatter.scenario({
  "name": "user have to login geeky mart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@smoke"
    },
    {
      "name": "@smoke"
    }
  ]
});
formatter.step({
  "name": "user should be in login page \"https://www.geekymart.com/index.php?route\u003daccount/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_login_page(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter username \"mugeshmugesh35@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_username(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter password \"Mugesh@143\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_password(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user should be in home page \"Logout\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_home_page(String)"
});
formatter.result({
  "status": "passed"
});
});