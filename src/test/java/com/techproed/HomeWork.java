package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class HomeWork {
    WebDriver driver;

    @Before
    public void Setup() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        WebElement signInButton= driver.findElement(By.xpath("//a[@class='login']"));
        signInButton.click();
        WebElement email= driver.findElement(By.id("email_create"));
        email.sendKeys("fatih72@hotmail.com");
        WebElement clickAccount= driver.findElement(By.id("SubmitCreate"));
        clickAccount.click();


    }
    @Test
    public void personalInformation() throws InterruptedException {

        WebElement gender= driver.findElement(By.id("uniform-id_gender1"));
        gender.click();
        Thread.sleep(4);
        WebElement firstName= driver.findElement(By.id("customer_firstname"));
        firstName.sendKeys("fatih");
        Thread.sleep(4);
        WebElement lastName= driver.findElement(By.id("customer_lastname"));
        lastName.sendKeys("yalcin");
        Thread.sleep(4);
        WebElement password= driver.findElement(By.id("passwd"));
        password.sendKeys("ikbalefe0912");
        WebElement address= driver.findElement(By.id("address1"));
        address.sendKeys("152 sproul rd");
        WebElement city= driver.findElement(By.id("city"));
        city.sendKeys("Malvern");
        WebElement state= driver.findElement(By.id("id_state"));
        state.sendKeys("uniform-id_state");
        WebElement zipcode= driver.findElement(By.id("postcode"));
        zipcode.sendKeys("19355");
        WebElement phone= driver.findElement(By.id("phone"));
        phone.sendKeys("16102023338");
        WebElement mobilePhone= driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("61020233339");

        WebElement alias=driver.findElement(By.id("alias"));
        alias.sendKeys("my address");
        WebElement register= driver.findElement(By.xpath("//*[@id=\"submitAccount\"]/span/i"));
        register.click();








    }





}
