package day1_1;

import java.util.ArrayList;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class myntraswitch {
	WebDriver driver;
	public myntraswitch() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
	driver = new ChromeDriver();
	}
	public void loadUrl() {
		driver.manage().window().maximize();
		driver.get("https://www.myntra.com/");	
		System.out.println(driver.getTitle());
	}
	public void openSectionTab() {
		System.out.println("men is clicked");
		WebElement men=driver.findElement(By.xpath("//a[text()='Men'][@class='desktop-main']"));
        men.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));	
    	WebElement women=driver.findElement(By.xpath("//a[text()='Women'][@class='desktop-main']"));
        women.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
    	WebElement kids=driver.findElement(By.xpath("//a[text()='Kids'][@class='desktop-main']"));
    	  kids.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
    	 	WebElement homelive=driver.findElement(By.xpath("//a[text()='Home & Living'][@class='desktop-main']"));
    	 	homelive.sendKeys(Keys.chord(Keys.CONTROL,Keys.RETURN));
	}
	public void switchWindow() {
		//Set<String> al=driver.getWindowHandles();
		//System.out.println("total:"+al.size());
		ArrayList<String> all=new ArrayList<String>(driver.getWindowHandles());
		driver.switchTo().window(all.get(1));	
	}
	public void close() throws Exception {
		Thread.sleep(1000);
		driver.close();
	}
	public void quit() {
		driver.quit();
		
	}

}
