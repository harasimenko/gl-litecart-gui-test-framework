import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LeftMenuNavigationTests extends BaseTest {
    final String liteCartAdminUrl = "http://localhost/litecart/admin";

    @Test
    public void leftMenuNavigationTest() {
        String login = "admin";
        String password = "admin";
        driver.navigate().to(liteCartAdminUrl);
        driver.findElement(By.name("username")).sendKeys(login);
        driver.findElement(By.name("password")).sendKeys(login);
        driver.findElement(By.name("login")).click();
        driver.findElement(By.xpath(".//span[@class = 'name' and text()='Appearence']"))
                .click();
        driver.findElement(By.id("doc-template")).click();

        assertThat(driver.findElement(By.xpath(".//h1")).isDisplayed())
                .as("Header should be present on the page")
                .isTrue();

        driver.findElement(By.id("doc-logotype")).click();

        assertThat(driver.findElement(By.xpath(".//h1")).isDisplayed())
                .as("Header should be present on the page")
                .isTrue();
    }
}
