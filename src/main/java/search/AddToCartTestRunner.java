package search;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import search.selenium.BaseSelenium;

@CucumberOptions(features = "src/main/resources/search/login.feature",
        format = {"pretty"})
public class AddToCartTestRunner extends AbstractTestNGCucumberTests {
        @BeforeClass
        public static void initSelenium(){
                BaseSelenium.init();
                BaseSelenium.driver.get("http://www.ebay.com/");
        }
        @AfterClass
        public static void closeSelenium(){
                BaseSelenium.close();
        }
}
