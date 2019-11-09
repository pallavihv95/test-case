package pjt;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestloginS135789 {
	WebDriver driver;
	loginPage login;
	@BeforeMethod
	public void precondition()
	{
		System.setProperty("webdriver.chrome.driver", "E:\\\\Pallavi\\\\chromedriver_win32\\\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://localhost/login.jsp");
		login=new loginPage(driver);
		
	}
	/*@AfterMethod
	public void postcondition()
	{
		driver.close();
	}*/
  @Test
  public void testInvalidLogin() {
	  login.waitForloginPageToLoad();
	  login.getUsernameTextbox().sendKeys("admin");
	  
  }
}
