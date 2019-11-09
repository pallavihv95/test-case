package pjt;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
public class LauchBrowser {
public static void main(String[] args)throws Exception {
	File f=new File("C:/Users/Praveen HV/Desktop/Chromedriver/abcd.properties");
	FileInputStream fis=new FileInputStream(f);
	Properties prop=new Properties();
	prop.load(fis);
	String data=prop.get("age").toString();
	System.out.println(data);
}
}
