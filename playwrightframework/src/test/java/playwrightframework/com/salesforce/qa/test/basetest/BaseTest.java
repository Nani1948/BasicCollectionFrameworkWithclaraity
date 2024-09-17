package playwrightframework.com.salesforce.qa.test.basetest;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.microsoft.playwright.Browser;
import com.microsoft.playwright.BrowserContext;
import com.microsoft.playwright.BrowserType;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.Playwright;

public class BaseTest {
	    protected Playwright playwright;
	    protected Browser browser;
	    protected BrowserContext context;
	    protected Page page;
	    @BeforeMethod
	    public void setUp() {
	        playwright = Playwright.create();
	        browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));
	        context = browser.newContext();
	        page = context.newPage();
	    }
	    @AfterMethod
	    public void tearDown() {
	        browser.close();
	        playwright.close();
	    }
}
