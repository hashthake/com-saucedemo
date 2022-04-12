package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FirefoxTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.gecko.driver","drivers/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //Set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //Get title of the page
        System.out.println("Title of the page "+ driver.getTitle());
        //Get page resource of the page
        System.out.println("Resource of the page "+ driver.getPageSource());
        //Get current URL of the page
        System.out.println("Current URL of the page "+ driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("hvthake");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("abc123");
        driver.close();
    }
}
