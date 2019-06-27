package DLD;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class StartClass {
    public static WebDriver driver = null;
    @BeforeMethod
    public void preClass() {
        System.setProperty("webdriver.chrome.driver", "C:\\Automation\\DLD\\driver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://test.dld-vip.com/");
    }
    @AfterMethod
    public void teardownTest () {
        driver.close();
    }
}
