import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selenuim {

    public static void main(String[] args) {
//        System.setProperty("webdriver.chromw.driver", "D:\\FOURTH_YEAR_I_SEM\\Software Testing\\Selenium Required Material\\chromedriver.exe");
//        WebDriver wd = new ChromeDriver();
//        wd.get("https://www.amazon.in/ ");
//        WebElement searchBox = wd.findElement(By.id("twotabsearchtextbox"));
//        searchBox.sendKeys("Iphone x");
////        searchBox.submit();
//
////        By clicking Button
//        wd.findElement((By.id("nav-search-submit-button"))).click();


        System.setProperty("webdriver.chromw.driver", "D:\\FOURTH_YEAR_I_SEM\\Software Testing\\Selenium Required Material\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js;
        js = (JavascriptExecutor) driver;
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
