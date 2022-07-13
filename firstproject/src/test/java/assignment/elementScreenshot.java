package assignment;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class elementScreenshot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = (WebDriver) new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://app.hubspot.com/login");

		WebElement email = driver.findElement(By.id("username"));
		WebElement password = driver.findElement(By.id("password"));
		WebElement loginButton = driver.findElement(By.id("loginBtn"));
		WebElement forgotPwd = driver.findElement(By.linkText("Forgot my password"));
		email.sendKeys("naveen@gmail.com");
		password.sendKeys("Test@123");
		takeElementScreenshot(email, "emailElement");
		takeElementScreenshot(password, "passwordElement");
		takeElementScreenshot(loginButton, "loginButtonElement");
		takeElementScreenshot(forgotPwd, "forgotPwdLink");

		driver.quit();
	}
		//take screenshot using getScreenshotAs() method.
		public static void takeElementScreenshot(WebElement element, String fileName) {

		File srcFile = element.getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(srcFile, new File("scrren.png"));
		} catch (IOException e) {
		e.printStackTrace();
		}

		
	}

}
