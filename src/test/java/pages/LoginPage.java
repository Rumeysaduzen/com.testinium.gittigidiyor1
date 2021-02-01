package pages;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {
    //Constructor
    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By emailElement = By.id("L-UserNameField");
    public By passwordElement = By.id("L-PasswordField");
    public By loginBtnElement = By.id("gg-login-enter");


    public void EmailTxt() {
        driver.findElement(emailElement).sendKeys("rumeysaduzen@gmail.com");


    }

    public void SifreTxt() {
        driver.findElement(passwordElement).sendKeys("Rumeysa123-");

    }

    public void GirisBtn() {
        driver.findElement(loginBtnElement).click();
    }

}

