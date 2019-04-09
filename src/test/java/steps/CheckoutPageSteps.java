package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagefactory.components.CheckoutItem;
import pagefactory.pages.CheckoutPage;
import tests.BaseTest;
import utils.WebElementUtils;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CheckoutPageSteps extends BaseSteps {

    private CheckoutPage checkoutPage = new CheckoutPage(BaseTest.driver);

    public void clickRemoveForFirstItem() {
        CheckoutItem checkoutItem = checkoutPage.getCheckoutItems().get(0);
        checkoutItem.getRemoveItemBtn().click();
    }

    public void removeFirstItem() {
        int ordersCount = checkoutPage.ordersInOrderSummary.size();
        clickRemoveForFirstItem();

        new WebDriverWait(BaseTest.driver, 10).until(
                ExpectedConditions.numberOfElementsToBe(
                        By.xpath(checkoutPage.ordersInOrderSummaryXpath), ordersCount - 1));
    }

    public void verifyOrdersTableIsHidden() {
        assertThat(WebElementUtils.isElementDisplayed(checkoutPage.orderSummary))
                .as("Orders table should be hidden")
                .isTrue();
    }
}
