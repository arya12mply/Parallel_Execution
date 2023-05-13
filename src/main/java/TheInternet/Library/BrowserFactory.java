package TheInternet.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

    private WebDriver driver;

    public void initBrowser(){
        try {
            System.setProperty("webdriver.chrome.driver", "./src/main/resources/chromedriver.exe");
            driver = new ChromeDriver();
            //apply the url
            driver.get("");
            System.out.println("Started Chromedriver...");
        }
        catch(Exception ex)
        {
            System.out.println("EXCEPTION OCCURED "+ex.getLocalizedMessage());
        }
    }

    public void closeBrowser(){
        try {
            driver.quit();
            System.out.println("Closed Browser...");
        }
        catch(Exception ex)
        {
            System.out.println("EXCEPTION OCCURED "+ex.getMessage());
        }
    }

    public WebDriver getDriver(){
        if(driver == null)
            initBrowser();
        return driver;
    }
}
