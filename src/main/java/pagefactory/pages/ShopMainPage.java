package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ShopMainPage extends BasePage {
    public ShopMainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//ul[contains(@class,'products')]/li")
    public List<WebElement> products;

    @FindBy(linkText = "Checkout »")
    public WebElement checkoutLnk;


}
