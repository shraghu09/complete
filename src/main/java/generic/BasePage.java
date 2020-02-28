package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BasePage {
	
	public WebDriver driver;
	
	public BasePage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void verifytitle(String etitle)
	{
		
	
	WebDriverWait wait=new WebDriverWait(driver, 30);
	try{
	wait.until(ExpectedConditions.titleContains(etitle));
	Reporter.log("pass: title is matching");
	
	}
	catch(Exception e)
	{
		Reporter.log("Fail: title is not matching");
		Assert.fail();
	}

}
}