package Mobile_World;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


public class login_page extends generic{
    @Test(dataProvider="get")

    public void log(String name,String Pass) throws InterruptedException {
    driver.findElement(By.xpath("//button[.='SIGN IN']")).click();
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='username']")).sendKeys(name);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//input[@id='password']")).sendKeys(Pass);
    Thread.sleep(2000);
    driver.findElement(By.xpath("//label[@for='remember-me']")).click();
    Thread.sleep(2000);
    driver.findElement(By.linkText("Log In")).click();
    Thread.sleep(2000);
    }

@DataProvider(name="get")

public Object[][] gatData()
    {
        Object[][] data=new Object[2][2];
        data[0][0]="pandavdhammakka@gmail.com";
        data[0][1]="123@dhm";
        data[1][0]="dhammupandav@gmail.com";
        data[1][1]="dhm@123";
        return data;
    }

    }
