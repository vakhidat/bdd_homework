package search.step_definition;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;
import search.page_object.LoginPage;
import search.page_object.MainPage;

public class LoginDefinition extends BaseDefinition {
    private MainPage mainPage;
    private LoginPage loginPage;

    @Given("^I navigate to login page on ebay.com$")
    public void navigateToLoginPage() {
        mainPage = new MainPage(driver);
        loginPage = mainPage.clickLoginLink();
    }

    @When("^I fill credentials with parameters: login: \"([^\"]*)\"; password: \"([^\"]*)\" and click login button$")
    public void I_fill_credentials_with_parameters_login_password_and_click_login_button(String login, String password){
        mainPage = loginPage.login(login, password);
    }

    @Then("^I see welcome message at the left page corner$")
    public void I_see_welcome_message_at_the_left_page_corner(){
        System.out.println(mainPage.userProfileDropdownMessage());
        Assert.assertTrue(mainPage.checkWelcomeMessageOnUserProfileDropdownMessage());
    }
}
