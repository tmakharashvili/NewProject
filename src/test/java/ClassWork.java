import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ClassWork {
    @Test
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\tamarmakharashvili\\Desktop\\ClassWork1\\src\\main\\resources\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        System.out.println(driver.getTitle());
        driver.quit();

    }
}
