package search.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends Page {
    @FindBy(xpath = "id(\"pri_signin\")/descendant::input[@type=\"text\"]")
    private WebElement loginInput;
    @FindBy(xpath = "id(\"pri_signin\")/descendant::input[@type=\"password\"]")
    private WebElement passwordInput;
    @FindBy(xpath = "id(\"sgnBt\")")
    private WebElement loginButton;


    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public MainPage login(String login, String password) {
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        loginButton.click();
        return new MainPage(driver);
    }
}
