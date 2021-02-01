package pages;


import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePage extends BasePage {
//*[@id="product_id_646934313"]

    public By shopElement = By.cssSelector("header[id='main-header'] a[class='sc-84am1q-0 sc-1r48nyr-0 gpYIaK']");
    public By signInElement = By.id("H-Login");
    public By productPcElement = By.xpath("//*[@id=\"item-info-block-635623361\"]");
    public By addElement = By.id("add-to-basket");
    public By searchInputElement = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[1]/div[2]/input");
    public By secondPElement = By.xpath("//*[@id=\"best-match-right\"]/div[5]/ul/li[2]/a");
    public By searchIcElement = By.xpath("//*[@id=\"main-header\"]/div[3]/div/div/div/div[2]/form/div/div[2]/button");

    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void shopIcon() {
        driver.findElement(shopElement).click();


    }

    public void signInIcon1() {
        driver.findElement(signInElement).click();

    }

    public void productPc() {
        driver.findElement(productPcElement).click();


    }

    public void addProduct() {
        driver.findElement(addElement).click();
    }

    public void searchInput() {
        driver.findElement(searchInputElement).sendKeys("bilgisayar");
    }

    public void secondPage() {
        driver.findElement(secondPElement).click();
    }

    public void searchIcon() {
        driver.findElement(searchIcElement).click();
    }
}
