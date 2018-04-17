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
public class TweeterPage {
WebDriver driver;

public TweeterPage(WebDriver driver)

{this.driver= driver;
	}
	@FindBy(xpath=".//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input")
	public WebElement username;



@FindBy(how= How.XPATH,using=".//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input" )
public WebElement password;

@FindBy(how=How.XPATH,using=".//*[@id='page-container']/div/div[1]/form/div[2]/button")

public WebElement login;
public TwitLanding dologin(String user, String pswd)
{
	username.sendKeys(user);
	password.sendKeys(pswd);
	login.click();
	return PageFactory.initElements(driver, TwitLanding.class);
}
}
