package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Explicitwait2 {
static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.google.com/");
        driver.findElement(By.name("q")).sendKeys("Apple");
        WebDriverWait wait=new WebDriverWait(driver,20);
    	//WebElement search=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//li[@data-view-type='1']"))); 	
    	WebElement search=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@data-view-type='1']")));
    	search.click();
    	WebElement search1=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h3[text()='Apple (India)']")));
    	search1.click();
    	Wait wait1=new FluentWait(driver).
    			withTimeout(30,TimeUnit.SECONDS).
    			pollingEvery(30,TimeUnit.SECONDS)
    			.ignoring(NoSuchElementException.class);

        driver.quit();
	}

}
