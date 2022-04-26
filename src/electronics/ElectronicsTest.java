package electronics;

import com.google.common.base.Verify;
import javafx.scene.control.Tab;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Mouse;
import utilities.UtilityTest;

public class ElectronicsTest extends UtilityTest {

    String baseUrl = "https://demo.nopcommerce.com";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void textVerified() throws InterruptedException {
///       1.1 Mouse Hover on “Electronics”Tab
        mouseHoverAction(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));

//    1.2 Mouse Hover on “Cell phones” and click
        mouseHoverAction(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));


//    1.3 Verify the text “Cell phones”
        String expectedMessage = "Cell phones";
        String actualMessage = getTextFromElement(By.xpath("//h1[contains(text(),'Cell phones')]"));
        Assert.assertEquals(actualMessage, expectedMessage);
        Thread.sleep(1000);
}
@Test
    public void verifyThatTheProductAddedSuccessfullyAndplaceOrderSuccessfully() throws InterruptedException {

//	2.1 Mouse Hover on “Electronics” Tab
    mouseHoverAction(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
//2.2 Mouse Hover on “Cell phones” and click
    mouseHoverActionAndClick(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/ul[1]/li[2]/a[1]"));
//2.3 Verify the text “Cell phones”
    verifyResult(By.xpath("//h1[contains(text(),'Cell phones')]"), "Cell phones");
    Thread.sleep(3000);
//            2.4 Click on List View Tab
    mouseHoverAction(By.xpath("//a[contains(text(),'List')]"));
    mouseHoverActionAndClick(By.xpath("//a[contains(text(),'List')]"));
//	2.5 Click on product name “Nokia Lumia 1020” link
    mouseHoverAction(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]"));
    Thread.sleep(3000);
    mouseHoverActionAndClick(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[3]/div[1]/div[2]/h2[1]/a[1]"));
//	2.6 Verify the text “Nokia Lumia 1020”
    verifyResult(By.xpath("//h1[contains(text(),'Nokia Lumia 1020')]"), "Nokia Lumia 1020");
    Thread.sleep(3000);
//            2.7 Verify the price “$349.00”
    verifyResult(By.xpath("//span[@id='price-value-20']"), "$349.00");
//            2.8 Change quantity to 2
    clearValue(By.xpath("//input[@id='product_enteredQuantity_20']"));
    Thread.sleep(3000);
    sendTextToElement(By.xpath("//input[@id='product_enteredQuantity_20']"), "2");
//            2.9 Click on “ADD TO CART” tab
    clickOnElement(By.id("add-to-cart-button-20"));
    Thread.sleep(3000);
//	2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    verifyResult(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"),"The product has been added to your shopping cart");
//    After that close the bar clicking on the cross button.
    clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
    Thread.sleep(3000);

//            2.11 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    mouseHoverAction(By.xpath("//span[contains(text(),'Shopping cart')]"));
    mouseHoverActionAndClick(By.xpath("//span[contains(text(),'Shopping cart')]"));
    Thread.sleep(3000);
//	2.12 Verify the message "Shopping cart"
    verifyResult(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart");
    Thread.sleep(3000);
////            2.13 Verify the quantity is 2
//    verifyResult(By.id("itemquantity11227"), "2");
//            2.14 Verify the Total $698.00
//    verifyResult(By.xpath("//body[1]/div[6]/div[1]/div[1]/div[2]/div[2]/div[1]/div[3]/strong[1]"), "$698.00");
    Thread.sleep(3000);
//            2.15 click on checkbox “I agree with the terms of service”
    clickOnElement(By.id("termsofservice"));
    Thread.sleep(3000);
//            2.16 Click on checkout
    clickOnElement(By.id("checkout"));
    Thread.sleep(3000);
//“2.17 Verify the Text “Welcome, Please Sign In!”
    verifyResult(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");
//            2.18 Click on “REGISTER” tab
    clickOnElement(By.xpath("//button[contains(text(),'Register')]"));
    Thread.sleep(3000);
//	2.19 Verify the text “Register”
    verifyResult(By.xpath("//button[contains(text(),'Register')]"), "REGISTER");
//            2.20 Fill the mandatory fields
    sendTextToElement(By.id("FirstName"), "Hardik");
    sendTextToElement(By.id("LastName"), "Thaker");
    sendTextToElement(By.id("Email"), "ab@gmail.com");
    sendTextToElement(By.id("Password"), "ABC1234");
    sendTextToElement(By.id("ConfirmPassword"), "ABC1234");
Thread.sleep(3000);
//	2.21 Click on “REGISTER” Button
    clickOnElement(By.id("register-button"));
//	2.22 Verify the message “Your registration completed”
    verifyResult(By.xpath("//div[contains(text(),'Your registration completed')]"), "Your registration completed");
    Thread.sleep(3000);
//            2.23 Click on “CONTINUE” tab
    clickOnElement(By.xpath("//a[contains(text(),'Continue')]"));
    Thread.sleep(3000);
//	2.24 Verify the text “Shopping cart”
    verifyResult(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart");
//            2.25 click on checkbox “I agree with the terms of service”
    mouseHoverAction(By.id("termsofservice"));
    clickOnElement(By.id("termsofservice"));
    Thread.sleep(3000);
//            2.26 Click on “CHECKOUT”
    clickOnElement(By.id("checkout"));
//            2.27 Fill the Mandatory fields
    selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"United Kingdom");
    Thread.sleep(1000);
    sendTextToElement(By.id("BillingNewAddress_City"),"London");
    Thread.sleep(1000);
    sendTextToElement(By.id("BillingNewAddress_Address1"),"20 Carl Street");
    Thread.sleep(1000);
    sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"),"CV1 1VC");
    Thread.sleep(1000);
    sendTextToElement(By.id("BillingNewAddress_PhoneNumber"), "1234567891");
    Thread.sleep(1000);
//	2.28 Click on “CONTINUE”
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[1]/div[2]/div[1]/button[4]"));
    Thread.sleep(1000);

//            2.29 Click on Radio Button “2nd Day Air ($0.00)”
    clickOnElement(By.id("shippingoption_2"));
//            2.30 Click on “CONTINUE”
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[3]/div[2]/form[1]/div[2]/button[1]"));
    Thread.sleep(1000);
//            2.31 Select Radio Button “Credit Card”
    clickOnElement(By.id("paymentmethod_1"));
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[4]/div[2]/div[1]/button[1]"));
    Thread.sleep(1000);
//            2.32 Select “Visa” From Select credit card dropdown
    selectByVisibleTextFromDropDown(By.id("CreditCardType"), "Visa");
    Thread.sleep(1000);

//2.33 Fill all the details
    sendTextToElement(By.id("CardholderName"), "H Thaker");
    sendTextToElement(By.id("CardNumber"), "5512345678912345");
    selectByIndexFromDropDown(By.id("ExpireMonth"), 8);
    selectByValueFromDropDown(By.id("ExpireYear"),"2024");
    Thread.sleep(1000);
    sendTextToElement(By.id("CardCode"), "123");
    Thread.sleep(1000);

//2.34 Click on “CONTINUE”CHECKOUT”
    clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[5]/div[2]/div[1]/button[1]"));//
    Thread.sleep(1000);
//
//            2.35 Verify “Payment Method” is “Credit Card” Card");
    verifyResult(By.xpath("//span[contains(text(),'Credit Card')]"), "Credit Card");
    Thread.sleep(1000);
    //            2.36 Verify “Shipping Method” is “2nd Day Air”
    verifyResult(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"), "2nd Day Air");
//            2.37 Verify Total is “$698.00”
    verifyResult(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"), "$698.00");
    Thread.sleep(1000);
//            2.38 Click on “CONFIRM”
    clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));
    Thread.sleep(1000);
//            2.39 Verify the Text “Thank You”
    verifyResult(By.xpath("//h1[contains(text(),'Thank you')]"), "Thank you");
    Thread.sleep(1000);
//            2.40 Verify the message “Your order has been successfully processed!”
    verifyResult(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "Your order has been successfully processed!");
    Thread.sleep(1000);
//            2.41 Click on “CONTINUE”
    clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
    Thread.sleep(1000);
//            2.42 Verify the text “Welcome to our store”
    verifyResult(By.xpath("//h2[contains(text(),'Welcome to our store')]"), "Welcome to our store");
//            2.43 Click on “Logout” link
    clickOnElement(By.xpath("//h2[contains(text(),'Welcome to our store')]"));
//2.44 Verify the URL is “https://demo.nopcommerce.com/”
    String expectedMessage1 = "https://demo.nopcommerce.com/";
    //String actualMessage17 = driver.getCurrentUrl();
    String actualMessage1 = driver.getCurrentUrl();
    Assert.assertEquals(expectedMessage1, actualMessage1);
    Thread.sleep(3000);
}
public void tearDown(){
        closeBrowser();
}

}
