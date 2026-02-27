package ASeleniumPractice_old.loginPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	WebDriver driver;
	
//	Constructor
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
	}
	
//	Locators
	
	By username= By.cssSelector(".form_input[data-test='username']");
	By password= By.xpath("//input[@id='password']");
	By loginButton= By.id("login-button");
//	By productDisplay=By.className("product_label");
	
//	Actions
	
	void enterUsername(String uname) {
		driver.findElement(username).sendKeys(uname);
	}
	void enterPassword(String passWord) {
		driver.findElement(password).sendKeys(passWord);;
	}
	void clickLoginButton() {
		driver.findElement(loginButton).click();
	}
	
	public void login(String uname, String passWord) {
		enterUsername(uname);
		enterPassword(passWord);
		clickLoginButton();	
	}
}









