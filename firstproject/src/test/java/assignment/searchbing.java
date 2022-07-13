package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class searchbing {
	WebDriver driver;
	public searchbing() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = new ChromeDriver();
	}
	public void loadUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");	
		System.out.println(driver.getTitle());
	}
	public void search() {
		WebElement k=driver.findElement(By.className("sb_form_q"));
		k.sendKeys("Capgemini India");
		k.sendKeys(Keys.ENTER);
	}
	public void retrive() {
		driver.findElement(By.xpath("//h2[text()='Capgemini Technology Services India Limited']"));
		WebElement k=driver.findElement(By.xpath("//div[@class='iconDataList']"));
		System.out.println(k.getText());
	}
	public void quit() {
		driver.quit();		
	}
	
}
