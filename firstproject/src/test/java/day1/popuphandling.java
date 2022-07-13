package day1;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popuphandling {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		WebElement z=driver.findElement(By.name("q"));
		z.sendKeys("Microsoft");
		z.sendKeys(Keys.ENTER);
		Thread.sleep(4000);
		Set<String> windows=driver.getWindowHandles();
		String p=windows.iterator().next();
		System.out.println(p);
		String c=windows.iterator().next();
		System.out.println(c);
		driver.switchTo().window(p);
		driver.close();
		driver.switchTo().window(c);
		Thread.sleep(2000);
		driver.quit();
	}

}
