package day1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class signupyahoo {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://login.yahoo.com/account/create?.src=ym&pspid=1197806870&activity=header-signup&.lang=en-IN&.intl=in&.done=https%3A%2F%2Fin.mail.yahoo.com%2Fd&authMechanism=primary&specId=yidReg");
		TakesScreenshot ts=(TakesScreenshot)driver;
		File screenshotFile1 = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(screenshotFile1, new File("yahoo.png"));
		System.out.println("Captured screenshot :");
		driver.findElement(By.id("usernamereg-firstName")).sendKeys("Sreevalli");
		driver.findElement(By.id("usernamereg-lastName")).sendKeys("Samanthapudi");
		driver.findElement(By.name("yid")).sendKeys("sreevalli.samanthapudi");
		driver.findElement(By.id("desktop-suggestions-container")).click();//it doesnt taken check while running
		File screenshotFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.moveFile(screenshotFile, new File("yahoo1.png"));
		System.out.println("Captured screenshot :");
		driver.quit();
	}

}
