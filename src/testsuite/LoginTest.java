package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String basUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before

public void setUp(){

        openBrowser(basUrl);
    }
    @Test
    public void userSholdLoginSuccessfullyWithValidCredentials(){

        //* Enter “Admin” username
        WebElement EnterUser = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        EnterUser.sendKeys("Admin");


        //* Enter “admin123 password
        WebElement EnterPassword = driver.findElement(By.xpath("//input[@name='txtPassword']"));
        EnterPassword.sendKeys("admin123");



        //* Click on ‘LOGIN’ button

        WebElement ClickLogin = driver.findElement(By.xpath("//input[@type='submit']"));
        ClickLogin.click();



        //* Verify the ‘Welcome’ text is display

        WebElement VerifyText = driver.findElement(By.xpath(""));
        VerifyText.getText();



    }

    @After
    public void tearDown(){

       // closeBrowser();
    }

    }


