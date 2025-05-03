package alertHandle;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
//		normal alert with ok button
		WebElement normalOk=driver.findElement(By.xpath("//*[text()='Click for JS Alert']"));
		normalOk.click();
		
		Alert alert=driver.switchTo().alert();
		String alertMesg=alert.getText();
		System.out.println("Alert messge= "+alertMesg);
		alert.accept();
		Thread.sleep(2000);
		
//		Confirm alert cancel and ok
		
		WebElement confirmAlert=driver.findElement(By.cssSelector("button[onclick='jsConfirm()']"));
		confirmAlert.click();
		
		Alert alertConfirm=driver.switchTo().alert();
		String confirmText=alertConfirm.getText();
		System.out.println("confirmText= "+confirmText);
		alertConfirm.accept();
//		alertConfirm.dismiss();
		
//		Promt alert send mesg/ok/cancel
		WebElement promptAlert=driver.findElement(By.cssSelector("button[onclick='jsPrompt()']"));
		promptAlert.click();
		
		Alert prompt=driver.switchTo().alert();
		prompt.sendKeys("My Name is Dhananjay");
		Thread.sleep(3000);
		String getText=prompt.getText();
		System.out.println("prompt text= "+prompt);
		prompt.accept();
		
		
//		Thread.sleep(3000);
//		driver.close();
		System.out.println("Code ends-------");

	}

}
