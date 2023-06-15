import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
//Adding a new user 
public class Adduser{
    public static void main(String[] args) throws InterruptedException {
        String url = "https://login.mailchimp.com/";
        //chrome set up 
        String chromeDriverPath = "C:\\software\\chromedriver_win32 (3)\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize(); //to maximize the screen
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.get(url);
        Thread.sleep(100);
        //singup url 
        String signUpUrl="https://login.mailchimp.com/signup/";
        driver.get(signUpUrl);
         //Xpaths of the elements in singup page
        String businessEmail = "//input[@id='email']";        
        String newUserName = "//input[@id='new_username']";
        String newPassword = "//input[@id='new_password']";
        //String checkBox = "//input[@name='marketing_newsletter']";
        String signUpButton = "//button[@id='create-account-enabled']";

        WebElement eleBusinessEmail = driver.findElement(By.xpath(businessEmail));
        WebElement eleNewUserName = driver.findElement(By.xpath(newUserName));
        WebElement eleNewPassword = driver.findElement(By.xpath(newPassword));
        // WebElement eleCheckBox = driver.findElement(By.cssSelector(checkBox));
        WebElement eleSignUpButton=driver.findElement(By.xpath(signUpButton));

        //giving input according to textbox in sing up page
        eleBusinessEmail.sendKeys("milkahreddy@gmail.com");     
        eleNewUserName.sendKeys("");
        eleNewPassword.sendKeys("Radha@1234");
        //clicking the button to submit
        eleSignUpButton.click();
        Thread.sleep(2000);
        driver.quit();
        System.out.println("successfully created new account");


    }
}

