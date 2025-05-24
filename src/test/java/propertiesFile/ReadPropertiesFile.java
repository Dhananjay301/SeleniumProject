package propertiesFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadPropertiesFile {

	public static void main(String[] args) throws IOException {
//		To read the data from properties
		
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("D:/Workspace/selenium/seleniumWebdriver/src/test/resources/config.properties");
		prop.load(fis);		
		String url=prop.getProperty("url");

//		WebDriver driver=new ChromeDriver();
//		driver.get(url);
		System.out.println(prop.getProperty("browser"));
     	prop.setProperty("browser", "fireFox");
		System.out.println(prop.getProperty("browser"));   // updated at run time but not updated in prop file

     	
//		And want to update the prop file use FOS
		FileOutputStream fos=new FileOutputStream("D:/Workspace/selenium/seleniumWebdriver/src/test/resources/config.properties");
		prop.store(fos, null);
		System.out.println(prop.getProperty("browser"));
		
	}

}
