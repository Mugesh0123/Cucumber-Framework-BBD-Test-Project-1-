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
  "error_message": "java.lang.NoSuchMethodError: \u0027com.google.common.collect.ImmutableMap com.google.common.collect.ImmutableMap.of(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object)\u0027\r\n\tat org.openqa.selenium.chrome.AddHasCasting.getAdditionalCommands(AddHasCasting.java:38)\r\n\tat org.openqa.selenium.chrome.ChromeDriver$ChromeDriverCommandExecutor.getExtraCommands(ChromeDriver.java:98)\r\n\tat org.openqa.selenium.chrome.ChromeDriver$ChromeDriverCommandExecutor.\u003cinit\u003e(ChromeDriver.java:93)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:81)\r\n\tat org.openqa.selenium.chrome.ChromeDriver.\u003cinit\u003e(ChromeDriver.java:49)\r\n\tat test.baseclass.BaseClass.lanchBrowser(BaseClass.java:24)\r\n\tat test.stepdefinition.StepDefinition.user_should_be_in_login_page(StepDefinition.java:19)\r\n\tat ✽.user should be in login page \"https://www.geekymart.com/index.php?route\u003daccount/login\"(file:/C:/Users/muges/eclipse-workspace/test/src/test/resources/featureFile/LoginGeekyMart.feature:7)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user have to enter username \"mugeshmugesh35@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_username(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user have to enter password \"Mugesh@143\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinition.user_have_to_enter_password(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "user should be in home page \"Logout\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinition.user_should_be_in_home_page(String)"
});
formatter.result({
  "status": "skipped"
});
});