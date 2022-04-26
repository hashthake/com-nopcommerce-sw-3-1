package computer;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.UtilityTest;

import java.util.List;

public class TestSuite extends UtilityTest {

    String baseUrl = "https://demo.nopcommerce.com";
    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }
    @Test
    public void verifyProductsArrangeInAlphaBaticalOrder() throws InterruptedException {
    mouseHoverAction(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
    mouseHoverActionAndClick(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/ul[1]/li[1]/a[1]"));

    //    2.3 Select Sort By position "Name: A to Z"
        mouseHoverAction(By.xpath("//select[@id='products-orderby']"));
        clickOnElement(By.xpath("//select[@id='products-orderby']"));
        selectByValueFromDropDown(By.xpath("//select[@id='products-orderby']"),"5");

//    2.4 Click on "Add To Cart"
        mouseHoverActionAndClick(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));
        clickOnElement(By.xpath("//body/div[6]/div[3]/div[1]/div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]"));

        Thread.sleep(2000);

//    2.5 Verify the Text "Build your own computer"
        verifyResult(By.xpath("//h1[contains(text(),'Build your own computer')]"), "Build your own computer");

//    2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
        mouseHoverAction(By.xpath("//select[@id='product_attribute_1']"));
        clickOnElement(By.xpath("//select[@id='product_attribute_1']"));
        selectByValueFromDropDown(By.xpath("//select[@id='product_attribute_1']"),"1");

//    2.7.Select "8GB [+$60.00]" using Select class.
        mouseHoverAction(By.xpath("//select[@id='product_attribute_2']"));
        clickOnElement(By.xpath("//select[@id='product_attribute_2']"));
        selectByValueFromDropDown(By.xpath("//select[@id='product_attribute_2']"),"5");

        Thread.sleep(1000);

//    2.8 Select HDD radio "400 GB [+$100.00]"
        mouseHoverAction(By.id("product_attribute_3_7"));
        clickOnElement(By.id("product_attribute_3_7"));

//    2.9 Select OS radio "Vista Premium [+$60.00]"
        mouseHoverAction(By.id("product_attribute_4_9"));
        clickOnElement(By.id("product_attribute_4_9"));
        Thread.sleep(1000);

//    2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
        mouseHoverAction(By.id("product_attribute_5_12"));
        clickOnElement(By.id("product_attribute_5_12"));

        Thread.sleep(1000);

//    2.11 Verify the price "$1,475.00"
        verifyResult(By.id("price-value-1"), "$1,475.00");

//    2.12 Click on "ADD TO CARD" Button.
        mouseHoverAction(By.id("add-to-cart-button-1"));
        clickOnElement(By.id("add-to-cart-button-1"));



//    2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
//    After that close the bar clicking on the cross button.
        verifyResult(By.xpath("//body/div[@id='bar-notification']/div[1]/p[1]"), "The product has been added to your shopping cart");

        mouseHoverAction(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));
        clickOnElement(By.xpath("//body/div[@id='bar-notification']/div[1]/span[1]"));

        Thread.sleep(1000);

//    2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
        mouseHoverAction(By.xpath("//span[contains(text(),'Shopping cart')]"));
        clickOnElement(By.xpath("//span[contains(text(),'Shopping cart')]"));

//    2.15 Verify the message "Shopping cart"
        verifyResult(By.xpath("//h1[contains(text(),'Shopping cart')]"), "Shopping cart");

//    2.16 Change the Qty to "2" and Click on "Update shopping cart"


        clearValue(By.xpath("//input[@value='1']"));
        sendTextToElement(By.xpath("//input[@value='1']"),"2");
        //Click on "Update shopping cart"
        clickOnElement(By.id("updatecart"));
        Thread.sleep(2000);

//    2.17 Verify the Total"$2,950.00"
        verifyResult(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/div[1]/form[1]/div[3]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"), "$2,950.00");

//    2.18 click on checkbox “I agree with the terms of service”
        clickOnElement(By.id("termsofservice"));

//    2.19 Click on “CHECKOUT”
        clickOnElement(By.id("checkout"));
        Thread.sleep(1000);

//    2.20 Verify the Text “Welcome, Please Sign In!”
        verifyResult(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"), "Welcome, Please Sign In!");

//    2.21Click on “CHECKOUT AS GUEST”Tab
        clickOnElement(By.xpath("//button[contains(text(),'Checkout as Guest')]"));

//    2.22 Fill the all mandatory field
        //first name
        sendTextToElement(By.id("BillingNewAddress_FirstName"),"H");
        Thread.sleep(1000);

        //Last name
        sendTextToElement(By.id("BillingNewAddress_LastName"),"Thake");
        Thread.sleep(1000);
        //Email
        sendTextToElement(By.id("BillingNewAddress_Email"),"123@gamil.co.uk");
        Thread.sleep(1000);
        //Country

        selectByVisibleTextFromDropDown(By.xpath("//select[@id='BillingNewAddress_CountryId']"),"United Kingdom");
        Thread.sleep(1000);

        //City
        sendTextToElement(By.id("BillingNewAddress_City"),"london");
        Thread.sleep(1000);

        //Address 1:
        sendTextToElement(By.id("BillingNewAddress_Address1"),"20 Carl Street");
        Thread.sleep(1000);

        //zip
        sendTextToElement(By.id("BillingNewAddress_ZipPostalCode"),"CV1 1VC");
        Thread.sleep(1000);

        //Phone number:
        sendTextToElement(By.id("BillingNewAddress_PhoneNumber"),"0123456789");
        Thread.sleep(1000);

//    2.23 Click on “CONTINUE”
        clickOnElement(By.xpath(" //button[@class='button-1 new-address-next-step-button'][@onclick='Billing.save()']"));
        Thread.sleep(1000);

//    2.24 Click on Radio Button “Next Day Air($0.00)”
        clickOnElement(By.id("shippingoption_1"));

        Thread.sleep(1000);

//    2.25 Click on “CONTINUE”
        clickOnElement(By.xpath(" //button[@class='button-1 shipping-method-next-step-button']"));

        Thread.sleep(1000);

//    2.26 Select Radio Button “Credit Card”
        clickOnElement(By.id("paymentmethod_1"));
        clickOnElement(By.xpath(" //button[@class='button-1 payment-method-next-step-button']"));

        Thread.sleep(1000);

//    2.27 Select “Master card” From Select credit card dropdown
        selectByVisibleTextFromDropDown(By.id("CreditCardType"),"Master card");

//    2.28 Fill all the details
        //Cardholder name:
        sendTextToElement(By.id("CardholderName"),"MR H Thake");
        //Card number:
        sendTextToElement(By.id("CardNumber"),"5512345678912345");
        //Expiration date:
        selectByVisibleTextFromDropDown(By.id("ExpireMonth"),"09");
        selectByVisibleTextFromDropDown(By.id("ExpireYear"),"2024");
        Thread.sleep(1000);
//Card code:
        sendTextToElement(By.id("CardCode"),"007");


        Thread.sleep(1000);

//    2.29 Click on “CONTINUE”

        clickOnElement(By.xpath("//button[@class='button-1 payment-info-next-step-button']"));
        Thread.sleep(1000);

//    2.30 Verify “Payment Method” is “Credit Card”

        verifyResult(By.xpath("//span[contains(text(),'Credit Card')]"), "Credit Card");
        Thread.sleep(1000);


//    2.32 Verify “Shipping Method” is “Next Day Air”

        verifyResult(By.xpath("//body/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/ul[1]/li[1]/span[2]"), "Next Day Air");

//    2.33 Verify Total is “$2,950.00”

        verifyResult(By.xpath("//body[1]/div[6]/div[3]/div[1]/div[1]/div[1]/div[2]/ol[1]/li[6]/div[2]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/table[1]/tbody[1]/tr[4]/td[2]/span[1]/strong[1]"), "$2,950.00");
        Thread.sleep(1000);

//    2.34 Click on “CONFIRM”
        clickOnElement(By.xpath("//button[contains(text(),'Confirm')]"));

        Thread.sleep(1000);
//    2.35 Verify the Text “Thank You”

        verifyResult(By.xpath("//h1[contains(text(),'Thank you')]"), "Thank you");

        Thread.sleep(1000);

//    2.36 Verify the message “Your order has been successfully processed!”

        verifyResult(By.xpath("//strong[contains(text(),'Your order has been successfully processed!')]"), "Your order has been successfully processed!");
        Thread.sleep(1000);

//    2.37 Click on “CONTINUE”
        clickOnElement(By.xpath("//button[contains(text(),'Continue')]"));
        Thread.sleep(1000);

//    2.37 Verify the text “Welcome to our store”
        verifyResult(By.xpath("//h2[contains(text(),'Welcome to our store')]"), "Welcome to our store");

    }
    @After
    public void tearDown(){
        closeBrowser();
    }

}

