package steps;

import pagefactory.pages.LiteCartPage;
import pagefactory.pages.enums.Tab;
import pagefactory.pages.enums.TabBullet;

import static org.assertj.core.api.Assertions.assertThat;
import static tests.BaseTest.driver;

public class LiteCartSteps extends BaseSteps{
    private LiteCartPage liteCartPage = new LiteCartPage(driver);

    public void clickTab(Tab tab) {
        liteCartPage.getTab(tab).click();
    }

    public void clickTabBullet(TabBullet bullet) {
        liteCartPage.getTabBullet(bullet).click();
    }

    public void verifyHeaderDisplayed(String header) {
        assertThat(liteCartPage.pageHeader.getText())
                .as("Header should equals to expected")
                .isEqualTo(header);
    }
}
