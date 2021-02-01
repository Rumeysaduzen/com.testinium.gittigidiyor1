package tests;

import base.BaseTest;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;
import pages.ProductPage;
import pages.ShopPage;

public class HomePageTest extends BaseTest {


    public String product = "bilgisayar";
    public String shopProductPrice;


    HomePage home = new HomePage(driver, wait);

    public HomePageTest() {
        super();


    }

    @Test(priority = 1)
    public void homePage() throws Exception {

        LoginPage login = new LoginPage(driver, wait);
        String expectedTitle = "GittiGidiyor";
        String url = "https://www.gittigidiyor.com/";
        driver.get(url);

        home.shopIcon();
        home.signInIcon1();
        if (driver.getTitle() != null && driver.getTitle().contains(expectedTitle)) {
            logger.debug("Web page is opened");
        } else {
            logger.debug("Web page could not open.");
        }
        try {
            Thread.sleep(5000);

            login.EmailTxt();
            login.SifreTxt();
            login.GirisBtn();
            Thread.sleep(1000);

        } catch (Exception e) {
            e.printStackTrace();
            logger.debug("Web page could not open.... :" + e.getMessage());
        }
        driver.get(url);
        Thread.sleep(5000);

        HomePage home = new HomePage(driver, wait);

        home.searchInput();
        home.searchIcon();
        Thread.sleep(3000);

        JavascriptExecutor js = ((JavascriptExecutor) driver);
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");

        Thread.sleep(3000);
        home.secondPage();
        Thread.sleep(3000);
        home.productPc();
        Thread.sleep(3000);

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0,250)");
        home.addProduct();

        ProductPage product = new ProductPage(driver, wait);
        home.addProduct();

        Thread.sleep(3000);
        product.iconBasket();
        Thread.sleep(3000);


        Thread.sleep(3000);


        ShopPage shop = new ShopPage(driver, wait);
        ProductPage productPage = new ProductPage(driver, wait);

        shopProductPrice = shop.shopPrice();

        logger.info("Ürünün sepetteki fiyatı: " + shopProductPrice);
        Thread.sleep(3000);

        Assert.assertEquals("Ürün fiyatı, ürün sayfası ve sepette aynı değil!", productPage.productPrice(), shopProductPrice);


        Thread.sleep(3000);
        logger.info("ürün siliniyor.....");
        shop.btnDelete();
        Thread.sleep(3000);


    }

}
