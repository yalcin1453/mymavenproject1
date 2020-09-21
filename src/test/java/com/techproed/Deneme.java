package com.techproed;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Deneme {


    WebDriver driver;
    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("http://automationpractice.com/index.php");
    }
    @Test
    public void signIn() throws InterruptedException {
        WebElement signIn = driver.findElement(By.linkText("Sign in"));
        signIn.click();
        WebElement emailAccountButton = driver.findElement(By.id("email_create"));
        emailAccountButton.sendKeys("Amerika123@gmail.com");
        Thread.sleep(2000);
        WebElement createAccountButton = driver.findElement(By.id("SubmitCreate"));
        createAccountButton.click();
        WebElement createAccountText = driver.findElement(By.className("page-heading"));
        Assert.assertTrue(createAccountText.isDisplayed());
        WebElement personalInformationText = driver.findElement(By.xpath("(//h3[@class='page-subheading'])[1]"));
        Assert.assertTrue(personalInformationText.isDisplayed());
        WebElement titleText = driver.findElement(By.xpath("//label[1]"));
        Assert.assertTrue(titleText.isDisplayed());
        Thread.sleep(2000);
        WebElement selectTitle = driver.findElement(By.id("id_gender2"));
        selectTitle.click();
        WebElement firstNameBox = driver.findElement(By.id("customer_firstname"));
        firstNameBox.sendKeys("Emily");
        WebElement lastNameBox = driver.findElement(By.id("customer_lastname"));
        lastNameBox.sendKeys("Arlington");
        WebElement emailBox = driver.findElement(By.xpath("//input[@id='email']"));
        Assert.assertTrue(emailBox.isDisplayed());
        Thread.sleep(2000);
        WebElement passwordBox = driver.findElement(By.xpath("//input[@type='password']"));
        passwordBox.sendKeys("12345"+ Keys.TAB);
        WebElement signUpNewsletterButton = driver.findElement(By.id("newsletter"));
        signUpNewsletterButton.click();
        WebElement firstName2 = driver.findElement(By.xpath("//input[@name='firstname']"));
        Assert.assertTrue(firstName2.isDisplayed());
        WebElement lastName2 = driver.findElement(By.xpath("//input[@name='lastname']"));
        Assert.assertTrue(lastName2.isDisplayed());
        WebElement companyButton = driver.findElement(By.id("company"));
        companyButton.sendKeys("VERIZON");
        WebElement addressButton = driver.findElement(By.id("address1"));
        addressButton.sendKeys("innovation dr.");
        WebElement cityButton = driver.findElement(By.xpath("//input[@id='city']"));
        cityButton.sendKeys("California");
        WebElement postalCodeButton = driver.findElement(By.xpath("//input[@class='form-control uniform-input text']"));
        postalCodeButton.sendKeys("12323");
        WebElement additionalInformationButton = driver.findElement(By.xpath("//textarea[@name='other']"));
        additionalInformationButton.sendKeys("No information");
        WebElement homePhone = driver.findElement(By.xpath("//input[@id='phone']"));
        homePhone.sendKeys("1234567890");
        Thread.sleep(2000);
        WebElement mobilePhone = driver.findElement(By.id("phone_mobile"));
        mobilePhone.sendKeys("0987654321");
        WebElement referenceName = driver.findElement(By.xpath("//input[@id='alias']"));
        referenceName.sendKeys("Tech");
        WebElement registerButton = driver.findElement(By.xpath("//button[@id='submitAccount']"));
        registerButton.click();
    }


}
