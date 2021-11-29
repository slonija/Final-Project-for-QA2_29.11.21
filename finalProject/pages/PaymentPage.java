package finalProject.pages;

import finalProject.base.TestBase;
import org.openqa.selenium.By;

public class PaymentPage extends TestBase {

    private final By choosePaymentType = By.xpath("//input[@id='payment_unused_22']");

    public void choosePaymentType() {

        driver.findElement(choosePaymentType).click();}
}
