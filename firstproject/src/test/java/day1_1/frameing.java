package day1_1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class frameing {
	WebDriver driver;
	public frameing() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		}
		public void loadUrl() {
			driver.manage().window().maximize();
			driver.get("https://docs.oracle.com/javase/8/docs/api/");	
			System.out.println(driver.getTitle());
		}
		public void switchFrame() {
			//driver.switchTo().frame(0);
			List<WebElement>l=driver.findElements(By.tagName("frame"));
			System.out.println(l);
			System.out.println("totla frames:"+l.size());
			//WebElement frm=driver.findElement(By.xpath("//frame[@name='packagename']"));
			driver.switchTo().frame(1);
			WebElement frm=driver.findElement(By.xpath("//a[text()='AbstractAnnotationValueVisitor8']"));
			driver.switchTo().frame(frm);
			
			
		}
	}


