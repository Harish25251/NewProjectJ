package org.global;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBys({ @FindBy(id = "email"), @FindBy(xpath = "//input[@type='text']") })
	private WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindAll({@FindBy(how = How.ID, using = "pass"),@FindBy(how = How.NAME, using = "password")})
	private WebElement password;

	public WebElement getPassword() {
		return password;
	}
	@FindBy(how=How.NAME,using="login")
	private WebElement login;
	
	public WebElement getLogin() {
		return login;
	}

}


