package ge.automation.pages;

import ge.automation.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){
        super(driver);
    }

    private By usernameFiled = By.id("user-name");
    private By passwordFiled = By.id("password");
    private By loginButton = By.id("login-button");
    public void login(String username, String password){
//        driver.findElement(usernameFiled).sendKeys(username);
//        driver.findElement(passwordFiled).sendKeys(password);
//        driver.findElement(loginButton).click();
//

        enterText(usernameFiled, username);
        enterText(passwordFiled, password);
        clickToElementWithWait(loginButton);
    }
    public String getLoginButtonTextColor(){
        return getCssValue(loginButton, "color");
    }
}
