import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import org.junit.Assert;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumD {
    public static void main(String[] args) throws MalformedURLException {
        DesiredCapabilities dc = new DesiredCapabilities();
        dc.setCapability("platformName", "android");
        dc.setCapability("appPackage", "com.example.javaquizapp");
        dc.setCapability("appActivity", ".MainActivity");
        dc.setCapability("deviceName", "oppo");

        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),dc);
        MobileElement el1 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/button2");
        el1.click();
        MobileElement el2 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/button");
        el2.click();
        MobileElement el3 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/button2");
        el3.click();
        MobileElement el4 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/button");
        el4.click();
        MobileElement el5 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/button2");
        el5.click();
        MobileElement el6 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/button2");
        el6.click();
        MobileElement el7 = (MobileElement) driver.findElementById("com.example.javaquizapp:id/textView3");
        el7.click();

        Assert.assertEquals(driver.findElementById("com.example.javaquizapp:id/textView3").getText(), "Your Score is 2 out of 6");

    }
}
