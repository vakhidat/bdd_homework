package search.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseSelenium {
    public static WebDriver driver;

    public static void init(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    public static void close(){
        try {
            driver.quit();
        }
        catch (Exception ex){
            ex.printStackTrace();
        }
        finally{
            driver = null;
        }
    }
}