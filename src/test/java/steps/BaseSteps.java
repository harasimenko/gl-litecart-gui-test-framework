package steps;

import pagefactory.pages.BasePage;
import tests.BaseTest;

public abstract class BaseSteps {

    private BasePage basePage = new BasePage(BaseTest.driver) {
    };

    public static void openPage(String url) {
        BaseTest.driver.navigate().to(url);
    }

    public void clickLitecartLogo() {
        basePage.litecartLogo.click();
    }
}
