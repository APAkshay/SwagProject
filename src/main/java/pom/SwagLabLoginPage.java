package pom;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SwagLabLoginPage {
	@FindBy(xpath = "//input[@id='user-name']") private WebElement userId;
	@FindBy(xpath = "//input[@id='password']") private WebElement pass;
	@FindBy(xpath = "//input[@id='login-button']") private WebElement logIn; 
	@FindBy(xpath = "//h3[@data-test='error']") private WebElement errorMSG;
	@FindBy(xpath = "//h4[normalize-space()='Accepted usernames are:']") private WebElement Data;

	public SwagLabLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	} 
	
	public void enterUserId(String UserName) throws EncryptedDocumentException, IOException {
		userId.sendKeys(UserName);
		}
	public void enterPass(String Password) throws EncryptedDocumentException, IOException
	{ 
		pass.sendKeys(Password); 
	}
	public void clickLogin()
	{
		logIn.click();
	} 
}
