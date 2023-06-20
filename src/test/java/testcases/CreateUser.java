package testcases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class CreateUser {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        String ChromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        System.setProperty("webdriver.chrome.driver", "ChromeDriverPath");
        driver.get("https://accounts.simplilearn.com/user/login?redirect_url=https%3A%2F%2Flms.simplilearn.com%2F");
        driver.findElement(By.xpath("//a[@class='link1']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[@class='btn icon-set-before btn-signup email-btn']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@class='uname fname']")).sendKeys("Jyothika");
        driver.findElement(By.xpath("//input[@class='uname lname']")).sendKeys("nandamuri");
        driver.findElement(By.xpath("//input[@class='email']")).sendKeys("jyothikanandamuri3@gmail.com");
        //driver.findElement(By.xpath("//select['country_code sel_cr']")).isSelected();
        driver.findElement(By.xpath("//input[@class='phone-no']")).sendKeys("4387225356");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Jyothika@777");
        driver.findElement(By.xpath("//input[@id='agree_email_comm']/following-sibling::label")).click();
        driver.findElement(By.xpath("//input[@id=\"btn_register\"]")).click();




        driver.quit();
    }
}
