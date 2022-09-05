package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	WebDriver driver;
	
	@FindBy(id="username")
	private WebElement username;
	@FindBy(name ="pwd")
	private WebElement password;
	@FindBy(xpath ="//div[text()='Login ']")
	private WebElement loginBtn;
	
	public Login(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public WebElement setUserName() {
		return username;
	}
	public WebElement setPassword() {
		return password;
	}
	public WebElement LoginBtn() {
		return 	loginBtn;
	}
	

}
