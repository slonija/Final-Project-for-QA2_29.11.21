package finalProject.pages;

import finalProject.base.TestBase;
import finalProject.models.Product;
import org.openqa.selenium.By;

import static org.assertj.core.api.Assertions.assertThat;

public class CartPage extends TestBase {

    Product product = new Product();

    private final By cartProdName = By.linkText("Bērnu rotaļu mašīnīte MGA L.O.L. Surprise OMG Glamper");
    //private final By cartProdPrice = By.xpath("//p[@class='detailed-cart-item__price']");
    private final By proceedToOrder = By.xpath("//input[@type='submit']");

    public void validationForName() {
        String name = driver.findElement(cartProdName).getText();
        System.out.println("PROD NAME IN THE CART is " + name);
        System.out.println("GET PROD NAME FROM Product.model is " + product.getProdName());
        //assertThat(product.getProdName().).isEqualTo(name);
    }

    public void proceedToOrder() throws InterruptedException {

        Thread.sleep(5000);
        driver.findElement(proceedToOrder).click();
    }
}
