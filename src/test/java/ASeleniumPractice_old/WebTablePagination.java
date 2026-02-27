package ASeleniumPractice_old;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebTablePagination {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://datatables.net/examples/data_sources/ajax.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebElement allPage = driver.findElement(By.cssSelector("#example_info"));
        Thread.sleep(3000);
        String pageText = allPage.getText();
        System.out.println(pageText);

        //Showing 1 to 10 of 57 entries

        int entries = Integer.parseInt(pageText.substring(pageText.indexOf("f") + 2, pageText.indexOf("entries") - 1));
        System.out.println("Entries= "+entries);
        int totalPages = entries / 10;
        System.out.println("Total pages= "+totalPages);
        for (int i = 1; i < totalPages;i++){
           WebElement link= driver.findElement(By.xpath("//nav/button[@data-dt-idx="+i+"]"));
           Thread.sleep(2000);
           link.click();
        }
        driver.close();

    }
}
