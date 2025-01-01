package org.report;

import java.io.File;
import java.util.LinkedList;
import java.util.List;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class ReportingClass {
	
	
	public static  void generatereport(String son) {
		
		File file = new File("C:\\Users\\pradhap\\eclipse-workspace\\NopCommerceCucumber");


		Configuration con = new Configuration(file, "Nop webpage login page");
		
		con.addClassifications("user id ", "1010");
		con.addClassifications("userstory", "3600");
		con.addClassifications("platform", "Eclispe-photon");
		con.addClassifications("Functionalname", "nop functional test");
		
		List<String> li = new LinkedList<String>();
		
		li.add(son);
		
		ReportBuilder report = new ReportBuilder(li, con);
		
		report.generateReports();
		
		
		

	}
	
	
	
	
	
	
	
	
	
	
	
	

}
