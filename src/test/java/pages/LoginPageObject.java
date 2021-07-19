package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPageObject {

    @FindBy(how= How.ID,using="userName")
    private WebElement user_name;

    @FindBy(how= How.ID,using="password")
    private WebElement password;

    @FindBy(how= How.NAME,using="Login")
    private WebElement login_button;

    private WebDriver driver;

    public LoginPageObject(WebDriver driver){
        this.driver = driver;
    }

    public void login(){
        user_name.sendKeys("AbhiDemoUser");
        password.sendKeys("Demo1234");
        login_button.click();
    }

    public void verifyTitle(){
        String title = driver.getTitle();
        Assert.assertEquals("Home",title);
    }
}
