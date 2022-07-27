package Mobile_World;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Contact_Us  {
	WebDriver driver;
    @Test
    
    public void ContactUs() {
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhammakka.pandav\\Desktop\\chromedriver.exe");
        driver=new ChromeDriver();
        driver.get("https://mobileworld.azurewebsites.net/");
 
    driver.findElement(By.xpath("(//a[@id='navbarDropdown'])[2]")).click();
    driver.findElement(By.xpath("(//a[.='Contact Us'])[1]")).click();
     Set<String> win=driver.getWindowHandles();
        Iterator<String> it=win.iterator();
        String parentId=it.next();
        String childId=it.next();
       driver.switchTo().window(childId);
        driver.manage().window().maximize();
    driver.findElement(By.name("name")).sendKeys("Dhammu");
    driver.findElement(By.name("email")).sendKeys("pandavdhammakka@gmail.com");
    driver.findElement(By.name("phone")).sendKeys("8217399539");
    driver.findElement(By.name("message")).sendKeys("hi dhammakka");
    driver.findElement(By.xpath("//input[@type='submit']")).click();
}

}
