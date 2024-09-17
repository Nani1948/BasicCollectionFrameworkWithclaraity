package playwrightframework;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class HowtoDifferentTypeOfCloseBrowser {

	public static void main(String[] args) {
		Playwright playwright = Playwright.create();
            // Launch the browser
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
            
            // Create two browser contexts
            BrowserContext context1 = browser.newContext();
            BrowserContext context2 = browser.newContext();
            
            // Open a page in the first context
            Page page1 = context1.newPage();
            page1.navigate("https://example.com");

            // Open a page in the second context
            Page page2 = context2.newPage();
            page2.navigate("https://example.org");
            
            // Perform actions
            System.out.println("Context 1 title: " + page1.title());
            System.out.println("Context 2 title: " + page2.title());
            
            // Close the first context
            context1.close();
            
            // Close the second context
            context2.close();
            
            // Finally, close the browser
            browser.close();
        }
	}


