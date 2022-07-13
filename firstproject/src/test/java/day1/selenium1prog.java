package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class selenium1prog {

	public static void main(String[] args) {
		// set system properties to give the path of driver to runtime
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver98.exe");
		//to initialize the webdriver
		WebDriver driver = new ChromeDriver();
		//to the url in browser instance
		driver.get("http://www.naukri.com/");
		driver.navigate().to("https://www.google.com/");
		By searcher=By.name("q");
		driver.findElement(searcher).sendKeys("sree");
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(searcher));
		driver.findElement(searcher).sendKeys("sree");
	
		driver.quit();//closes all the pop up windows
		//driver.close();//closes only background windows
		
		
	}

}
