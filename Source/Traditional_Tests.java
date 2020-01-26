package Source;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Traditional_Tests {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\TARANVIR SINGH SAINI\\git\\Applitools_Visual_AI_Hack\\Drivers\\geckodriver.exe");
	/*	ChromeOptions options = new ChromeOptions();
		options.addArguments("disable-extensions");
		options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--headless");*/

		WebDriver driver= new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//div[@class='pR49Ae gsfi']")).sendKeys("Taranvir Singh Saini");
		Thread.sleep(3000);
		driver.findElement(By.className("LC20lb")).click();
		driver.close();
		
			
		

	}

}
