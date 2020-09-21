package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BeforeAfterMethods {
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
        if(expectedTitle.equals(actualTitle)){
            System.out.println("passed");
        }else{
            System.out.println("failed");
            System.out.println(expectedTitle);
            System.out.println(actualTitle);
        }


    }

    @Test
    public void imageTest(){

        WebElement google= driver.findElement(By.xpath("//img[@id='hplogo']"));
        if(google.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }


    @Test
    public void gmailLinkTest(){

        WebElement gmail= driver.findElement(By.xpath("//a[@class='gb_g'][1]"));
        if(gmail.isDisplayed()){
            System.out.println("passed");
        }else{
            System.out.println("failed");
        }
    }
@After
public void tearDown(){
    driver.close();
}
}
