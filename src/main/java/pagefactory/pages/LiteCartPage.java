package pagefactory.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pagefactory.pages.enums.Tab;
import pagefactory.pages.enums.TabBullet;

public class LiteCartPage extends BasePage {

    public LiteCartPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = ".//h1")
    public WebElement pageHeader;

    @FindBy(xpath = ".//span[@class = 'name' and text()='Appearence']")
    public WebElement appearanceTab;

    @FindBy(id = "doc-template")
    public WebElement templateTabDocumentBullet;

    public WebElement getTab(Tab tab) {
        return driver.findElement(By.xpath(getTabFinder(tab)));
    }

    public WebElement getTabBullet(TabBullet bullet) {
        return driver.findElement(By.id(bullet.toString()));
    }

    private String getTabFinder(Tab tab) {
        String tabFinder = ".//span[@class = 'name' and text()='%s']";
        return String.format(tabFinder, tab.toString());
    }
}
