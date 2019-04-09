package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagefactory.components.CheckoutItem;

import java.util.List;
import java.util.stream.Collectors;

public class CheckoutPage extends BasePage {
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//ul[@class = 'items']/li")
    private List<WebElement> items;

    public List<CheckoutItem> getCheckoutItems() {
        return items.stream().map(CheckoutItem::new).collect(Collectors.toList());
    }

    @FindBy(id = "box-checkout-summary")
    public WebElement orderSummary;

    public final String ordersInOrderSummaryXpath = ".//div[@id = 'order_confirmation-wrapper']/table/tbody/tr/td[@style ='text-align: center;']";

    @FindBy(xpath = ordersInOrderSummaryXpath)
    public List<WebElement> ordersInOrderSummary;
}
