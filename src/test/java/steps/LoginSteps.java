package steps;

import pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
    String errorMessage = "Invalid username and/or password.";
    LoginPage loginPage = new LoginPage();

    @Before
    public static void setup() {
        // Configuration.baseUrl = "https://profile.oracle.com";
    }

    @Given("User has opened Oracle Profile page")
    public void userOpensProfilePage() {
        loginPage.openPage();
    }

    @When("User inputs {string} as email")
    public void userEntersUsername(String username) {
        loginPage.enterUserName(username);
    }

    @When("User inputs {string} as password")
    public void userEntersPassword(String password) {
        loginPage.enterPassword(password);
    }

    @When("User presses Sign In button")
    public void userClicksSubmitButton() {
        loginPage.clickSubmitButton();
    }

    @Then("User sees invalid credentials message")
    public void errorMessageAppeared() {
        loginPage.isErrorMessageExists(errorMessage);
    }
}
