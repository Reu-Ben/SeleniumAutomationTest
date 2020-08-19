package testPages.Pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import sauceDemoPom.Driver;

public class Cart {
	
	private WebElement element= null;
	private WebDriver driver;
	private Driver gDriver = Driver.getInstance();
	
	public Cart() {
		
		driver = gDriver.getDriver();
	}
	
	public WebElement addTOcart() {
		element =  driver.findElement(By.xpath("//button[@class=\"btn_primary btn_inventory\"]"));
		return element;
	}
	
	public WebElement cartButton(){
		element = driver.findElement(By.xpath("//a[@class =\"shopping_cart_link fa-layers fa-fw\"]"));
		return element;
	}
	
	
	
	
}
