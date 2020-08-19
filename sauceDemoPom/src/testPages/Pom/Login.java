package testPages.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sauceDemoPom.Driver;

public class Login {
	
	private String url ="https://www.saucedemo.com/";
	private WebElement element;
	private static WebDriver driver;
	private Driver webDriver = Driver.getInstance();
	
	public Login() {
		System.out.println("Instantiating the driver");
		try {
			driver = webDriver.getDriver();
			System.out.println("Successfully Started Driver");
			driver.get(url);
			driver.manage().window().maximize();
		}catch(Exception e) {
			System.out.println("Failed to start driver");
			System.out.println(e);
		}
	}
	
	public WebElement Username() {
		element = driver.findElement(By.id("user-name"));
		return element;
	}
	
	public WebElement Password() {
		element = driver.findElement(By.id("password"));
		return element;
	}
	
	public WebElement loginButton() {
		element = driver.findElement(By.id("login-button"));
		return element;
	}
	
	public void quit() {
		driver.close();
	}
	
}
