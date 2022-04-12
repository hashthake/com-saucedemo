package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class EdgeTest {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.edge.driver","drivers/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.get(baseUrl);
        //maximize window
        driver.manage().window().maximize();
        //set time
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        //title of the page
        System.out.println("Title of the page " + driver.getTitle());
        //page resource
        System.out.println("Page resource " + driver.getPageSource());
        //Current URL of the page
        System.out.println("Current URL of the page "+ driver.getCurrentUrl());

        WebElement userName = driver.findElement(By.id("user-name"));
        userName.sendKeys("hthake");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("abc123");
        driver.close();
    }
}
