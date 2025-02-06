//package ge.automation.tests;
//
//import ge.automation.BaseTest;
//import ge.automation.pages.InventoryPage;
//import ge.automation.pages.LoginPage;
//import org.testng.Assert;
//import org.testng.annotations.Test;
//
//public class LoginTest extends BaseTest {
//    @Test
//    public void testValidLogin() {
//        LoginPage loginPage = new LoginPage(driver);
//        loginPage.login("standard_user", "secret_sauce");
//
//        String expectedUrl = "https://www.saucedemo.com/inventory.html";
//        String actualUrl = driver.getCurrentUrl();
//        Assert.assertEquals(actualUrl, expectedUrl, "Wrong Url");
//
//        InventoryPage inventoryPage = new InventoryPage(driver);
//        String expectedHeaderText = "Products";
//        String actualHeaderText = inventoryPage.getInventoryHeaderText();
//        Assert.assertEquals(actualHeaderText, expectedHeaderText);
//    }
//    @Test
//    public void testLoginButtonTextColor(){
//        LoginPage loginPage = new LoginPage(driver);
//
//        String expectedColor = "rgba(19, 35, 34, 1)";
//        String actualColor = loginPage.getLoginButtonTextColor();
//        Assert.assertEquals(actualColor, expectedColor);
//    }
//}
package ge.automation.tests;

import ge.automation.BaseTest;
import ge.automation.pages.InventoryPage;
import ge.automation.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testValidLogin() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl, expectedUrl, "Wrong Url");

        InventoryPage inventoryPage = new InventoryPage(driver);
        String expectedHeaderText = "Products";
        String actualHeaderText = inventoryPage.getInventoryHeaderText();
        Assert.assertEquals(actualHeaderText, expectedHeaderText);
    }
    @Test
    public void testLoginButtonTextColor(){
        LoginPage loginPage = new LoginPage(driver);

        String expectedColor = "rgba(19, 35, 34, 1)";
        String actualColor = loginPage.getLoginButtonTextColor();
        Assert.assertEquals(actualColor, expectedColor);
    }
}
