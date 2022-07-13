package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	static WebDriver driver;
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waits for every search 30 sec
	driver.get("https://login.yahoo.com/");
	driver.findElement(By.id("login-username")).sendKeys("priti");
	driver.findElement(By.id("login-signin")).click();
	WebDriverWait wait=new WebDriverWait(driver,20);
	WebElement password=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("login-passwd")));
	password.sendKeys("priti1234");
	
	driver.quit();
}
}
