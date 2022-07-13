package day2;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import ru.yandex.qatools.ashot.AShot;

import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
//from the link https://www.softwaretestingmaterial.com/how-to-capture-full-page-screenshot-using-selenium-webdriver/

public class fullScreenshot {
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver97.exe");
		driver = new ChromeDriver();
		driver.get("https://www.softwaretestingmaterial.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		Screenshot fpScreenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000))
				.takeScreenshot(driver);
		ImageIO.write(fpScreenshot.getImage(), "PNG", new File("FullPageScreenshot.png"));
		Thread.sleep(1000);
		driver.quit();

	}

}
