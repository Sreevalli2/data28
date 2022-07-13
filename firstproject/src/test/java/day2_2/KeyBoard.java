package day2_2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBoard {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waits for every search 30 sec
	    driver.get("http://www.myntra.com/");
	    Actions act=new Actions(driver);
	    act.keyDown(Keys.CONTROL);
	    act.sendKeys("A");
	    act.build().perform();
	    driver.quit();
	}

}
