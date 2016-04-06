package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by vtorres on 5/04/16.
 */
public class ComprasGovernamentaisPageFactory {
    public ComprasGovernamentaisMainPage comprasGovernamentaisMainPage(WebDriver webDriver, ComprasGovernamentaisPageFactory pageFactory) {
        return new ComprasGovernamentaisMainPage(webDriver, pageFactory);
    }
}
