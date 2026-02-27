package steps;

import io.cucumber.java.en.*;

public class firstStep {
    @Given("user in login page")
    public void user_in_login_page() {
        System.out.println("Login page");
    }

    @When("user logged in page")
    public void user_logged_in_page() {
        System.out.println("Logged in");
    }

    @When("user switch to frame")
    public void user_switch_to_frame() {
        System.out.printf("Switch frsme");
    }

}
