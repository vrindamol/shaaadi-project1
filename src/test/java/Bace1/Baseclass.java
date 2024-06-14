package Bace1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class Baseclass {
    public WebDriver driver;
    protected String baseurl="https://www.shaadi.com/";
    @BeforeClass
    public void setUp()
    {
        driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseurl);
    }
}
