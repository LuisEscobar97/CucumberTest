package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SearchSteps {
    WebDriver driver;

    @Given("the user is in the index page")
    public void theUserIsInTheIndexPage(){
        System.setProperty("webdriver.gecko.driver","Drivers/geckodriver.exe");
        driver=new FirefoxDriver();
        driver.navigate().to("https://ultimateqa.com/automation");

    }
    @When("the user enters dresses in the search bar")
    public void theUserEnterDressesInSearchBar(){

    }
    @When("the user click the search button")
    public void userClickSearchButton(){

    }
    @Then("the dresses page appears")
    public void theDresesPageAppears(){

    }

}
