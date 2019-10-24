package Com.AdeptoSmokeTestEU;

import org.openqa.selenium.By;

public class SignUpPage extends Utils {

    // Elements on the Sign Up Page
    private By _signUpElement = By.cssSelector(".MuiButton-label.dontMark");

    //method to click on Sign Up
    public void clickOnSignUp() {
        clickOnElements(_signUpElement);
    }
}
