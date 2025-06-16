package zExamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WebPage {
	WebDriver driver;
	
	By userNameField= By.cssSelector("#user-name");
	By passwordFiled=By.xpath("//input[@class='input_error form_input' and @id='password' ]");
	By loginButton=By.id("login-button");
	
	
	//Actions
	public void actions(String uname, String password) {
		driver.findElement(userNameField).sendKeys(uname);
		driver.findElement(passwordFiled).sendKeys(password);
		driver.findElement(loginButton).click();
	}
	
  //	Constructor
	public WebPage(WebDriver driver) {
		this.driver=driver;
	}
	



}
