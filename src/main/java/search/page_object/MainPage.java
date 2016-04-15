package search.page_object;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainPage extends Page{
    private static final String SUCCESS_LOGOUT_MESSAGE = "Выход успешно выполнен. До скорой встречи.";
    public static final String USER_LOGGED_IN_WELCOME_MESSAGE = "Здравствуйте";

    @FindBy(xpath = "//span[@id=\"gh-ug\"]/a")
    private WebElement loginLink;
    @FindBy(xpath = "//span[@class=\"ds3pHTxt\"]")
    private WebElement logoutMessage;
    @FindBy(xpath = "//a[@id=\"gh-ug\"]")
    private WebElement userProfileDropdown;


    public MainPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public LoginPage clickLoginLink() {
        loginLink.click();
        return new LoginPage(driver);
    }

    public boolean checkWelcomeMessageOnUserProfileDropdownMessage() {
        Pattern pattern = Pattern.compile("(^(\\W)+|(\\w)+)([A-z])+[!]");
        Matcher matcher = pattern.matcher(userProfileDropdown.getText());
        return matcher.matches();
    }

    public String  userProfileDropdownMessage() {
        return userProfileDropdown.getText();
    }

    public boolean isLogoutSuccess() {
        return logoutMessage.getText().equals(SUCCESS_LOGOUT_MESSAGE);
    }
}
