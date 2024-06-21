package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProductPage {

    WebDriver webDriver;

    By product = By.xpath("//a[contains(@class, 'item_image__3JOTU')]");
    By addToCartButton = By.xpath("//button[contains(@title, 'Додати до кошика')]");

    public ProductPage(WebDriver webDriver) {
        this.webDriver = webDriver;
    }

    public void productPage() {
        webDriver.findElement(product).click();
    }

    public void addToCart() {
        webDriver.findElement(addToCartButton).click();
    }

    public void scrollToProduct() {
        WebElement productElement = webDriver.findElement(product);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(productElement).perform();
    }
}