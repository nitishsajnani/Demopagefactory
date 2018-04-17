/**
 * 
 */
package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

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
	@FindBy(how= How.XPATH,using=".//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[8]/div/button")
	
	public WebElement Edit;
	
	
public EditProfileInfo EditProfile()
{
	Edit.click();
	
	return PageFactory.initElements(driver,EditProfileInfo.class);
}
}
