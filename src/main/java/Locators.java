import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators {

    public static void main(String[] args) {



        System.setProperty("webdriver.gecko.driver",System.getProperty("user.dir") + "/src/main/java/driver/geckodriver.exe");
       // WebDriver driver = new FirefoxDriver();

        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir") + "/src/main/java/driver/chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/locatorspractice");
        driver.findElement(By.id("inputUsername")).sendKeys("testiraM!");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("rahulshettyacademy");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        driver.findElement(By.xpath("//p"))

        driver.quit();
    }
}
