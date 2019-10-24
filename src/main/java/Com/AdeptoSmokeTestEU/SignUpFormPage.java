package Com.AdeptoSmokeTestEU;

import org.openqa.selenium.By;

public class SignUpFormPage extends Utils {

    //Elements on the Sign Up Filling Form Page
    private By _enterAccountEmail = By.id("email");
    private By _enterFirstName = By.id("firstName");
    private By _enterLastName = By.id("lastName");
    private By _createPassword = By.id("password");
    private By _clickOnSignUpButton = By.xpath("//div[@class='sc-ckVGcZ cmErsC']/button/span[1]");
    private By _firstNameErrorMessage = By.xpath("//div[2]/div[1]/div/div/div[2]/span[1]");
    private By _lastNameErrorMessage = By.xpath("//div[2]/div[2]/div/div/div[2]/span[1]");

    // Method to input email address
    public void enterEmailAddress(String email) {
        sendKeysToEnterText(_enterAccountEmail, email);
    }

    // Method to input first and last name
    public void enterFirstAndLastName(String firstName, String lastName) {
        sendKeysToEnterText(_enterFirstName, firstName);
        sendKeysToEnterText(_enterLastName, lastName);
    }

    //Method to enter password
    public void enterPassword(String password) {
        sendKeysToEnterText(_createPassword, password);
    }

    //Method to click on the sign up Button
    public void clickSignUpButton() {
        clickOnElements(_clickOnSignUpButton);
    }

    public String getFirstNameErrorMessage() {
        return getText(_firstNameErrorMessage);
    }

    public String getLastNameErrorMessage()
    {
        return getText(_lastNameErrorMessage);
    }
}

