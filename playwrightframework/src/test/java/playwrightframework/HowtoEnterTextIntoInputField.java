package playwrightframework;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HowtoEnterTextIntoInputField {

	public static void main(String[] args) {
	Playwright playwright=Playwright.create();
	Browser browser=playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
    BrowserContext context=browser.newContext();
    Page page=context.newPage();
    page.fill(, null);
    browser.close();
    

	}

}
