package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(className = "quantity")
    public WebElement quantity;

    @FindBy(name = "options[Size]")
    public WebElement sizeDdl;

    @FindBy(name = "add_cart_product")
    public WebElement addToCartBtn;
}
