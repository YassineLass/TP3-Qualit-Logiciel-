import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class tp3 {
    public static void main (String args []) throws InterruptedException

    {     WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();

        driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(2));
        driver.get("https://todomvc.com/");
        Thread.sleep(2000);
        driver.findElement(By.linkText("Backbone.js")).click();
        Thread.sleep(2000);
        WebElement element = driver.findElement(By.className("new-todo"));
        element.sendKeys("Meet a Friend");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        element.sendKeys("Buy Meat");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        element.sendKeys("clean the car");
        element.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("body > section > section > ul > li:nth-child(2) > div > input")).click();
        driver.findElement(By.cssSelector("body > section > section > ul > li:nth-child(3) > div > input")).click();

        WebDriverWait driverWait = new WebDriverWait(driver,10);
        try {
            driverWait.until(ExpectedConditions.textToBePresentInElement((WebElement) driver.findElement(By.cssSelector(("body > section >footer > span > strong","1")) )))
            driver.close();
        }
        catch (Exception e) {


        }







    }
}