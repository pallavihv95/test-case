package pjt;
import java.sql.Driver;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
public class loginPage {
WebDriver driver;
public loginPage(WebDriver driver)
{
	this.driver=driver;
	}
public void waitForloginPageToLoad()
{
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOf(getUsernameTextbox()));

}
public WebElement getUsernameTextbox()
{
	try
	{
		WebElement element=driver.findElement(By.name("username"));
		return element;
	}
	
	catch(Exception e)
	{
		return null;
	}
	public WebElement getPwdTextbox()
	{
		try 
		{  WebElement element=driver.findElement(By.name("pwd"));
			return element;
		}
		catch(Exception e)
		{
			return null;
			
		}
	}
public WebElement getLoginButton()
	{
		try
		{
			return driver.findElement(By.xpath("//input[@type='submit']"));
		}
		catch(Exception e)
		{return null;}
	}
}
}
