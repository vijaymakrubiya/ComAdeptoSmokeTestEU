package Com.AdeptoSmokeTestEU;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^I click on join Network$")
    public void iClickOnJoinNetwork() {
        new HomePage().clickOnJoinNetwork();
    }

    @And("^I click on Sign up$")
    public void iClickOnSignUp() {
        new SignUpPage().clickOnSignUp();
    }

    @And("^I enter valid email address \"([^\"]*)\"$")
    public void iEnter(String arg0) {
        new SignUpFormPage().enterEmailAddress(arg0);
    }

    @And("^I enter \"([^\"]*)\" and \"([^\"]*)\" with special character and numbers$")
    public void iEnterAndWithSpecialCharacterAndNumbers(String arg0, String arg1) {
        new SignUpFormPage().enterFirstAndLastName(arg0, arg1);
    }

    @And("^I enter \"([^\"]*)\" mixture of letters, numbers and symbol$")
    public void iEnterMixtureOfLettersNumbersAndSymbol(String arg0) {
        new SignUpFormPage().enterPassword(arg0);
    }

    @And("^click on the sign Up button$")
    public void clickOnTheSignUpButton() {
        new SignUpFormPage().clickSignUpButton();

    }

    @Then("^I should see an Error message for first name and last name field$")
    public void iShouldSeeAnErrorMessageForFirstNameAndLastNameField() {
        Utils.assertTrueMethod("First name is not entered or invalid input",
                new SignUpFormPage().getFirstNameErrorMessage().equalsIgnoreCase("A first name is required"));
        Utils.assertTrueMethod("Last name is not entered or invalid input",
                new SignUpFormPage().getLastNameErrorMessage().equalsIgnoreCase("A last name is required"));

    }
}
