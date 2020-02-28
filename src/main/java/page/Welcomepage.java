package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class Welcomepage  extends BasePage{
	
	@FindBy(name="username")
	private WebElement usname;
	
	
	@FindBy(name="password")
	private WebElement pwd;
	
	
	@FindBy(xpath="//input[@class='btn btn-small']")
	private WebElement button;
	
	
	public Welcomepage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickuser(String un)
	{
		usname.sendKeys(un);
	}
	
	public void clickpwd(String pw)
	{
		pwd.sendKeys(pw);
	}
	public void clickbutton()
	{
		button.click();
	}

}
