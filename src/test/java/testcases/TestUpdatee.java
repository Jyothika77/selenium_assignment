package testcases;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Homepage;


import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

public class TestUpdatee {
    WebDriver driver=null;
    @BeforeMethod
    public void setUp() throws IOException, org.json.simple.parser.ParseException
    {
        WebDriverManager.chromedriver().setup();
        String chromeDriverPath = "C:\\software\\chromedriver_ver113\\chromedriver\\chromedriver.exe";
        System.setProperty("webDriver.chrome.driver", chromeDriverPath);
        String LoginDataPath = "src/main/resources/LoginData.json";
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
        driver.manage().window().maximize();
        System.out.println(driver.getTitle());
        FileReader fr = new FileReader(LoginDataPath);
        JSONParser parser = new JSONParser();
        Object obj = parser.parse(fr);
        JSONObject jsonObject = (JSONObject) obj;
        String url = (String) jsonObject.get("url");
        System.out.println(url);
        driver.get(url);
    }

    @AfterMethod
    public void tearDown() throws InterruptedException
    {
        Thread.sleep(1000);
        driver.quit();
    }
    @Test
    public void updateUser() throws IOException, ParseException, InterruptedException
    {

        String searchCompDataPath="src/main/resources/TestCases.json";
        FileReader fr=new FileReader(searchCompDataPath);
        JSONParser Parser=new JSONParser();
        Object ob= Parser.parse(fr);
        JSONObject jsonObject=(JSONObject) ob;
        JSONObject tc=(JSONObject) jsonObject.get("tc01");

        String Username=(String) tc.get("Username");
        String password=(String) tc.get("password");
        String expMsg="Valid";
        System.out.println(expMsg+" "+Username+" "+password);
        Homepage home = new Homepage(driver);
        //driver.findElement(By.xpath("icon-set-after down-arrow ng-star-inserted")).click();

        home.setEmail(Username);
        home.setPassword(password);
        home.clickLogin1();
        Thread.sleep(2000);
        home.clickAccount();
        home.clickAddress();
        home.clickAddress1();
        home.setClear();
        home.setName7("Jyothikaaa");
        home.clickSave();
        System.out.println("pass");
        Thread.sleep(2000);
        driver.quit();





    }
}
