$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:/C:/Users/muges/eclipse-workspace/test/src/test/resources/featureFile/EndToEndTest.feature");
formatter.feature({
  "name": "To test login geeky mart functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.scenario({
  "name": "user have to login geeky mart",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@sanity"
    }
  ]
});
formatter.step({
  "name": "user should be in login page1 \"https://www.geekymart.com/index.php?route\u003daccount/login\"",
  "keyword": "Given "
});
formatter.match({
  "location": "EndToEndTest.user_should_be_in_login_page(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter username1 \"mugeshmugesh35@gmail.com\"",
  "keyword": "When "
});
formatter.match({
  "location": "EndToEndTest.user_have_to_enter_username(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to enter password1 \"Mugesh@143\"",
  "keyword": "And "
});
formatter.match({
  "location": "EndToEndTest.user_have_to_enter_password(Integer,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to click all category and choose the product",
  "keyword": "And "
});
formatter.match({
  "location": "EndToEndTest.user_have_to_click_all_category_and_choose_the_product()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to search the product and click",
  "keyword": "And "
});
formatter.match({
  "location": "EndToEndTest.user_have_to_search_the_product_and_click()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user have to add to card",
  "keyword": "And "
});
formatter.match({
  "location": "EndToEndTest.user_have_to_add_to_card()"
});
formatter.result({
  "error_message": "org.openqa.selenium.NoSuchElementException: no such element: Unable to locate element: {\"method\":\"xpath\",\"selector\":\"/html/body/div[3]/div[1]/div[2]/div/div/section/div/div[1]/div/div[2]/div[4]/div/div[2]/div[1]/button\"}\n  (Session info: chrome\u003d108.0.5359.125)\nFor documentation on this error, please visit: https://selenium.dev/exceptions/#no_such_element\nBuild info: version: \u00274.3.0\u0027, revision: \u0027a4995e2c09*\u0027\nSystem info: host: \u0027DESKTOP-5M4OGG2\u0027, ip: \u0027192.168.43.108\u0027, os.name: \u0027Windows 10\u0027, os.arch: \u0027amd64\u0027, os.version: \u002710.0\u0027, java.version: \u002718.0.1.1\u0027\nDriver info: org.openqa.selenium.chrome.ChromeDriver\nCommand: [54453a9f22fd3523251e5fcde9b02217, findElement {using\u003dxpath, value\u003d/html/body/div[3]/div[1]/div[2]/div/div/section/div/div[1]/div/div[2]/div[4]/div/div[2]/div[1]/button}]\nCapabilities {acceptInsecureCerts: false, browserName: chrome, browserVersion: 108.0.5359.125, chrome: {chromedriverVersion: 108.0.5359.71 (1e0e3868ee06..., userDataDir: C:\\Users\\muges\\AppData\\Loca...}, goog:chromeOptions: {debuggerAddress: localhost:50857}, networkConnectionEnabled: false, pageLoadStrategy: normal, platformName: WINDOWS, proxy: Proxy(), se:cdp: ws://localhost:50857/devtoo..., se:cdpVersion: 108.0.5359.125, setWindowRect: true, strictFileInteractability: false, timeouts: {implicit: 0, pageLoad: 300000, script: 30000}, unhandledPromptBehavior: dismiss and notify, webauthn:extension:credBlob: true, webauthn:extension:largeBlob: true, webauthn:virtualAuthenticators: true}\nSession ID: 54453a9f22fd3523251e5fcde9b02217\r\n\tat java.base/jdk.internal.reflect.DirectConstructorHandleAccessor.newInstance(DirectConstructorHandleAccessor.java:67)\r\n\tat java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:499)\r\n\tat java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:483)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:200)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:133)\r\n\tat org.openqa.selenium.remote.codec.w3c.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:53)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:184)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.invokeExecute(DriverCommandExecutor.java:167)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:142)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:569)\r\n\tat org.openqa.selenium.remote.ElementLocation$ElementFinder$2.findElement(ElementLocation.java:162)\r\n\tat org.openqa.selenium.remote.ElementLocation.findElement(ElementLocation.java:60)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:387)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.findElement(RemoteWebDriver.java:379)\r\n\tat org.openqa.selenium.support.pagefactory.DefaultElementLocator.findElement(DefaultElementLocator.java:70)\r\n\tat org.openqa.selenium.support.pagefactory.internal.LocatingElementHandler.invoke(LocatingElementHandler.java:39)\r\n\tat jdk.proxy2/jdk.proxy2.$Proxy26.getWrappedElement(Unknown Source)\r\n\tat org.openqa.selenium.remote.internal.WebElementToJsonConverter.apply(WebElementToJsonConverter.java:51)\r\n\tat java.base/java.util.stream.ReferencePipeline$3$1.accept(ReferencePipeline.java:197)\r\n\tat java.base/java.util.Spliterators$ArraySpliterator.forEachRemaining(Spliterators.java:992)\r\n\tat java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)\r\n\tat java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)\r\n\tat java.base/java.util.stream.ReduceOps$ReduceOp.evaluateSequential(ReduceOps.java:921)\r\n\tat java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:234)\r\n\tat java.base/java.util.stream.ReferencePipeline.collect(ReferencePipeline.java:682)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.executeScript(RemoteWebDriver.java:500)\r\n\tat test.baseclass.BaseClass.scrollByElement(BaseClass.java:60)\r\n\tat test.stepdefinition.EndToEndTest.user_have_to_add_to_card(EndToEndTest.java:56)\r\n\tat ✽.user have to add to card(file:/C:/Users/muges/eclipse-workspace/test/src/test/resources/featureFile/EndToEndTest.feature:11)\r\n",
  "status": "failed"
});
formatter.step({
  "name": "user should be verify view to card \"4 Ports Changing Mood Light USB Hub with Digital Clock and Alarm\"",
  "keyword": "Then "
});
formatter.match({
  "location": "EndToEndTest.user_should_be_verify_view_to_card(String)"
});
formatter.result({
  "status": "skipped"
});
});