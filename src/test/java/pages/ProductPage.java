package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProductPage extends BasePage {

    public ProductPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public By iconBasketElement = By.xpath("//*[@id=\"header_wrapper\"]/div[4]/div[3]");
    public By productPriceElement = By.xpath("//*[@id=\"cart-item-455358826\"]/div[2]/div[5]/div[1]/div[1]/strong");


    public void iconBasket() {
        driver.findElement(iconBasketElement).click();


    }

    public String productPrice() {
        return driver.findElement(productPriceElement).getAttribute("innerText");

    }


}


