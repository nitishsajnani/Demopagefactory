/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import Config.twitter.Configuration;

/**
 * @author Tester
 *
 */
public class EditProfileInfo {

	WebDriver driver;
	
	public EditProfileInfo(WebDriver driver)
	{
		
		this.driver= driver;
	}
	
	
	
	@FindBy(xpath=Configuration.picIcon)
	
	public WebElement picIcon;
	
	@FindBy(xpath=Configuration.changePic)
	
	public WebElement changePic;
	
	@FindBy(xpath=Configuration.uploadPic)
	public WebElement UploadPic;
	
	
	public void changPic()
	
	
	
	{
		
		picIcon.click();
		changePic.click();
		changePic.sendKeys("‪C:\\Users\\Tester\\Downloads\\ux96f2cf_400x400.jpg");
		UploadPic.click();
		
		
	}
	
	public void changetitle()
	{
		
		
		
	}
}
