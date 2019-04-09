package pagefactory.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckoutItem {
    private WebElement webElement;

    public CheckoutItem(WebElement webElement) {
        this.webElement = webElement;
    }

    public WebElement getRemoveItemBtn() {
        return webElement.findElement(By.name("remove_cart_item"));
    }
}
