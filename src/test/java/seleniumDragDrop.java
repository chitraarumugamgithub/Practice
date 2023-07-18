import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
public class seleniumDragDrop {
    private static WebDriver driver = null;

    public static void main(String[] args) {


        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        options.addArguments("--disable-notifications");

        driver = new ChromeDriver(options);


        // Launch Website
        driver.navigate().to("https://www.testandquiz.com/selenium/testing.html");

        //WebElement on which drag and drop operation needs to be performed
        WebElement from = driver.findElement(By.id("sourceImage"));

        //WebElement to which the above object is dropped
        WebElement to = driver.findElement(By.id("targetDiv"));

        //Creating object of Actions class to build composite actions
        Actions act = new Actions(driver);

        //Performing the drag and drop action
        act.dragAndDrop(from,to).build().perform();
    }

}
