/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

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
	
	
	
	@FindBy(how= How.XPATH,using=".//*[@id='page-container']/div[3]/div/div[1]/div[4]/div[1]/div[2]/div[5]/button")
	
	public WebElement picIcon;
	
	@FindBy(how=How.XPATH, using=".//*[@id='photo-choose-existing']/div/div/label/input")
	
	public WebElement changePic;
	
	@FindBy(how=How.XPATH, using=".//*[@id='profile_image_upload_dialog-dialog']/div[2]/div[3]/button[4]")
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
