package steps;

import pagefactory.pages.LoginPage;

import static tests.BaseTest.driver;

public class LoginSteps {

    private LoginPage loginPage = new LoginPage(driver);

    public void login(String login, String password) {
        loginPage.loginTextBox.sendKeys(login);
        loginPage.passwordTextBox.sendKeys(password);
        loginPage.loginBtn.click();
    }
}
