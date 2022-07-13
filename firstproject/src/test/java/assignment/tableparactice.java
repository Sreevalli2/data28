package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class tableparactice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 *  tr:nth-child(1)>td:nth-child(1)
		 *  //tr[1]/td[1]
		 *  //td[contains(text(),'123')]
		 *  //*[@id='new']/td[contains(text(),'123')]
		 *  //td[@id='edit' and contains(text(),'123')]
		 */	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,10);
		driver.manage().window().maximize();
		driver.get("C:\\Users\\skotapat\\eclipse-workspace2\\firstproject\\src\\main\\resources\\new.html");	
		System.out.println(driver.getTitle());
		System.out.println(driver.findElement(By.cssSelector("tr:nth-child(1)>td:nth-child(1)")).getText());
		WebElement z=driver.findElement(By.xpath("/html/body/table/tbody/tr[1]/td[1]"));
	
		System.out.println(z.getTagName());
      System.out.println(z.getText());
      WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[contains(text(),'123')]")));
      System.out.println(element.getText());
      
     
		driver.quit();
	}

}
