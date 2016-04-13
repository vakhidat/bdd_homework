package search.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends Page{
    private static final String SUCCESS_LOGOUT_MESSAGE = "Выход успешно выполнен. До скорой встречи.";

    @FindBy(xpath = "//span[@id='gh-ug']/a")
    private WebElement loginLink;
    @FindBy(xpath = "//span[@class='ds3pHTxt']")
    private WebElement logoutMessage;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LoginPage clickLoginLink() {
        loginLink.click();
        return new LoginPage(driver);
    }

    public boolean isLogoutSuccess() {
        return logoutMessage.getText().equals(SUCCESS_LOGOUT_MESSAGE);
    }
}
