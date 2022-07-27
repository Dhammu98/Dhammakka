package Mobile_World;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class generic {
	WebDriver driver;
@Test
public void open() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\dhammakka.pandav\\Desktop\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://mobileworld.azurewebsites.net/");
}
//@Test
//public void quit()
//{
//      driver.quit();
//}

}
//