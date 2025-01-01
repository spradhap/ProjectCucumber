package org.step;

import java.io.IOException;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.pom.Pom;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class HooksClass extends BaseClass {
	

	@Before
	public  void before() {
		
		try {
			
			getDriver(excelRead(0, 0));

			getUrl(excelRead(0, 2));
			
			System.out.println("user sholud lanul the url ");
			
			
			
			 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

	
	@After
	public void after() {
		
		try {
			screenCapture("order print ");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		

	}
}
