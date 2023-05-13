package TheInternetTest.StepDefinitions;

import TheInternet.BaseContext;
import TheInternet.Library.BrowserFactory;
import TheInternet.Library.Utils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class SearchStep {

    BrowserFactory browserFactory = new BrowserFactory();
    BaseContext baseContext;

    Utils util;

    public SearchStep(BaseContext baseContext){
        this.baseContext = baseContext;
    }

    @Before
    public void startup(){
        browserFactory.initBrowser();
        WebDriver driver = browserFactory.getDriver();
        baseContext.setDriver(driver);
        baseContext.initializePageFactory(driver);
        util = new Utils(driver);

    }

    @When("user try to login with valid credential {string}")
    public void userEntersCountryNameAs(String arg0) {
//        baseContext.getTheInternet().isUserOnLoginPage();
          baseContext.getTheInternet().isUserLogin(arg0);
    }

    @After
    public void teardown(Scenario scenario){
        if(scenario.isFailed())
            System.out.println("FAILED: --------------------- "+scenario.getName());
        else
            System.out.println("PASSED: --------------------- "+scenario.getName());

        baseContext.getDriver().quit();
    }
}
