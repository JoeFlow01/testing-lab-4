import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class lab4 {
    @Test
    public void test(){
        System.setProperty("webdriver.chrome.driver", "resources/windows/chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/form");
        driver.findElement(By.cssSelector("#first-name")).sendKeys("Youssef");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("Assy");
        driver.findElement(By.cssSelector("#job-title")).sendKeys("computer engineering student");
        driver.findElement(By.cssSelector("#radio-button-1")).click();
        driver.findElement(By.cssSelector("#checkbox-1")).click();
        driver.findElement(By.cssSelector("#select-menu > option:nth-child(2)")).click();
        driver.findElement(By.cssSelector("body > div > form > div > div:nth-child(15) > a")).click();
        driver.quit();
    }


}
