/**
 * 
 */
package Config.twitter;

/**
 * @author Tester
 *
 */
public class Configuration {

	
	//testSite
	public static final String testsite= "https://twitter.com/login";
	
	//TwitLandingPage	
public static final String	profile=".//*[@id='page-container']/div[1]/div[1]/div/div[1]/div/a";
public static final String			tweet=".//*[@id='global-new-tweet-button']";
public static final String		Followers=".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[3]/a/span[1]";
public static final String		Following=".//*[@id='page-container']/div[1]/div[1]/div/div[2]/ul/li[2]/a/span[1]";

//MyProfile
public static final String Edit=".//*[@id='page-container']/div[3]/div/div[2]/div[2]/div/div[2]/div/div/ul/li[8]/div/button";


//EditProfileInfo
public static final String	picIcon=".//*[@id='page-container']/div[3]/div/div[1]/div[4]/div[1]/div[2]/div[5]/button";
public static final String	changePic=".//*[@id='photo-choose-existing']/div/div/label/input";
public static final String	uploadPic=".//*[@id='profile_image_upload_dialog-dialog']/div[2]/div[3]/button[4]";



//TweeterPage
public static final String	username=".//*[@id='page-container']/div/div[1]/form/fieldset/div[1]/input";
public static final String	password=".//*[@id='page-container']/div/div[1]/form/fieldset/div[2]/input";
public static final String	login=".//*[@id='page-container']/div/div[1]/form/div[2]/button";
}
