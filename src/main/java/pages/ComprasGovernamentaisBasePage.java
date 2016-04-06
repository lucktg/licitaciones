package pages;

import org.openqa.selenium.WebDriver;

/**
 * Created by vtorres on 5/04/16.
 */
public class ComprasGovernamentaisBasePage {

    private String _baseURL;

    private WebDriver _webDriver;

    private ComprasGovernamentaisPageFactory _pageFactory;

    public ComprasGovernamentaisBasePage(WebDriver webDriver, ComprasGovernamentaisPageFactory pageFactory) {
        _webDriver = webDriver;
        _pageFactory = pageFactory;
    }

    public ComprasGovernamentaisMainPage goToMain() {
        return withPage().comprasGovernamentaisMainPage(_webDriver, _pageFactory);
    }

    protected ComprasGovernamentaisPageFactory withPage() {
        return _pageFactory;
    }
}
