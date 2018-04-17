/**
 * 
 */
package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * @author Tester
 *
 */
public class Testtwit {
public static void main(String ap[]) throws InterruptedException
{System.setProperty("webdriver.chrome.driver","C:\\Users\\Tester\\Desktop\\Softwares\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	driver.get("https://twitter.com/login");
TweeterPage lp= PageFactory.initElements(driver, TweeterPage.class);
TwitLanding Landing=lp.dologin("Nitish.sajnani18@gmail.com", "Nitish_9899");

MyProfilePage pr=Landing.GotoProfile();
 EditProfileInfo ep=pr.EditProfile();

ep.changPic();


}
}
