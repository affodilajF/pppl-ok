package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page.LoginPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginSteps {
    WebDriver driver;
    LoginPage login;

    void setupDriver() {
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Given("User in the admin login page")
    public void userInAdminLoginPage() {
        setupDriver();
        String url = "http://localhost:5173/login";
        driver.get(url);
    }

    @When("user submit valid credentials")
    public void userSubmitValidCredential() throws InterruptedException {
        login = new LoginPage(driver);
//        login.enterEmail("admin@admin.com");
//        login.enterPassword("secret1234");
        login.clickSubmit();
    }

//    @Then("user should be directed to the dashboard")
//    public void userIsRedirectedToDashboardPage() throws InterruptedException {
//        String expectedURL = "http://localhost:5173/manage";
//        String actualURL = login.getURL();
////        assertEquals(expectedURL, actualURL);
//        assertTrue(actualURL.contains("dashboard"));
//    }
    @Then("the user is redirected to the dashboard page")
    public void user_should_be_directed_to_the_dashboard() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @After
    public void closeBrowser() {
        if (driver != null) {
//            driver.quit();
        }
    }
}
