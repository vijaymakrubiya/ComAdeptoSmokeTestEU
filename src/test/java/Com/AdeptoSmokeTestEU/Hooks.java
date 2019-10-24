package Com.AdeptoSmokeTestEU;

import cucumber.api.java.After;
import cucumber.api.java.Before;

import java.util.concurrent.TimeUnit;

public class Hooks extends Utils {
    // Browser Open Method
    @Before
    public void openBrowser() {
        new BrowserSelector().browserSelection();
        driver.get(new LordProp().getProperty("url"));
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().deleteAllCookies();
    }

    //Browser Close Method
    @After
    public void closeBrowser() {
        driver.quit();
    }
}
