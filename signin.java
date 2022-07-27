
package Mobile_World;
import org.openqa.selenium.By;
import org.testng.annotations.Test;
public class signin extends generic {
@Test
public void signup() throws InterruptedException {
driver.findElement(By.xpath("//button[@class='btn btn-warning my-2 my-sm-0']")).click();
Thread.sleep(4000);
driver.findElement(By.linkText("Sign up")).click();
driver.findElement(By.xpath("//input[@id='myName']")).sendKeys("Dhammakka");
driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Pandav");
driver.findElement(By.xpath("//input[@placeholder='Enter Email']")).sendKeys("pandavdhammakka@gmail.com");
driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("qualitest123");
driver.findElement(By.xpath("//input[@type='date']")).sendKeys("03-11-1998");
driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
driver.findElement(By.xpath("//input[@placeholder='91XXXXXXXXXX']")).sendKeys("8217399539");
driver.findElement(By.xpath("//textarea[@placeholder='Short Bio']")).sendKeys("I want to  order a phone");
driver.findElement(By.xpath("//button[@type='submit']")).click();
Thread.sleep(3000);
driver.switchTo().alert().accept();
//.quit();
}
}

