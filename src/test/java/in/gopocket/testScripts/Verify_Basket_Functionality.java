package in.gopocket.testScripts;

import org.testng.annotations.Test;

import in.gopocket.generic.BaseClass;
import in.gopocket.pom.Home;
import in.gopocket.pom.Lets_Get_Started;
import in.gopocket.pom.Orders;

public class Verify_Basket_Functionality extends BaseClass {

	@Test
	public void create_Basket()
	{
		Lets_Get_Started lg= new Lets_Get_Started(driver);
		Home h= new Home(driver);
		Orders o= new Orders();
	}
}
