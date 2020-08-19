package sauceDemoPom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver {
	private static Driver driver=null;
	private static WebDriver webDriver = null;
	private String path="C:\\Users\\Kali\\Desktop\\Selenium\\driver 84\\chromedriver.exe";
	
	private Driver() {
		
	}

	public static Driver getInstance() {
		if(driver == null) {
			driver = new Driver();
		}
		return driver;
	}
	
	public WebDriver getDriver () {
		System.setProperty("webdriver.chrome.driver", path);
		if(webDriver == null) {
			webDriver = new ChromeDriver();
		}
		return webDriver;
	}
}
