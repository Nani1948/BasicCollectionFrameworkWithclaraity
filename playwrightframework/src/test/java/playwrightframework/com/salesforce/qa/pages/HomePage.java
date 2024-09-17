package playwrightframework.com.salesforce.qa.pages;

import java.time.Duration;

import com.microsoft.playwright.Frame.WaitForFunctionOptions;
import com.microsoft.playwright.options.LoadState;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

import playwrightframework.com.salesforce.qa.test.basetest.BaseTest;
import playwrightframework.com.salesforce.qa.utils.AutoWaits;

public class HomePage  {
    private Page page;
    AutoWaits auto=new AutoWaits();
    protected Locator errorMessage;
	public HomePage(Page page) {
		 this.page = page;
		 String errorSelectorMes="div#error";
		 this.errorMessage=page.locator(errorSelectorMes);
	}

	public String getHomePageTitle() {
		double timeout=10000;
		page.waitForLoadState(LoadState.NETWORKIDLE, new Page.WaitForLoadStateOptions().setTimeout(timeout));
		return page.title();
	}
	// Method to wait for the page to load and then capture the title
	 // Method to wait for the page to load and then wait for the title to match
    /*public boolean waitForTitle(String expectedTitle, int timeout) {
        try {
            // Wait for the page to fully load
            page.waitForLoadState(Page.LoadState.LOAD, new Page.WaitForLoadStateOptions().setTimeout(Duration.ofMillis(timeout)));
            // Wait for the title to match the expected value
            page.waitForFunction(
                "document.title === arguments[0]"
            );
            return true;
        } catch (Exception e) {
            return false;
        }
    }*/
	public String getErrorMessage() {
	 //   if(auto.isElementVisible("div#error", 12)) {
		page.waitForSelector("div#error");
	    	return errorMessage.textContent();
	  //  }
	
	   // else {
           // return "Error message not found.";
       // }*/
	}
	}


