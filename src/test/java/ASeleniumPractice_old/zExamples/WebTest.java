package ASeleniumPractice_old.zExamples;

import java.time.Duration;

//import org.junit.BeforeClass;
//import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class WebTest {
	WebDriver driver;
	WebPage webPage;
	
	@BeforeTest
	void setUp() {
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		webPage=new WebPage(driver);
	}
	
	@Test(dataProvider = "dataProvide")
	void login(String user, String pass) {
//		webPage.actions("standard_user", "secret_sauce");
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		webPage.actions(user,pass);
	}
	
	@DataProvider(name="dataProvide")
	public String[][] getData(){
		String data[][]= { {"standard_user","secret_sauce"} ,{"performance_glitch_user","secret_sauce"}, {"problem_user","secret_sauce"}};
		return data;
	
	}
	
}
