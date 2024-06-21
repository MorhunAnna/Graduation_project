package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CartPage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By headerCartButtonLocator = By.xpath("//button[@class='cart-toggle__btn']");
    private By cartWindowLocator = By.xpath("//div[@class='cart-modal_root__XEE_Z']");

    public CartPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void headerCartButton() {
        WebElement headerCartButton = wait.until(ExpectedConditions.elementToBeClickable(headerCartButtonLocator));
        headerCartButton.click();
    }

    public boolean isCartWindowDisplayed() {
        WebElement cartWindow = wait.until(ExpectedConditions.visibilityOfElementLocated(cartWindowLocator));
        return cartWindow.isDisplayed();
    }
}

