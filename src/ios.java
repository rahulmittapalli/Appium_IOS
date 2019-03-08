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

public class ios {

    AppiumDriver driver =null;

    @Test

    public void play() throws MalformedURLException, InterruptedException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("deviceName","iPhone 7 Plus");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("udid", "c52fa1627c55cc67cd1861d47a46cb516ae5f7eb");
        capabilities.setCapability("autoGrantPermissions", "True");
        capabilities.setCapability("noReset", "True");
        capabilities.setCapability("app","Settings");
        capabilities.setCapability("startIWDP","True");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("xcodeSigningId", "iPhone Developer");
        capabilities.setCapability("xcodeOrgId", "[A339L8W434]");
        capabilities.setCapability("useNewWDA","false");
        driver =new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElementByName("General").click();
        driver.findElementByName("About").click();
        Thread.sleep(5000);
        driver.closeApp();
    }
}
