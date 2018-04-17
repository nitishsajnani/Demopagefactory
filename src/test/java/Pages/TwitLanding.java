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
public class TwitLanding {
	
	
	WebDriver driver;
	
	public TwitLanding(WebDriver driver)
	
	{
		
		
		this.driver= driver;
	}
@FindBy(xpath=Configuration.profile)
public WebElement profile;
@FindBy(xpath=Configuration.tweet)
public WebElement tweet;

@FindBy(xpath=Configuration.Followers)
public WebElement Followers;

@FindBy(xpath=Configuration.Following)
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