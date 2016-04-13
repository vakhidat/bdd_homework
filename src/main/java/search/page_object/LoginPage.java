package search.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
    @FindBy(xpath = "")
    private WebElement loginInput;
    @FindBy(xpath = "")
    private WebElement logoutInput;
    @FindBy(xpath = "")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }
}
