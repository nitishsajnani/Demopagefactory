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
public class TwitLanding {
	
	
	WebDriver driver;
	
	public TwitLanding(WebDriver driver)
	
	{
		
		
		this.driver= driver;
	}
@FindBy(how= How.XPATH, using=".//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a")
public WebElement profile;
@FindBy(how= How.XPATH, using=".//*[@id='global-new-tweet-button']")
public WebElement tweet;

@FindBy(how= How.XPATH, using=".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[3]/a/span[1]")
public WebElement Followers;

@FindBy(how= How.XPATH, using=".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[2]/a/span[1]")
public WebElement Following;
public MyProfilePage GotoProfile()

{
	

profile.click();
return PageFactory.initElements(driver, MyProfilePage.class);
}


public void GototTweet()
{
	

tweet.click();


		}


public void GotoFollowers()

{
	

Followers.click();}

public void GotoFollowing()

{
	

Following.click();}
}