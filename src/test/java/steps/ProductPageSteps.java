package steps;

import org.openqa.selenium.support.ui.Select;
import pagefactory.pages.ProductPage;
import utils.WebElementUtils;

import java.util.concurrent.TimeUnit;

import static org.awaitility.Awaitility.await;
import static tests.BaseTest.driver;

public class ProductPageSteps extends BaseSteps {

    private ProductPage productPage = new ProductPage(driver);

    public void addProductToCart() {
        if (WebElementUtils.isElementDisplayed(productPage.sizeDdl)) {
            Select sizeDdl = new Select(productPage.sizeDdl);
            sizeDdl.selectByValue("Small");
        }

        productPage.addToCartBtn.click();

        await().atMost(3, TimeUnit.SECONDS).until(() ->
                {
                    try {
                        driver.switchTo().alert().accept();
                        return true;
                    } catch (Exception e) {
                        return false;
                    }
                }
        );
        driver.navigate().refresh();
    }
}
