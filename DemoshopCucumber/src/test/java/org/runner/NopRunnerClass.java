package org.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.report.ReportingClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.CucumberOptions.SnippetType;
import net.masterthought.cucumber.ReportBuilder;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\pradhap\\eclipse-workspace\\NopCommerceCucumber\\src\\test\\resources\\Feature",glue="org.step"
,monochrome=true,
dryRun=false,
snippets=SnippetType.CAMELCASE,
plugin ={"html:target\\HTML.html","junit:target\\xmlReport.xml",
		"json:target\\Report\\jsonReport.json"})

public class NopRunnerClass {
	
	@AfterClass
	public static void sample() {
		
		ReportingClass.generatereport("target\\Report\\jsonReport.json");

	}
	
	
	
	

}
