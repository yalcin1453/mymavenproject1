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

public class CheckBox_RadioButton {







    WebDriver driver;
@Before
public void setUp(){
    WebDriverManager.chromedriver().setup();
    driver =new ChromeDriver();
    driver.get("https://the-internet.herokuapp.com/checkboxes");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);


}



@Test
public void checkBoxTest() throws InterruptedException {
    WebElement checkbox1= driver.findElement(By.xpath("(//input[@type='checkbox'])[1]"));
    WebElement checkbox2= driver.findElement(By.xpath("(//input[@type='checkbox'])[2]"));
   // Assert.assertTrue(checkbox1.isSelected());
   // Assert.assertTrue(checkbox2.isSelected());


    Thread.sleep(5);
    if(!checkbox1.isSelected()){
        checkbox1.click();
    }Thread.sleep(5);

    if(!checkbox2.isSelected()){
        checkbox2.click();
    }



}
@After
    public void teardown(){
    driver.close();
}




    }



