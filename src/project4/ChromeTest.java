package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class ChromeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //get the title
        System.out.println("Title of the page "+ driver.getTitle());
        //get the pageresource
        System.out.println("Resource of the page " + driver.getPageSource());
        //get current URL
        System.out.println("Current URL of the page " + driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("hthake");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("abc123");
        driver.close();
    }
}
