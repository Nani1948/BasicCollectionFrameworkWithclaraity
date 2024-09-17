package playwrightframework.com.salesforce.qa.pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class LoginPage {

	
	  private Page page;


	    // Locators
	    private Locator usernameInput;
	    private Locator passwordInput;
	    private Locator loginButton;

	    // Constructor
	    public LoginPage(Page page) {
	        this.page = page;
	        // Initialize locators
	        this.usernameInput = page.locator("input#username");
	        this.passwordInput = page.locator("input#password");
	        this.loginButton = page.locator("input#Login");
	    }

	    // Getters and Setters for locators

	    public Locator getUsernameInput() {
	        return usernameInput;
	    }

	   

	    public Locator getPasswordInput() {
	        return passwordInput;
	    }

	   

	    public Locator getLoginButton() {
	        return loginButton;
	    }

	   

	    public void setUsernameInput(Locator usernameInput) {
	        this.usernameInput = usernameInput;
	    }
	    public void setPasswordInput(Locator passwordInput) {
	        this.passwordInput = passwordInput;
	    }
	    public void setLoginButton(Locator loginButton) {
	        this.loginButton = loginButton;
	    }
	    

	    // Page actions
	    public void enterUsername(String username) {
	        getUsernameInput().fill(username);
	    }

	    public void enterPassword(String password) {
	        getPasswordInput().fill(password);
	    }
	    public void clearPassWord(String empty) {
	    	getPasswordInput().fill(empty);
	    }
	    public HomePage clickLoginButton() {
	        getLoginButton().click();
	        return new HomePage(page);  // Navigate to HomePage after login
	    }

}
