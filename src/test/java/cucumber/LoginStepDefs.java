package cucumber;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import pages.LoginPageObject;
import utility.DriverFactory;


public class LoginStepDefs {
    private WebDriver driver;
    private LoginPageObject loginPageObject;

    @Before
    public void initBrowser(){
        driver =  DriverFactory.getDriver("chrome");
        driver.get("https://lkmdemoaut.accenture.com/TestMeApp/login.htm");
    }

    @Given("Abhishek is a registered user on TestMeApp")
    public void abhishek_is_a_registered_user_on_test_me_app() {
       // return of PageFactory is the class that you are init
        loginPageObject = PageFactory.initElements(driver,LoginPageObject.class);
    }

    @When("Abhishek enter correct credentials")
    public void abhishek_enter_correct_credentials() {
        loginPageObject.login();
    }
    @Then("TestMe renders to user home page")
    public void test_me_renders_to_user_home_page() {
        loginPageObject.verifyTitle();
    }

    //after hook will execute after each scenario
    @After
    public void closeBrowser(){
        if(driver!=null)
            driver.quit();
    }
}
