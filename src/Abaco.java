import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Abaco {

    AppiumDriver driver =null;

    @Test

    public void play() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "ios");
        capabilities.setCapability("deviceName","iPhone 7 Plus");
        capabilities.setCapability("udid", "c52fa1627c55cc67cd1861d47a46cb516ae5f7eb");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("xcodeOrgId", "A339L8W434");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("noReset", "false");
        capabilities.setCapability("app","/Users/rahulmittapalli/Documents/Abaco.ipa");
        capabilities.setCapability("usePrebuiltWDA","true");
        capabilities.setCapability("fullReset", "true");
        capabilities.setCapability("useNewWDA","false");
        driver =new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElementByName("Username").sendKeys("username");
        driver.findElementByName("Password").sendKeys("password");
        WebElement signin=driver.findElementByXPath("(//XCUIElementTypeOther[@name='SIGN IN'])[2]");
        signin.click();
        Thread.sleep(5000);
        WebElement customerview=driver.findElementByName("Customers CREATE VIEW");
        customerview.findElement(By.name("VIEW")).click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='NAME Mobig'])[1]").click();
        Thread.sleep(2000);
        driver.findElementByName("Draft Orders").click();
        driver.findElementByName("Order History").click();
        driver.findElementByName("Linked Accounts").click();
        driver.findElementByName("Available Accounts").click();
        driver.findElementByName("Inventory").click();
        driver.findElementByName("Users").click();
        driver.findElementByName("Profile").click();
        WebElement backArrow=driver.findElementByXPath("(//XCUIElementTypeOther[@name='MOBIG'])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
        backArrow.click();
        Thread.sleep(3000);
        WebElement mainMenu=driver.findElementByXPath("(//XCUIElementTypeOther[@name='CUSTOMERS'])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther");
        mainMenu.click();
        driver.findElementByName("Catalog").click();
        driver.findElementByName("Product Specs").click();
        driver.findElementByXPath("(//XCUIElementTypeOther[@name='Product Specs'])[2]/XCUIElementTypeOther[1]/XCUIElementTypeOther").click();
        driver.findElementByName("Dashboard").click();
        Thread.sleep(5000);
        driver.closeApp();
    }
}
