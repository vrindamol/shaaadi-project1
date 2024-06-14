package Page1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class Loginpage {
    WebDriver driver;
    By Email= By.xpath("//*[@id=\"frmLogin\"]/div[2]/div[2]/input");
   By pass=By.xpath("//*[@id=\"frmLogin\"]/div[2]/div[3]/input");
   By check=By.xpath("//*[@id=\"frmLogin\"]/div[2]/div[4]/div/input");
   // By Password=By.xpath("/html/body/center[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/div[2]/div/form/div[8]/input[1]");
    By login=By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/a[1]");
    By Loginbutton=By.xpath("//*[@id=\"frmLogin\"]/div[2]/button[1]");
    By logo=By.xpath("//*[@id=\"frmLogin\"]/div[2]/div[1]/img");
    By title=By.xpath("//*[@id=\"content\"]/div/div");
    public Loginpage(WebDriver driver)
    {
        this.driver=driver;
    }
    public void verifytitle()
    {

       String exp="Trusted Matrimony, Matchmaking & Matrimonial Service - Shaadi.com";
        String actual=driver.getTitle();
        System.out.println("Title is ---- "+actual);

        Assert.assertEquals(exp, actual);

    }

    public void Login(String email,String password)throws InterruptedException {
        driver.findElement(login).click();

        driver.findElement(Email).sendKeys(email);

        driver.findElement(pass).sendKeys(password);
        driver.findElement(check).click();

        driver.findElement(Loginbutton).click();

    }
    public void Logo()
    {
        Boolean Logo=driver.findElement(logo).isDisplayed();
        if(Logo)
        {
            System.out.println("Logo is diplayed");
        }
        else
        {
            System.out.println("Logo is not displayed");
        }
    }
}
