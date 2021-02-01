package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShopPage extends BasePage {


    public ShopPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By shoppriceElement = By.xpath("//*[@id=\"cart-price-container\"]/div[3]/p");
    public By spinnerUpElement = By.className("plus icon-plus gg-icon gg-icon-plus");
    public By spinnerNumberElement = By.xpath("//*[@class='amount']");
    public By btnDeleteElement = By.className("btn-delete");
    public By shopCheckElement = By.xpath("//*[@id='empty-cart-container']/div[1]/div[1]/div");


    public String shopPrice() {
        return driver.findElement(shoppriceElement).getAttribute("innerText").toString();


    }

    public void spinnerUp() {
        driver.findElement(spinnerUpElement).click();

    }

    public String spinnerNumber() {
        return driver.findElement(spinnerNumberElement).getAttribute("innerText");
    }

    public void btnDelete() {
        driver.findElement(btnDeleteElement).click();

    }

    public void shopCheck() {
        driver.findElement(shopCheckElement);
    }

}
