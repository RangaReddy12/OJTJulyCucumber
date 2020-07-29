package testRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"FeatureFiles"},tags={"@scenariowithDatatable"},glue={"stepDefinations"},
plugin = {"com.cucumber.listener.ExtentCucumberFormatter:Reports/datatable.html","pretty", 
"html:target/cucumber-reports"},monochrome=true)
public class Runner1 {

}
