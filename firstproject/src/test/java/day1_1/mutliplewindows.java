package day1_1;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class mutliplewindows {
static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.google.com");	
			System.out.println(driver.getTitle());
		
			for (int i = 1; i < 10; i++) {
					if(i==3)
	            	driver.close();
					else
	            ((JavascriptExecutor)driver).executeScript("window.open('https://www.google.com/')");
	            ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	            driver.switchTo().window(tabs.get(i));
	            Thread.sleep(2000);
				}
			driver.quit(); 
			}  
			
			}
	


