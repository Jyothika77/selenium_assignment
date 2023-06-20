package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
    WebDriver driver=null;
    public Homepage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void setFirstname(String value) //FirstNameRegister
    {
        String loc="//input[@class='uname fname']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);


    }

    public void setLastname(String value)  //LastNameRegister
    {
        String loc="//input[@class='uname lname']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }

    public void setName7(String value) //ProfileFirstName
    {
        String loc="//input[@name='first_name']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }



    public void setEmail(String value)  //EmailRegister
    {
        String loc="//input[@class='email']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }

    public void setCountrycode(String Value)  //countryCode
    {
        String loc="//select['country_code sel_cr']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(Value);

    }

    public void setPhonenumber(String Value)  //PhoneNumber
    {
        String loc="//input[@class='phone-no']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(Value);

    }

    public void setPassword(String Value)   //PasswordRegister
    {
        String loc="//input[@id='password']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(Value);

    }

    public void clickRegister()   //CreateAccount
    {
        String loc="//input[@id=\"btn_register\"]";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }

    public void clickLogin()  //ForLogin
    {
        String loc="//input[@class='btn btn-default btn-signup']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }

    public void clickLogin1()  //AnotherLogin
    {
        String loc="//input[@class='btn btn-default btn-signup']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
    public void clickAccount()   //HomePageAccountClick
    {
        String loc="//a[@class='icon-set-after down-arrow ng-star-inserted']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }


    public void clickAddress()     //HomePageProfileClick
    {
        String loc="//a[@title='User Profile']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
    public void clickAddress1()    //LastNameClick
    {
        String loc="//div//input[@name='last_name']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }



    public void setClear()   //LastNameClear
    {
        String loc="//div//input[@name='last_name']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.clear();

    }

    public void clickSave()    //ProfileSaveCick
    {
        String loc="//input[@class='btn btn-default']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
    public void setSearch(String value) //Searching
    {
        String loc="//input[@class='main-content-dashboard ng-pristine ng-valid ng-touched']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.sendKeys(value);

    }


    public void clickSearch()
    {
        String loc="//input[@class='main-content-dashboard ng-pristine ng-valid ng-touched']";
        WebElement e=this. driver.findElement(By.xpath(loc));
        e.click();

    }
















}