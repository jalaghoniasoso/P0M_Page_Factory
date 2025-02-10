//package ge.automation;
//
//import ge.automation.pages.LoginPage;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//
//import java.time.Duration;
//
//public class BasePage {
//
//    protected WebDriver driver;
//    protected WebDriverWait wait;
//
//    public BasePage(WebDriver driver) {
//        this.driver = driver;
//        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        PageFactory.initElements(driver, this);
//
//    }
//
//
//    public void enterText(By locator, String text) {
//        waitForElementToBeClickable(locator);
//        driver.findElement(locator).sendKeys(text);
//    }
//
//    public void clickToElement(By locator) {
//        driver.findElement(locator).click();
//    }
//
//    public void clickToElementWithWait(By locator) {
//        waitForElementToBeClickable(locator);
//        driver.findElement(locator).click();
//    }
//
//    public void waitForElementToBeClickable(By locator) {
//        wait.until(ExpectedConditions.elementToBeClickable(locator));
//    }
//
//    public String getElementText(By locator) {
//        waitForElementToBeVisible(locator);
//        return driver.findElement(locator).getText();
//    }
//
//    public void waitForElementToBeVisible(By locator) {
//        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
//    }
//
//    public String getCssValue(By locator, String propertyName) {
//        waitForElementToBeVisible(locator);
//        return driver.findElement(locator).getCssValue(propertyName);
//    }
//
//}
package ge.automation;

import ge.automation.pages.LoginPage;
import ge.automation.utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        PageFactory.initElements(driver, this);

    }

    public void enterText(WebElement locator, String text) {
        waitForElementToBeClickable(locator);
        locator.sendKeys(text);
        Utils.log("მოვძებნე ელემენტი: " + locator + " ] გადავეცი ტექსტი: "  + text);
    }

    public void clickToElement(WebElement locator) {
        locator.click();
        Utils.log("დავაკლიკე [ " + locator + " ] - ზე");
    }

    public void clickToElementWithWait(WebElement locator) {
        waitForElementToBeClickable(locator);
        clickToElement(locator);
    }

    public void waitForElementToBeClickable(WebElement locator) {
        Utils.log("ველოდები რომ ელემენტი [ " + locator + " ] გახდეს დაკლიკებადი");
        wait.until(ExpectedConditions.elementToBeClickable(locator));
        Utils.log("ვიპოვე ელემენტი [ " + locator + " ]");
    }

    public String getElementText(WebElement locator) {
        waitForElementToBeVisible(locator);
        return locator.getText();
    }

    public void waitForElementToBeVisible(WebElement locator) {
        Utils.log("ველოდები რომ ელემენტი [ " + locator + " ] გამოჩნდეს");
        wait.until(ExpectedConditions.visibilityOf(locator));
        Utils.log("ელემენტი [ " + locator + " ] გამოჩნდა");
    }

    public String getCssValue(WebElement locator, String propertyName) {
        waitForElementToBeVisible(locator);
        return locator.getCssValue(propertyName);
    }

}
