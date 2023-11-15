package demo.main.page;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import demo.main.util.PageObjectUtil;
import demo.main.xpath.XPathHomePage;

public class AppHomepage extends PageObject {
		
	// xpath
	protected XPathHomePage xpathHomePage = XPathHomePage.getInstancia();

	// util
	protected PageObjectUtil pageObjectUtil = PageObjectUtil.getInstancia();

	public void inicializar(String url) {
		getDriver().navigate().to(url);
		getDriver().manage().deleteAllCookies();
		getDriver().manage().window().maximize();		
	}
	

}
