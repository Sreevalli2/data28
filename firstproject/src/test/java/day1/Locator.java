package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.id("login1")).sendKeys("sreevalli");
		driver.findElement(By.id("password")).sendKeys("sreevalli");
		driver.findElement(By.name("proceed")).click();
		System.out.println(driver.findElement(By.tagName("a")).getText());
		driver.quit();

	}

}
