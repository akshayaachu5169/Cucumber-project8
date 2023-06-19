package initializers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Intializer {

	public static WebDriver openbrowser(WebDriver wd, String browser) {
		if(browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();
			return wd = new ChromeDriver();

		}else if(browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			return wd= new FirefoxDriver();
		}
		return null;
		
	
	}
	
	
}
