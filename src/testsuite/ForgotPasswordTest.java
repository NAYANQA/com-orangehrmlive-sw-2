package testsuite;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ForgotPasswordTest extends BaseTest {


    String basUrl = "https://opensource-demo.orangehrmlive.com/";

    @Before

    public void setUp(){

        openBrowser(basUrl);
    }
    @Test
    public void UserShouldNavigateToForgotPasswordPageSuccessfully (){

       //* click on the ‘Forgot your password’ link
        WebElement ClickLink = driver.findElement(By.xpath("//a[@href='/index.php/auth/requestPasswordResetCode']"));
        ClickLink.click();



        //* Verify the text ‘Forgot Your Password?’

        WebElement VerifyTest = driver.findElement(By.xpath("//div[@class='head']"));
        VerifyTest.getText();



    }

    @After
    public void tearDown(){

       // closeBrowser();
    }

}

