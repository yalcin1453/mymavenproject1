package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AssertionAnnotation {

    WebDriver driver;
    @Before
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver =new ChromeDriver();
        driver.get("https://www.google.com");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


    }



    @Test
    public void titleTest(){


        String expectedTitle= "Google";
        String actualTitle= driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);


    }

    @Test
    public void imageTest(){

        WebElement google= driver.findElement(By.xpath("//img[@id='hplogo']"));
        Assert.assertTrue(google.isDisplayed());

    }


    @Test
    public void gmailLinkTest(){

        WebElement gmail= driver.findElement(By.xpath("//a[@class='gb_g'][1]"));
        Assert.assertTrue(gmail.isDisplayed());

    }
    @After
    public void tearDown(){
        driver.close();
    }






}
