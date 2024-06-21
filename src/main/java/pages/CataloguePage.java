package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class CataloguePage {
    private WebDriver driver;
    private WebDriverWait wait;

    private By productGroupLocator = By.xpath("//a[@href='/ua/produkty-pitanija/']");
    private By productSubgroupLocator = By.xpath("//a[@href='/ua/bakaleya/']");

    public CataloguePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void selectProductGroup() {
        WebElement productGroup = wait.until(ExpectedConditions.elementToBeClickable(productGroupLocator));
        productGroup.click();
    }

    public void selectProductSubgroup() {
        WebElement productSubgroup = wait.until(ExpectedConditions.elementToBeClickable(productSubgroupLocator));
        productSubgroup.click();
    }
}
