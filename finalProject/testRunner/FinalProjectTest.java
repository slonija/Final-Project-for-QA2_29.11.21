package finalProject.testRunner;

import finalProject.models.Customer;
import finalProject.models.Product;
import finalProject.pages.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class FinalProjectTest {

    MainPage mainPage = new MainPage();
    ProductPage productPage = new ProductPage();
    CartPage cartPage = new CartPage();
    LoginPage loginPage = new LoginPage();
    OrderPage orderPage = new OrderPage();
    Customer customer = new Customer();
    Product product = new Product();
    PaymentPage paymentPage = new PaymentPage();

    @Before
    public void setUp(){
        System.out.println("The Test is starting...");
        mainPage.startDriver();
    }

    @Test
    public void searchTest() throws InterruptedException {

        mainPage.acceptCookies();
        mainPage.productSearch("lol");
        mainPage.searchButtonClick();
        mainPage.chooseLelles();
        mainPage.chooseAccessories();
        mainPage.pickProduct();

        productPage.addToCart();
        productPage.settingProductName();
        //productPage.settingProductPrice();
        productPage.proceedToCart();

        cartPage.validationForName();
        cartPage.proceedToOrder();

        loginPage.login(customer.getCustEmail());

        orderPage.fillDeliveryDetails();
        orderPage.custDetailsInput(customer.getCustName(), customer.getCustSurname(), customer.getCustPhone());
        orderPage.proceedToPayment();

        paymentPage.choosePaymentType();

    }
    @After
    public void tearDown() throws InterruptedException {
        paymentPage.stopDriver();
        System.out.println("This is the end of the Test");
    }
}


