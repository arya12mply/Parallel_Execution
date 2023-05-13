package TheInternet.Pages;

import TheInternet.Library.Utils;
import org.openqa.selenium.*;

public class TheInternet extends BasePage{

    Utils utils;

    public TheInternet(WebDriver driver){
        super(driver);

    }
    public void isUserLogin(String args0){
        utils = new Utils(driver);
        if(args0.contains("Test@1.com")){
            utils.staticWait(1000);
            WebElement cred =driver.findElement(By.xpath("//input[@id='email']"));
            utils.waitForVisibility(cred,20);
        }
        else {
            utils.staticWait(1000);
            WebElement cred =driver.findElement(By.xpath("//input[@id='email']"));
            cred.sendKeys("Test@2.com");
        }
        WebElement cred =driver.findElement(By.xpath("//input[@id='password-field']"));
        utils.waitForVisibility(cred,20);
        cred.sendKeys("Test@123.com");
    }

}
