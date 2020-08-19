package testPages.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sauceDemoPom.Driver;

public class CheckOut {
	private WebElement element= null;
	private WebDriver driver;
	private Driver gDriver;
	
	public CheckOut() {
		this.gDriver = Driver.getInstance();
		driver = gDriver.getDriver();
	}
	
	public WebElement CheckoutButton() {
		element = driver.findElement(By.xpath("//a[@class =\"btn_action checkout_button\"]"));
		//element = driver.findElement(By.linkText("CHECKOUT"));
		return element;
	}	
	
	public WebElement Name() {
		element = driver.findElement(By.id("first-name"));
		return element;
	}
	
	public WebElement surname() {
		element = driver.findElement(By.id("last-name"));
		return element;
	}
	
	public WebElement zip() {
		element = driver.findElement(By.id("postal-code"));
		return element;
	}
	
	public WebElement Contiue() {
		element = driver.findElement(By.xpath("//input[@class=\"btn_primary cart_button\"]"));
		return element;
	}
	
	public WebElement proceed() {
		element = driver.findElement(By.xpath("//a[@class=\"btn_action cart_button\"]"));
		return element;
	}
	
	
}
