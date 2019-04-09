package tests;

import org.testng.annotations.Test;
import pagefactory.pages.enums.Tab;
import pagefactory.pages.enums.TabBullet;
import steps.*;

import static steps.BaseSteps.openPage;

public class LitecartTests extends BaseTest {

    final private String liteCartAdminUrl = "http://localhost/litecart/admin";
    final private String ordersUrl = "http://localhost/litecart/en/";

    @Test
    public void leftMenuNavigationTest() {
        LiteCartSteps liteCartSteps = new LiteCartSteps();
        LoginSteps loginSteps = new LoginSteps();

        String login = "admin";
        String password = "admin";

        openPage(liteCartAdminUrl);
        loginSteps.login(login, password);

        liteCartSteps.clickTab(Tab.APPEARENCE);
        liteCartSteps.clickTabBullet(TabBullet.TEMPLATE);
        liteCartSteps.verifyHeaderDisplayed("Template");

        liteCartSteps.clickTabBullet(TabBullet.LOGOTYPE);
        liteCartSteps.verifyHeaderDisplayed("Logotype");

        liteCartSteps.clickTab(Tab.CATALOG);
        liteCartSteps.clickTabBullet(TabBullet.CATALOG);
        liteCartSteps.verifyHeaderDisplayed("Catalog");

        liteCartSteps.clickTab(Tab.COUNTRIES);
        liteCartSteps.verifyHeaderDisplayed("Countries");
    }

    @Test
    public void addAndRemoveFromTheCartTest() {
        ShopMainPageSteps shopMainPageSteps = new ShopMainPageSteps();
        ProductPageSteps productPageSteps = new ProductPageSteps();
        CheckoutPageSteps checkoutPageSteps = new CheckoutPageSteps();

        openPage(ordersUrl);
        shopMainPageSteps.openFirstProduct();
        productPageSteps.addProductToCart();
        productPageSteps.clickLitecartLogo();

        shopMainPageSteps.openFirstProduct();
        productPageSteps.addProductToCart();
        productPageSteps.clickLitecartLogo();

        shopMainPageSteps.clickCheckoutLink();
        checkoutPageSteps.removeFirstItem();
        checkoutPageSteps.clickRemoveForFirstItem();
        checkoutPageSteps.verifyOrdersTableIsHidden();
    }
}
