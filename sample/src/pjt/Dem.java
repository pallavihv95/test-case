package pjt;

import java.util.Set;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Dem {

	public static void main(String[] args) throws IOException {
	//Runtime.getRuntime().exec("F:\\selenium\\fileupload.exe");
	System.setProperty("webdriver.chrome.driver", "E:\\Pallavi\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("file:///C:/Users/Praveen%20HV/Desktop/Chromedriver/first.html");
	driver.findElement(By.xpath("//input[@type='file']")).click();
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	}
	


















