package assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class bingLinkText {
	WebDriver driver;
	public bingLinkText() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = (WebDriver) new ChromeDriver();
	}
	public void loadurl() {
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");	
		System.out.println(driver.getTitle());
	}
	public void searchlinks() throws Exception { 
		List<WebElement> links=driver.findElements(By.tagName("a"));
		for (WebElement link : links) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
			Thread.sleep(1000);
			System.out.println(links.size());
		
	}
		public void closedd() {
			driver.quit();
			
		}

}
