/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Config.twitter.Configuration;

/**
 * @author Tester
 *
 */
public class MyProfilePage {
	
	WebDriver driver;
	public MyProfilePage(WebDriver driver)
	{
		this.driver=driver;
		
		
		
	}
	@FindBy(xpath=Configuration.Edit)
	
	public WebElement Edit;
	
	
public EditProfileInfo EditProfile()
{
	Edit.click();
	
	return PageFactory.initElements(driver,EditProfileInfo.class);
}
}
