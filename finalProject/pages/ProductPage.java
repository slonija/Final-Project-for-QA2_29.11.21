package finalProject.pages;

import finalProject.base.TestBase;
import finalProject.models.Product;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends TestBase {

    Product product = new Product();

    private final By productName = By.xpath("//*[@class='product-righter google-rich-snippet']/h1");
    private final By productPrice = By.xpath("//*[@class='price']/span");
    private final By addToCart = By.xpath("//button[@id='add_to_cart_btn']");
    private final By proceedToCart = By.xpath("//a[@class='main-button']");

    public void addToCart() {

        driver.findElement(addToCart).click();
    }

    public void settingProductName() {

        product.setProdName(driver.findElement(productName).getText());
        System.out.println("SET PROD NAME is" + " " + driver.findElement(productName).getText());
    }

    public void proceedToCart() {

        new WebDriverWait(driver, 20).until(ExpectedConditions.elementToBeClickable(proceedToCart));
        driver.findElement(proceedToCart).click();
    }
}
