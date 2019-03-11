import io.appium.java_client.AppiumDriver;
import io.appium.java_client.TouchAction;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;
import java.io.IOException;
import java.net.URL;
import java.time.Duration;

public class contacts {

    AppiumDriver driver =null;
    @Test

    public void play() throws IOException, InterruptedException {


        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", "iOS");
        capabilities.setCapability("deviceName","iPhone 7 Plus");
        capabilities.setCapability("udid", "c52fa1627c55cc67cd1861d47a46cb516ae5f7eb");
        capabilities.setCapability("automationName","XCUITest");
        capabilities.setCapability("platformVersion", "12.1");
        capabilities.setCapability("noReset", "true");
        capabilities.setCapability("app","com.apple.MobileAddressBook");
        capabilities.setCapability("clearSystemFiles", true);
        driver =new IOSDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
        driver.findElementByName("Add").click();
        driver.findElementByName("First name").sendKeys("Naveen");
        driver.findElementByName("Last name").sendKeys("Kumar");
        Thread.sleep(2000);
        driver.findElementByName("add phone").click();
        driver.findElementByName("add phone").sendKeys("1234567890");
        driver.findElementByName("Add photo").click();
        driver.findElementByName("Choose Photo").click();
        Thread.sleep(3000);
        driver.findElementByName("Moments").click();
        driver.findElementByName("Live Photo, Portrait, 08 March, 10:05 AM").click();
        driver.findElementByName("Choose").click();
        Thread.sleep(3000);
        driver.findElementByName("Done").click();
        Thread.sleep(5000);
        driver.findElementByName("Contacts").click();
        driver.findElementByName("Naveen Kumar").click();
        Thread.sleep(3000);
        driver.findElementByName("Edit").click();
        scrollDown();
        scrollDown();
        System.out.println("scrolled to the bottom");
        driver.findElementByName("Delete Contact").click();
        Thread.sleep(2000);
        driver.findElementByName("Delete Contact").click();
        Thread.sleep(3000);
        driver.closeApp();
    }
    private void scrollDown() {
        //if pressX was zero it didn't work for me
        int pressX = driver.manage().window().getSize().width / 2;
        // 4/5 of the screen as the bottom finger-press point
        int bottomY = (driver.manage().window().getSize().height * 4/5);
        // just non zero point, as it didn't scroll to zero normally
        int topY = driver.manage().window().getSize().height /8;
        //scroll with TouchAction by itself
        scroll(pressX, bottomY, pressX, topY);
    }
    private void scroll(int fromX, int fromY, int toX, int toY) {
        TouchAction touchAction = new TouchAction(driver);
        touchAction.longPress(PointOption.point(fromX,fromY)).moveTo(PointOption.point(toX, toY)).release().perform();
    }
}
