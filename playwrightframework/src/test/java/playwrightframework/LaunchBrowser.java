package playwrightframework;

import java.time.Duration;

import org.testng.Assert;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;
import com.microsoft.playwright.options.LoadState;

public class LaunchBrowser {

	public static void main(String[] args) {
/*Purpose: It initializes the Playwright engine, allowing you to interact with different browser instances.
Functionality: Once created, the Playwright instance gives you access to browser types like Chromium, Firefox, and WebKit, 
which you can use to launch a browser, open pages, and perform actions on web elements.
*/   // Initialize Playwright
		//Initializes Playwright. After this, you can interact with different browsers using methods like chromium(), firefox(), or webkit().
	Playwright playwright=Playwright.create();
	  // Launch a Chromium browser (can use .firefox() or .webkit() too)
	//Launches an instance of the Chromium browser (with headless mode set to false so the browser window is visible).
	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    // Create a new browser context (isolated environment)
	//Creates a new isolated browser context. This helps to run tests in parallel without opening multiple browser windows. 
	//Each context behaves like a separate browser session.
    BrowserContext context = browser.newContext();
	//Opens a new tab (or page) in the browser.
    Page page=context.newPage();
    // // Navigate to a URL
    page.navigate("https://login.salesforce.com");
  
    // Print the title of the page
    System.out.println("Page Title: " + page.title());
    //Closes the browser instance once the actions are completed.
  Locator enterUserName=page.locator("input#username");
  enterUserName.fill("nani1847@gmail.com");
  Locator enterPassword=page.locator("input#password");
  enterPassword.fill("Sweety1948@");
  Locator login=page.locator("input#Login");
  login.click();
  //page.waitForLoadState();
  // Wait for the page to load after clicking the login button
 // page.waitForLoadState(LoadState.LOAD);
  double timeout=10000;
  page.waitForLoadState(LoadState.NETWORKIDLE, new Page.WaitForLoadStateOptions().setTimeout(timeout));
  String exceptedTitleOfPage=page.title();
  System.out.println(exceptedTitleOfPage);
  Assert.assertEquals(exceptedTitleOfPage, "Home Page ~ Salesforce - Developer Edition");
    

	}

}
