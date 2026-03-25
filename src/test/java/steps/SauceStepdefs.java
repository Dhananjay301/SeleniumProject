package steps;

import actors.SauceLoginActor;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SauceStepdefs {
    SauceLoginActor sauceLoginActor = new SauceLoginActor();

    @Given("User is on {string} login page")
    public void userisonloginpage(String url) {
        SauceLoginActor.navigate(url);
    }

    @When("User enters username {string} in username Section")
    public void user_enters_username_in_username_section(String uname) {
        sauceLoginActor.enterUsername(uname);
    }
    @When("User enters password {string} in password section")
    public void user_enters_password_in_password_section(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("User clicks on {string} button")
    public void user_clicks_on_button(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("User should be not able to login getting <{string}>")
    public void user_should_be_not_able_to_login_getting(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
