package pjt;
import org.apache.commons.io.FileUtils;   
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.OutputType;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;



public class Example {
static WebDriver driver;
	 public static void main(String[] args)throws IOException {
		
		System.setProperty("webdriver.chrome.driver", "E:\\\\Pallavi\\\\chromedriver_win32\\\\chromedriver.exe");
 driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("http://www.facebook.com");
	takeScreenshot("Facebook");
	
		
}

public static void takeScreenshot(String fileName)throws IOException
{  File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
FileUtils.copyFile(file,new File("F:\\seleniumm"+fileName+".jpg"));
}

}

