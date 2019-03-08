import io.appium.java_client.AppiumDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class IntegrationApp {

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
        capabilities.setCapability("app","/Users/rahulmittapalli/Desktop/IntegrationApp.ipa");
        capabilities.setCapability("usePrebuiltWDA","true");
        capabilities.setCapability("fullReset", "true");
        capabilities.setCapability("useNewWDA","false");
        driver =new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElementByName("Alerts").click();
        Thread.sleep(5000);
        driver.closeApp();
    }
}
