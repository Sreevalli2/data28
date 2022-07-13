package day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class googleAutoSuggestion {
	WebDriver driver;
	public googleAutoSuggestion() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = new ChromeDriver();
		
	}
	public void autosuggestion() throws Exception {
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("howstuffworks");
		Thread.sleep(1000);
		List<WebElement> allautosugg=driver.findElements(By.xpath("//li[@class='sbct']"));
		List<WebElement>l=allautosugg;
		WebElement z=l.get(2);
		System.out.println("Count of itmes:"+allautosugg.size());
		System.out.println("The auto suggested items are:");
		System.out.println("-----------------------------");
		allautosugg.forEach(x->System.out.println(x.getText()));
		
		System.out.println("the third item is clicked:");
		System.out.println("--------------------------");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		z.click();
		System.out.println(z.getText());
	}
}
