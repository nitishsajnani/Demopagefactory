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
public class TweeterPage {
WebDriver driver;

public TweeterPage(WebDriver driver)

{this.driver= driver;
	}
	@FindBy(xpath=Configuration.username)
	public WebElement username;



@FindBy(xpath=Configuration.password )
public WebElement password;

@FindBy(xpath=Configuration.login)

public WebElement login;
public TwitLanding dologin(String user, String pswd)
{
	username.sendKeys(user);
	password.sendKeys(pswd);
	login.click();
	return PageFactory.initElements(driver, TwitLanding.class);
}
}
