package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ShareLaneTest {

    @Test
    public void fillZipCodeFieldTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }


    @Test
    public void fillAllRequiredFields() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Peter");
        driver.findElement(By.name("email")).sendKeys("peter.griffin19@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("9876543");
        driver.findElement(By.name("password2")).sendKeys("9876543");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void fillAllFields() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Meg");
        driver.findElement(By.name("last_name")).sendKeys("Griffin");
        driver.findElement(By.name("email")).sendKeys("meg.griffin21@gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1234567");
        driver.findElement(By.name("password2")).sendKeys("1234567");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void fillOnlyLastNameField() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("last_name")).sendKeys("Griffin");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void fillAllFieldsUsingInvalidEmail() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Meg");
        driver.findElement(By.name("last_name")).sendKeys("Griffin");
        driver.findElement(By.name("email")).sendKeys("meg.griffin21gmail.com");
        driver.findElement(By.name("password1")).sendKeys("1234567");
        driver.findElement(By.name("password2")).sendKeys("1234567");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void fillAllFieldsWithoutPasswordField() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("zip_code")).sendKeys("55555");
        driver.findElement(By.xpath("//*[@value='Continue']")).click();
        driver.findElement(By.name("first_name")).sendKeys("Meg");
        driver.findElement(By.name("last_name")).sendKeys("Griffin");
        driver.findElement(By.name("email")).sendKeys("meg.griffin21gmail.com");
        driver.findElement(By.name("password2")).sendKeys("1234567");
        driver.findElement(By.xpath("//*[@value='Register']")).click();
        driver.quit();
    }

    @Test
    public void searchBookByItsTitle() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.sharelane.com/cgi-bin/register.py");
        driver.findElement(By.name("keyword")).sendKeys("The Moon and Sixpence");
        driver.findElement(By.xpath("//*[@value='Search']")).click();
        driver.quit();
    }
}
