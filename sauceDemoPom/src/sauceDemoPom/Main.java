package sauceDemoPom;

import testPages.Pom.Cart;
import testPages.Pom.CheckOut;
import testPages.Pom.Costo;
import testPages.Pom.Login;

public class Main {
	
	private static Login login = new Login();
	private static Cart item = new Cart();
	private static Costo cost = new Costo();
	private static CheckOut checkout = new CheckOut();
	private static String username ="standard_user";
	private static String password = "secret_sauce";
	
	public static void main(String [] args) {
		
		try {	
			login(username, password);
			addToCart();
			checkOut();
			terminate();
			
			System.out.println("Successfully purchased!!!!!!!!!!!!!!!");
		}catch(Exception e) {
			System.out.println(e);
		}
	
	}
	
	public static void login(String username, String password) throws Exception{
		login.Username().sendKeys(username);
		Thread.sleep(2000);
		login.Password().sendKeys(password);
		Thread.sleep(2000);
		login.loginButton().click();
		
	}
	
	public static void checkOut() throws Exception {
		showCost();
		checkout.CheckoutButton().click();
		checkout.Name().sendKeys("Reuben mensah");
		checkout.surname().sendKeys("Mensah ");
		checkout.zip().sendKeys("42013");
		Thread.sleep(2000);
		checkout.Contiue().click();
	}
	
	public static void addToCart() throws Exception{
		item.addTOcart().click();
		item.cartButton().click();
		Thread.sleep(2000);
	
	}
	public static void showCost() {
		System.out.println("the name of the item is: " + cost.name().getText());
		System.out.println("the price of the item is: " + cost.price().getText());
		
	}
	public static void terminate() {
		checkout.proceed().click();
	}
}
