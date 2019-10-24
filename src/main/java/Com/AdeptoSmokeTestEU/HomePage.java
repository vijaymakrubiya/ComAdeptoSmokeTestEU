package Com.AdeptoSmokeTestEU;

import org.openqa.selenium.By;

public class HomePage extends Utils {
    //Elements on the HomePage
    private By _joinNetworkElement = By.cssSelector(".MuiButton-label.dontMark");

    //method to click on Join Network
    public void clickOnJoinNetwork() {
        clickOnElements(_joinNetworkElement);
    }

}
