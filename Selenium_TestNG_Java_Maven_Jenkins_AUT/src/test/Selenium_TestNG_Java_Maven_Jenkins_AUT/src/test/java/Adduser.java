import org.assertj.core.api.SoftAssertions;
import org.assertj.core.api.StringAssert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class Adduser{
    public static void main(String[] args) throws InterruptedException {
        String url = "https://login.mailchimp.com/";
        String chromeDriverPath = "C:\\software\\chromedriver_win32 (3)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(url);
        Thread.sleep(100);

        String signUpUrl="https://login.mailchimp.com/signup/";
        driver.get(signUpUrl);


        String businessEmail = "//input[@id='email']";         //xpath
        String newUserName = "//input[@id='new_username']";
        String newPassword = "//input[@id='new_password']";
        //String checkBox = "//input[@name='marketing_newsletter']";
        String signUpButton = "//*[@id='create-account-enabled']";

        //Thread.sleep(2000);

        WebElement eleBusinessEmail = driver.findElement(By.xpath(businessEmail));
        WebElement eleNewUserName = driver.findElement(By.xpath(newUserName));
        WebElement eleNewPassword = driver.findElement(By.xpath(newPassword));
        // WebElement eleCheckBox = driver.findElement(By.cssSelector(checkBox));
        WebElement eleSignUpButton=driver.findElement(By.xpath(signUpButton));


        eleBusinessEmail.sendKeys("abcdd@gmail.com");     //giving input according to textbox
        eleNewUserName.sendKeys(" ");
        eleNewPassword.sendKeys("Radha@1234");
        // eleCheckBox.click();
        eleSignUpButton.click();
        //driver.quit();
        SoftAssertions softly = new SoftAssertions();
        softly.assertThat("successfully created new account");
    }
}

