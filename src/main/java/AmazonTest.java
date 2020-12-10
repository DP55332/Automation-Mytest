import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AmazonTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pooja Patel\\Desktop\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in//");
        driver.findElement(By.xpath("//span[contains(text(),'Hello, Sign in')]")).click();
        /*Actions abc = new Actions(driver);
        abc.moveToElement(driver.findElement(By.linkText("Hello, Sign in Account & Lists"))).build ().perform();*/
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("patelpooja5053@gmail.com");

        if (driver.findElement(By.xpath("//input[@id='continue']")).isDisplayed()) {
            driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
        }
        driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("PatelDhavaldp55332");
        driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("9898984438");
        driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("pateldhaval9244@gmail.com");
        driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Dhaval@12345");

        driver.findElement(By.xpath("//input[@id='continue']")).click();

        if (driver.findElement(By.xpath("//h4[contains(text(),'Mobile number already in use')]")).isDisplayed()) {
            driver.findElement(By.xpath("//a[contains(text(),'Forgot your password?')]")).click();}
        driver.findElement(By.xpath("//input[@type=\"email\"]")).sendKeys("9898984438");
        driver.findElement(By.xpath("//input[@id=\"continue\"]")).click();

    }
}



