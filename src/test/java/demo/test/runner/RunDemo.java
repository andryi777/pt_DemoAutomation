package demo.test.runner;

import org.junit.runner.RunWith;

import demo.test.util.ExcelUtilPropio;
import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.thucydides.core.environment.SystemEnvironmentVariables;
import net.thucydides.core.util.EnvironmentVariables;

@RunWith(RunPersonalizar.class)

//@CucumberOptions(features = { "src/test/resources/features/" }, tags = "@GetPreciosUrbania", glue = { "demo" }, plugin = {
//		"pretty", "html:target/serenity-reports/serenity-html-report",
//		"json:target/serenity-reports/cucumber_report.json", "rerun:target/serenity-reports/rerun.txt" })

public class RunDemo {

	@RunBefore
	public static void previo() {
//		ExcelUtilPropio.getInstancia().escribirFeatures();
		System.out.println("ss");
		
	}
}
