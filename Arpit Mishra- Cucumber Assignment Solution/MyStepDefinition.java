package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinition {

    @Given("User is on NetBanking landing page")
    public void user_is_on_netbanking_application(){
        System.out.println("User is on Net Banking landing page");
    }
    @When("User login into application with username and password")
    public void user_login_into_application_with_username_and_password() {
        System.out.println("User login into application with username and password");}
    @When("User login into application with {string} and password {string}")
    public void user_login_into_application_with_values(String userName, String passWord){
        System.out.println("Username "+ userName +" Password " + passWord);
    }
    @When("^User login in to application with (.+) and password (.+)$")
    public void user_login_using_tables(String userName, String passWord){
        System.out.println("userName: "+ userName +" and Password: "+ passWord);}
    @Then("Home page is populated")
    public void home_page_is_populated() {
        System.out.println("Home page is populated"+"\n");
    }
    @Then("Cards are displayed")
    public void cards_are_displayed() {
        System.out.println("Cards are displayed"+"\n");
    }
    @Then("Cards displayed are {string}")
    public void cards_displayed_by_values(String res){
        System.out.println("Value returned "+res+"\n");}

}
