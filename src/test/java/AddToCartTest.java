
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.CataloguePage;
import pages.ProductPage;
import pages.CartPage;

public class AddToCartTest extends Base {

    @Test(description = "2nd tc")
    public void testAddItemFromProductPage() {
        webDriver.get("https://auchan.ua/ua/?gad_source=1&gclid=EAIaIQobChMIvrXzuNTqhgMVZaWDBx193QrsEAAYASAAEgIDWvD_BwE");

        JavascriptExecutor js = (JavascriptExecutor) webDriver;
        js.executeScript("document.querySelector('button.PrimaryButton_primaryButton__3eQ1J.PrimaryButton_sm__1awpW.PrimaryButton_red__28TdX').click();");

        CataloguePage cataloguePage = new CataloguePage(webDriver);
        ProductPage productPage = new ProductPage(webDriver);
        CartPage cartPage = new CartPage(webDriver);

        cataloguePage.selectProductGroup();
        cataloguePage.selectProductSubgroup();
        productPage.scrollToProduct();
        productPage.productPage();
        productPage.addToCart();
        cartPage.headerCartButton();

        Assert.assertTrue(cartPage.isCartWindowDisplayed(), "The product has been added to the cart.");
    }
}