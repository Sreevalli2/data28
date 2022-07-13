package day1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class links {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = (WebDriver) new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		List<WebElement> e = driver.findElements(By.tagName("a"));
		//e.forEach(x->System.out.println(x.getText()));
		System.out.println(e.size());
		int l=e.size();
	System.out.println(l);
		for (WebElement link : e) {
			System.out.println(link.getText() + " - " + link.getAttribute("href"));
		}
		driver.quit();

	}
}
