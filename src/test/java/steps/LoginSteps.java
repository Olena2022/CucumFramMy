package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

public class LoginSteps extends CommonMethods {

    @Then("admin user is successfully logged in")
    public void admin_user_is_successfully_logged_in() {
        System.out.println("test passed");
        tearDown();
    }

    @When("user enters valid ess username and password")
    public void user_enters_valid_ess_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        sendText(usernameField, "lvk12345");

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(passwordField, "Hum@nhrm123");
    }

    @Then("ess user is successfully logged in")
    public void ess_user_is_successfully_logged_in() {
       // leaving it for validation
        tearDown();
    }

    @When("user enters invalid username and password")
    public void user_enters_invalid_username_and_password() {
        WebElement usernameField = driver.findElement(By.id("txtUsername"));
        sendText(usernameField, "lvk12345");

        WebElement passwordField = driver.findElement(By.name("txtPassword"));
        sendText(passwordField, "Hum@nhrm");
    }

    @Then("user see error message on the screen")
    public void user_see_error_message_on_the_screen() {
        // verify error message for this
        tearDown();
    }
}
