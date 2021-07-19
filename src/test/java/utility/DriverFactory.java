package utility;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {

    public static WebDriver getDriver(String browserKey){

        switch (browserKey){
            case "chrome":
                ChromeOptions option = new ChromeOptions();
                option.addArguments("start-maximized");
                option.addArguments("--disable-notifications");
                option.addArguments("--disable-confirmations");
                option.addArguments("disable-infobars");
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver(option);
            case "ie":
                WebDriverManager.iedriver().arch32().setup();
                return new InternetExplorerDriver();
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                throw new UnsupportedOperationException("The browser key is incorrect "+browserKey);

        }
    }

}
