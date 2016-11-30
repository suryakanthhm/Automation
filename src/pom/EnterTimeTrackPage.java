package pom;

import org.testng.Assert;
import org.testng.asserts.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterTimeTrackPage extends BasePage {
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	@FindBy(xpath="(//div[@class='popup_menu_arrow'])[3]")
	private WebElement help;
	
	@FindBy(linkText="About your actiTIME")
	private WebElement aboutActiTime;
	
	@FindBy(xpath="//span[@class='productVersion']")
	private WebElement productVersion;
	
	@FindBy(xpath="//img[@title='Close']")
	private WebElement closeButton;
	
	public EnterTimeTrackPage(WebDriver driver)
	{
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void clickLogoutLink()
	{
		logoutLink.click();
	}
	
	public void clickHelp()
	{
		help.click();
	}
	
	public void clickAboutActiTime()
	{
		aboutActiTime.click();
	}
	
	public void verifyProductVersion(String eVersion)
	{
		String aVersion = productVersion.getText();
		Assert.assertEquals(eVersion, aVersion);
	}
	
	public void clickCloseButton()
	{
		closeButton.click();
	}

}
