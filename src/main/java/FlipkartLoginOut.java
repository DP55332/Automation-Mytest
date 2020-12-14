import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class FlipkartLoginOut {
    public static void main(String[] arg) throws IOException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja Patel\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");
        driver.manage().window().maximize();
//        driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
        driver.findElement(By.xpath("//input[@type='text' and not(@name)]")).sendKeys("8490092338");
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("pooja2298");
        driver.findElement(By.xpath("//button[@type='submit']/span")).click();
        driver.quit();
        Runtime.getRuntime().exec("taskkill /F /IM chromedriver.exe /T");
    }
}
