package homepage;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.UtilityTest;

import java.util.List;

public class TopMenuTest extends UtilityTest {

    String BaseUrl = "https://demo.nopcommerce.com/";

    public void selectMenu(String menu, By by) throws InterruptedException {
        List<WebElement> names = driver.findElements(by);
        for (WebElement name : names) {
            if (name.getText().equalsIgnoreCase(menu)) {
                Thread.sleep(2000);
                name.click();
                break;
            }
        }
    }


    @Before
    public void setUp() {
        openBrowser(BaseUrl);
    }

    @Test
    public void verifyUserCanNavigateToComputerMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[1]/a[1]"));
        selectMenu("Computers", By.xpath("//h1[contains(text(),'Computers')]"));
        verifyResult(By.xpath("//h1[contains(text(),'Computers')]"), "Computers");
    }

    @Test
    public void verifyUserCanNavigateToElectronicsMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]"));
        selectMenu("Electronics",By.xpath("//h1[contains(text(),'Electronics')]"));
        verifyResult(By.xpath("//h1[contains(text(),'Electronics')]"), "Electronics");
    }

    @Test
    public void verifyUserCanNavigateToApparelMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[3]/a[1]"));
        selectMenu("Apparel",By.xpath("//h1[contains(text(),'Apparel')]"));
       verifyResult(By.xpath("//h1[contains(text(),'Apparel')]"), "Apparel");
    }

    @Test
    public void verifyUserCanNavigateToDigitalDownloadsMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[4]/a[1]"));
       selectMenu("Digital downloads",By.xpath("//h1[contains(text(),'Digital downloads')]"));
        verifyResult(By.xpath("//h1[contains(text(),'Digital downloads')]"), "Digital downloads");
    }
    @Test
    public void verifyUserCanNavigateToBooksMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]"));
        selectMenu("Books",By.xpath("//h1[contains(text(),'Books')]"));
       verifyResult(By.xpath("//h1[contains(text(),'Books')]"), "Books");
    }

    @Test
    public void verifyUserCanNavigateToJewelryMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]"));
        selectMenu("Jewelry",By.xpath("//h1[contains(text(),'Jewelry')]"));
        verifyResult(By.xpath("//h1[contains(text(),'Jewelry')]"), "Jewelry");
    }

    @Test
    public void verifyUserCanNavigateToGiftCardsMenu() throws InterruptedException {
        clickOnElement(By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]"));
        selectMenu("Gift Cards",By.xpath("//h1[contains(text(),'Gift Cards')]"));
      verifyResult(By.xpath("//h1[contains(text(),'Gift Cards')]"), "Gift Cards");
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}