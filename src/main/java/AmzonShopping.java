import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmzonShopping {

    public static WebDriver driver;
    public static String driverPath = ".\\src\\main\\resources\\chromedriver.exe";


    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",driverPath);
        driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
    }

   /* @Given("^The has been launched$")
    public void theHasBeenLaunched() {
    }
*/
}
