import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.ios.IOSElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Calculator {

    AppiumDriver driver =null;

    @Test

    public void play() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName","iPhone 7 Plus");
        capabilities.setCapability("udid", "c52fa1627c55cc67cd1861d47a46cb516ae5f7eb");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("app","com.apple.calculator");
        capabilities.setCapability("clearSystemFiles", true);
        driver =new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElementByName("2").click();
        driver.findElementByName("0").click();
        driver.findElementByName("0").click();
        driver.findElementByName("add").click();
        driver.findElementByName("4").click();
        driver.findElementByName("0").click();
        driver.findElementByName("0").click();
        driver.findElementByName("equals").click();
        String value=driver.findElementByName("Result").getText();
        System.out.println(value);
        System.out.println("Type of the value is "+value.getClass().getName());
        Assert.assertEquals("600",value);
        driver.closeApp();
    }
}
