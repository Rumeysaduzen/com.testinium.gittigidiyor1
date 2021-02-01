package base;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;

public class BaseTest {

    protected static String ChromePath = "C:\\Users\\rumeysa\\eclipse-workspace\\com.testinium.gittigidiyor1\\src\\main\\java\\driver\\chromedriver.exe";
    protected static ChromeDriverService service;
    protected static WebDriver driver;
    protected static WebDriverWait wait;
    public static Logger logger = Logger.getLogger(BaseTest.class);
private boolean isFirst = true;




    public BaseTest(){

        if (isFirst){
            BasicConfigurator.configure();
            logger.info("Test Started");
            service = new ChromeDriverService.Builder().
                    usingDriverExecutable(new File(ChromePath)).
                    usingAnyFreePort().
                    build();
            try {
                service.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
            System.setProperty("webdriver.chrome.driver", ChromePath);

            driver = new RemoteWebDriver(service.getUrl(), DesiredCapabilities.chrome());
            wait = new WebDriverWait(driver, 15);
            driver.manage().window().maximize();
        }
        isFirst = false;


    }
}
