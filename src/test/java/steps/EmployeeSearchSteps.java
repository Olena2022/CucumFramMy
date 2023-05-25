package steps;

import io.cucumber.java.en.And;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.LoginPage;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Constants;

import java.util.concurrent.TimeUnit;

public class EmployeeSearchSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() {
        openBrowserAndLauchApplication();
    }

    @When("user enters valid admin credentials")
    public void user_enters_valid_admin_credentials() {

     //   LoginPage login = new LoginPage();

       // WebElement usernameField = driver.findElement(By.id("txtUsername"));
        // usernameField.sendKeys(ConfigReader.getPropertyValue("username"));
       // sendText(usernameField, ConfigReader.getPropertyValue("username"));
        sendText(login.usernameBox, ConfigReader.getPropertyValue("username"));

       // WebElement passwordField = driver.findElement(By.name("txtPassword"));
       // passwordField.sendKeys(ConfigReader.getPropertyValue("password"));
       // sendText(passwordField, ConfigReader.getPropertyValue("password"));
        sendText(login.passwordBox, ConfigReader.getPropertyValue("password"));
    }

    @When("user clicks on login button")
    public void user_clicks_on_login_button() {

     //  LoginPage login = new LoginPage();

       // WebElement loginButton = driver.findElement(By.id("btnLogin"));
       // loginButton.click();
      //  click(loginButton);
        click(login.loginBtn);
       // driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
    }

    @When("user navigated to employee list page")
    public void user_navigated_to_employee_list_page() {

       // WebElement pimOption = driver.findElement(By.id("menu_pim_viewPimModule"));
       // pimOption.click();
       // click(pimOption);
        click(employeeSearchPage.pimOption);

     //   WebElement empListOption = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        // empListOption.click();
      //  click(empListOption);
        click(employeeSearchPage.empListOption);
    }

    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {

      //  WebElement searchId = driver.findElement(By.id("empsearch_id"));
       // searchId.sendKeys("40314302");
      //  sendText(searchId,"40314302");
        sendText(employeeSearchPage.idField, "40314302");
    }

    @When("user clicks on search button")
    public void user_clicks_on_search_button() {

      //  WebElement searchBtn = driver.findElement(By.id("searchBtn"));
        // searchBtn.click();
       // click(searchBtn);
        click(employeeSearchPage.searchButton);
    }

    @Then("user is able to see employee information")
    public void user_is_able_to_see_employee_information() {
        System.out.println("Result displayed");
     //   tearDown();
    }

    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {

      //  driver.manage().timeouts().implicitlyWait(Constants.IMPLICIT_WAIT, TimeUnit.SECONDS);
     //  WebElement searchName = driver.findElement(By.xpath("(//*[@type='text'])[1]"));
      // searchName.sendKeys("Ostap");
     //   sendText(searchName, "Ostap");
        sendText(employeeSearchPage.nameField, "Ostap");
    }

}
