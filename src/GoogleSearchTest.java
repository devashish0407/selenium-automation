import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearchTest {
    public static void main(String[] args) {
        // Setup ChromeDriver (or any other browser)
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver-win64");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Open Google
        driver.get("https://www.google.com");

        // Print the title of the pageclea
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();
    }
}
