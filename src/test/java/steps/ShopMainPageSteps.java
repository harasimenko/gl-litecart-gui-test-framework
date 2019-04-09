package steps;

import pagefactory.pages.ShopMainPage;

import static tests.BaseTest.driver;

public class ShopMainPageSteps extends BaseSteps {

    private ShopMainPage shopMainPage = new ShopMainPage(driver);

    public void openFirstProduct() {
        shopMainPage.products.get(0).click();
    }

    public void clickCheckoutLink() {
        shopMainPage.checkoutLnk.click();
    }
}
