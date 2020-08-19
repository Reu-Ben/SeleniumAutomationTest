package testPages.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sauceDemoPom.Driver;

public class Costo {
	
	private WebElement element = null;
	private Driver gDriver= Driver.getInstance();
	private WebDriver driver;
	
	public Costo() {
		driver = gDriver.getDriver();
	}
	
	public WebElement name() {
		element = driver.findElement(By.xpath ("//div[@class=\"inventory_item_name\"]"));
		return element;
	}
	
	public WebElement price() {
		element = driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"]" ));
		return element;
	}
	
	
	
	
}
