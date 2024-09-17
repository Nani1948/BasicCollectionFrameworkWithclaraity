package playwrightframework.com.salesforce.qa.utils;




import java.time.Duration;


import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
//import com.microsoft.playwright.WaitForFunctionOptions;
import com.microsoft.playwright.options.WaitForSelectorState;

public class AutoWaits {
	  private Page page;
	// Method to check if an element is visible with auto-wait
    public boolean isElementVisible(String selector, int timeout) {
        try {
            page.waitForSelector(selector, new Page.WaitForSelectorOptions()
                    .setState(WaitForSelectorState.VISIBLE)
                    .setTimeout(timeout));
            return true;
        } catch (Exception e) {
            // If the element is not found within the timeout, return false
            return false;
        }
    }
 // Method to wait for the title to match a specific value
   /* public boolean waitForTitle(String expectedTitle, int timeout) {
        try {
            page.waitForFunction(
                "document.title === arguments[0]",
                new WaitForFunctionOptions().setTimeout(Duration.ofMillis(timeout)),
                expectedTitle
            );
            return true;
        } catch (Exception e) {
            return false;
        }*/
    }

