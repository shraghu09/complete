package test_scripts;

import org.testng.annotations.Test;

import generic.Basetest;
import page.Welcomepage;

public class Login_Tc1  extends Basetest{
	
	@Test
	public void runapp() 
	{
		
		Welcomepage wl=new Welcomepage(driver);
		wl.clickuser("rajmohan");
		wl.clickpwd("Raj@123");
		wl.clickbutton();
	}

}
