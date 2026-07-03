package test.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.time.Duration;
import java.util.Properties;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseClass {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static WebElement element;
	public static final int CONSTANT_WAIT_TIME = 60;
	public static Properties properties = new Properties();
	
	public static String getProperties() {
		// Load properties from project-relative properties/config.properties
		String userDir = System.getProperty("user.dir");
		File propFile = new File(userDir + File.separator + "properties" + File.separator + "config.properties");
		try (InputStream input = new FileInputStream(propFile)) {
			properties.load(input);
		} catch (IOException e) {
			e.printStackTrace();
		}

		String value1 = properties.getProperty("url");
		return value1;
	}

	public static void lanchBrowser() {
		// Ensure driver binaries are available and start Chrome
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		// add any default options here if needed
		driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		// initialize explicit wait instance
		wait = new WebDriverWait(driver, Duration.ofSeconds(CONSTANT_WAIT_TIME));
	}

	public static void url(String url) {
		driver.get(url);
	}

	public static void QAStagingUrl(String url) {
		driver.get(url);
	}

	public static void fillTheTextBox(WebElement element, String text) {
		element.sendKeys(text);
	}

	public static void buttonClick(WebElement element) {
		element.click();
	}

	public static void getElementText(WebElement element) {
		element.getText();
	}

	public static void selectDropDown(WebElement e1, String selectByValue) {
		Select select = new Select(e1);
		select.selectByValue(selectByValue);
	}

	public static void selectDropDown(WebElement e1, int selectByIndex) {
		Select select = new Select(e1);
		select.selectByIndex(selectByIndex);
	}

	public static void selectDropDown(String selectByVisibleText, WebElement e1) {
		Select select = new Select(e1);
		select.selectByVisibleText(selectByVisibleText);
	}

	public static void waiting(int sec) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(sec));
	}

	public static void utilWait(WebElement e1, int sec) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		wait.until(ExpectedConditions.elementToBeClickable(e1)).click();
	}

	public static void scrollByElement(WebElement e1) {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].scrollIntoView();", e1);

	}

	public static void moveToElement(WebElement e1) {
		Actions act = new Actions(driver);
		act.moveToElement(e1);
	}

	public static void implicityWait(int time) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(time));
	}

	public static WebElement waitForElementToVisible(WebElement element) {

		return wait.until(ExpectedConditions.visibilityOf(element));
	}

	public static WebElement waitForElementClickable(WebElement element) {

		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	public static void clickElement(WebElement element) {
		waitForElementClickable(element).click();
	}

	public static void sendText(WebElement element, String text) {
		waitForElementClickable(element).sendKeys(text);
	}

	public static String getText(WebElement element) {
		waitForElementClickable(element);
		return waitForElementClickable(element).getText();
	}

}
