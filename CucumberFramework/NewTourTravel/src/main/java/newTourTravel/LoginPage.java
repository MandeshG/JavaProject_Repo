package newTourTravel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	@FindBy(name="userName")
	 WebElement user;
	
	@FindBy(name= "password")
	WebElement Pass;
	
	@FindBy(name= "login")
	WebElement Submit;
	
	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
	public void Login_Application(){
		
		if(user.isDisplayed()){
			user.clear();
			user.sendKeys("mercury");		
		}
		Pass.sendKeys("mercury");
		Submit.click();
	}
	

}
