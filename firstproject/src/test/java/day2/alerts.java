package day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class alerts {
	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Alerts.html");
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		Thread.sleep(1000);
		Alert al=driver.switchTo().alert();
		String almsg=al.getText();
		System.out.println(almsg);
		al.accept();
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println(al.getText());
		al.dismiss();
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		System.out.println(al.getText());
		al.accept();
		Thread.sleep(1000);
		driver.quit();
	}

}
