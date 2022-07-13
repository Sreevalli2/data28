package day2_2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class datatable {

	public static void main(String[] args) {
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//waits for every search 30 sec
	    driver.get("https://money.rediff.com/gainers");
	    //list of all company names cuurent prices
	    List<WebElement> companies=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]"));
	    List<WebElement> current=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[4]"));
	    System.out.println(companies.size());
	    System.out.println(current.size());
	    System.out.println("the companies list         the current price list");
	    System.out.println("-------------------         ---------------------");
	    //companies.forEach(x->System.out.println(x.getText()));	  
	    //current.forEach(x->System.out.println(x.getText()));
	    for(int i=0;i<companies.size();i++) {
	    	System.out.println(companies.get(i).getText()+"          "+current.get(i).getText());
	    }
	    WebElement z=driver.findElement(By.xpath("//table[@class='dataTable']/tbody/tr[1]/td[4]"));
	    System.out.println(z.getText());

	}

}
