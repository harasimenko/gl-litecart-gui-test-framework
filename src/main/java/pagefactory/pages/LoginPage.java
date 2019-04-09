package pagefactory.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(name = "username")
    public WebElement loginTextBox;

    @FindBy(name = "password")
    public WebElement passwordTextBox;

    @FindBy(name = "login")
    public WebElement loginBtn;

    public LoginPage(WebDriver driver) {
        super(driver);
    }
}
