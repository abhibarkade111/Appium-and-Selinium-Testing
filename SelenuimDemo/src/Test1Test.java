// Generated by Selenium IDE
//import org.junit.Test;
//import org.junit.Before;
//import org.junit.After;
//import static org.junit.Assert.*;
//import static org.hamcrest.CoreMatchers.is;
//import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class Test1Test {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
//  @Before
  public void setUp() {
    System.setProperty("webdriver.chromw.driver", "D:\\FOURTH_YEAR_I_SEM\\Software Testing\\Selenium Required Material\\chromedriver.exe");
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
//  @After
  public void tearDown() {
    driver.quit();
  }
//  @Test
  public void test1() {
    driver.get("https://www.amazon.in/");
    driver.manage().window().setSize(new Dimension(770, 824));
    driver.findElement(By.id("twotabsearchtextbox")).click();
    driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphoneX");
    driver.findElement(By.cssSelector("div:nth-child(1) > .s-suggestion-container > .s-suggestion")).click();
    driver.findElement(By.cssSelector(".\\_bXVsd_gridColumn_2Jfab:nth-child(1) .\\_bXVsd_image_1pfbQ")).click();
    js.executeScript("window.scrollTo(0,1524)");
    js.executeScript("window.scrollTo(0,1419.199951171875)");
    driver.findElement(By.linkText("Best Sellers")).click();
    {
      WebElement element = driver.findElement(By.linkText("Best Sellers"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    driver.findElement(By.cssSelector("#B07MX26G8P .a-dynamic-image")).click();
    js.executeScript("window.scrollTo(0,3418.39990234375)");
    js.executeScript("window.scrollTo(0,4027.199951171875)");
    driver.findElement(By.name("submit.addToCart")).click();
    {
      WebElement element = driver.findElement(By.linkText("Go to Cart"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    driver.findElement(By.name("proceedToRetailCheckout")).click();
    driver.close();
  }
}
