
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;
public class Investing {
    /*public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja Patel\\Desktop\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/");
        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        if (driver.findElements(By.cssSelector("i.popupCloseIcon")).size()!=0){
            if(driver.findElement(By.cssSelector("i.popupCloseIcon")).isDisplayed()) {
                driver.findElement(By.cssSelector("i.popupCloseIcon")).click();
            }
        }
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Charts']"))).build().perform();
        driver.findElement(By.linkText("Live Charts")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search the website...']")).sendKeys("tata steel.LTD");
        driver.findElement(By.cssSelector(".searchGlassIcon")).click();


        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
        driver.close();
        driver.quit();
    }*/

    public static WebDriver driver;

    @BeforeClass
    public static void launchApp(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\Pooja Patel\\Desktop\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.investing.com/");
        try {

            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test(priority = 2)
    public static void chartSearch(){
        if (driver.findElements(By.cssSelector("i.popupCloseIcon")).size()!=0){
            if(driver.findElement(By.cssSelector("i.popupCloseIcon")).isDisplayed()) {
                driver.findElement(By.cssSelector("i.popupCloseIcon")).click();
            }
        }
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Charts']"))).build().perform();
        driver.findElement(By.linkText("Live Charts")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search the website...']")).sendKeys("tata steel.LTD");
        driver.findElement(By.cssSelector(".searchGlassIcon")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @Test(priority = 1)
    public static void marketOverview(){
        if (driver.findElements(By.cssSelector("i.popupCloseIcon")).size()!=0){
            if(driver.findElement(By.cssSelector("i.popupCloseIcon")).isDisplayed()) {
                driver.findElement(By.cssSelector("i.popupCloseIcon")).click();
            }
        }
        Actions act=new Actions(driver);
        act.moveToElement(driver.findElement(By.xpath("//a[text()='Analysis']"))).build().perform();
        driver.findElement(By.linkText("Market Overview")).click();
        driver.findElement(By.xpath("//input[@placeholder='Search the website...']")).sendKeys("Tesla.LTD");
        driver.findElement(By.cssSelector(".searchGlassIcon")).click();

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }

    @AfterClass
    public static void cleanUp(){
        driver.close();
        driver.quit();
    }

}
