//package selenium_base;
//
//import org.junit.jupiter.api.Test;
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//
//import java.util.concurrent.TimeUnit;
//
//public class FirstTest {
//
//    private static final String BASE_URL = "https://www.google.com/";
//    private static final int TIMEOUT = 30;
//
////    @Test
//    public void SeleniumTestEx() {
//
//        WebDriver driver = new ChromeDriver();
//
//        driver.manage().timeouts().implicitlyWait(TIMEOUT, TimeUnit.SECONDS);
//        driver.manage().window().maximize();
//        driver.navigate().to(BASE_URL);
//        driver.findElement(By.name("q")).sendKeys("Youtube");
//        driver.quit();
//    }
//}
