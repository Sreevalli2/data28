package assignment;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class tablePracticeFluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
		driver.get("C:\\Users\\skotapat\\eclipse-workspace2\\firstproject\\src\\main\\resources\\new.html");

		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(250,  TimeUnit.MILLISECONDS);
		wait.withTimeout(2, TimeUnit.MINUTES);
		wait.ignoring(NoSuchElementException.class); 
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("tr:nth-child(1)>td:nth-child(1)")).getText());
		WebElement z=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
		WebElement z1=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
		System.out.println(z.getTagName());
      System.out.println(z.getText());


	    	
	    			

}
	    		  }

