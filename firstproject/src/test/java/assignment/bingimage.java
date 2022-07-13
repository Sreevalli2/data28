package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class bingimage {
	WebDriver driver;
	public bingimage() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = new ChromeDriver();
	}
	public void loadUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");	
		System.out.println(driver.getTitle());
	}
	public void searchImage() {
		System.out.println("clicking");
		WebElement z=driver.findElement(By.xpath("//a[text()='Images']"));
		Actions a=(Actions)driver;
		a.moveToElement(z);
//z.click();
		//k.submit();
		a.sendKeys(Keys.ENTER);
		
	}
	public void imagecount() {
		List<WebElement> m=driver.findElements(By.xpath("//div[starts-with(@class,'ilp_')]"));
		System.out.println(m.size());
	}
	
	public void quit() {
		driver.quit();		
	}
	

}
