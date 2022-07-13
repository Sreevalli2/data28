package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigating {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Navigation n=driver.navigate();
		n.to("https://www.rediff.com/");
		driver.findElement(By.xpath("//a[text()='Rediffmail']")).click();
		
		Thread.sleep(1000);
		n.back();
		Thread.sleep(1000);
		n.forward(); 
		driver.findElement(By.id("login1")).sendKeys("sreevalli");
		driver.findElement(By.id("password")).sendKeys("sreevalli");
		Thread.sleep(1000);
		n.refresh();
		Thread.sleep(1000);
		driver.quit();
		

	}

}
