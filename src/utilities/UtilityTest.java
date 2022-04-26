package utilities;

import basetest.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class UtilityTest extends BaseTest {

    /**
     * This method will click on element
     */

    public void clickOnElement(By by){
        driver.findElement(by).click();
    }

    /**
     * This method will find elements and send data to element
     */
    public void sendTextToElement(By by, String text){
        driver.findElement(by).sendKeys(text);
    }

    /*
     * This method will get actual text from element
     */
    public String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }

    /**
     * This method will hover mouse to element
     */
    public void mouseHoverAction(By by){
        Actions actions = new Actions(driver);
        WebElement mouse = driver.findElement(by);
        actions.moveToElement(mouse).build().perform();
    }

    /**
     * This method will hover mouse to element and click on element
     */
    public void mouseHoverActionAndClick(By by){
        Actions actions = new Actions(driver);
        WebElement mouse = driver.findElement(by);
        actions.moveToElement(mouse).click().build().perform();
    }

    /**
     * This method verify actual and expected message using Assert method
     */

    public void verifyResult(By by, String expectedText){
        String actualText = getTextFromElement(by);
        Assert.assertEquals(actualText,expectedText);
    }
    /**
     * This method will select value from dropdown using selectByVisibleText() method
     */

    public void selectByVisibleTextFromDropDown(By by, String text){
        WebElement dropDown = driver.findElement(by);
        Select select = new Select(dropDown);
        select.selectByVisibleText(text);

    }

    /**
     * This method will select value from dropdown using selectByValue() method
     */

    public void selectByValueFromDropDown(By by, String text){
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByValue(text);
    }

    /**
     * This method will select index value for dropdown text using selectByIndex() method
     */

    public void selectByIndexFromDropDown(By by, int index){
        WebElement dropdown = driver.findElement(by);
        Select select = new Select(dropdown);
        select.selectByIndex(index);
    }

    /**
     * This method will perform mouse drag and drop action
     */

    public void dragAndDrop(By drag, By drop){
        Actions actions = new Actions(driver);

        WebElement draggable = driver.findElement(drag);
        WebElement droppable = driver.findElement(drop);

        actions.dragAndDrop(draggable,droppable).build().perform();

    }

    /**
     * This method will perform mouse slider action based on x and y value
     */
    public void sliderAction(By by, int x, int y){
        Actions actions = new Actions(driver);
        WebElement slider = driver.findElement(by);
        actions.dragAndDropBy(slider,x,y).build().perform();
    }

    /**
     * This method will perform mouse right click action
     */
    public void mouseRightClickAction(By by){
        Actions actions = new Actions(driver);
        WebElement button = driver.findElement(by);
        actions.contextClick().build().perform();
    }
    /**
     * This method will switch to and accept alert
     */

    public void acceptAlert(){
        driver.switchTo().alert().accept();
    }

    /**
     * This method will switch to and dismiss/cancel alert
     */

    public void dismissAlert(){
        driver.switchTo().alert().dismiss();
    }

    /**
     * This method will get and return text from alert
     */

    public String getTextAlert(){
        return driver.switchTo().alert().getText();
    }
    /**
     *  Clear the value of any element
     */
    public void clearValue(By by){
        driver.findElement(by).clear();
    }

}
