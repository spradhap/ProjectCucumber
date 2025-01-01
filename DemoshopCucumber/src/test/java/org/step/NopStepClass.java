package org.step;

import org.global.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.pom.Pom;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class NopStepClass extends BaseClass {

	public static Pom page;

	@Given("user should click the login button")
	public void userShouldClickTheLoginButton() {

		try {
			page = new Pom();
			threadsleep(2000);
			WebElement getlogin1 = page.getlogin1();
			getlogin1.click();

			System.out.println("user should click the login button");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("User should enter the emailname and password")
	public void userShouldEnterTheEmailnameAndPassword() {
		try {

			WebElement getemail1 = page.getemail1();
			getemail1.sendKeys(excelRead(0, 3));

			WebElement getpassword1 = page.getpassword1();

			getpassword1.sendKeys(excelRead(0, 4));

			WebElement getloginclick = page.getloginclick();
			getloginclick.click();

			System.out.println("User should enter the emailname and password");

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@When("user shold enter and seach the product")
	public void userSholdEnterAndSeachTheProduct() {
		try {
			threadsleep(2000);
			WebElement getseaching = page.getseaching();
			getseaching.sendKeys(excelRead(0, 5), Keys.ENTER);

			threadsleep(2000);

			WebElement getaddcart11 = page.getaddcart11();
			getaddcart11.click();

			threadsleep(2000);

			WebElement getlength = page.getlength();
			getlength.sendKeys(excelRead(0, 6));

			threadsleep(2000);

			WebElement getaddcart22 = page.getaddcart22();
			getaddcart22.click();

			System.out.println("user shold enter and seach the product");

		} catch (Exception e) {

			e.printStackTrace();

		}
	}

	@When("user should enter and shopping,iagree,checkout")
	public void userShouldEnterAndShoppingIagreeCheckout() {
		try {
			threadsleep(2000);
			WebElement getshopp = page.getshopp();
			getshopp.click();

			threadsleep(2000);
			WebElement getagree = page.getagree();
			getagree.click();

			threadsleep(2000);

			WebElement getcheckout1 = page.getcheckout1();
			getcheckout1.click();

			System.out.println("user should enter and shopping,iagree,checkout");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@When("user should enter and newaddress,firstnameaddr,lastnameaddr,emailaddr,countryaddr,cityaddr,address1,pincodeaddr,phoneaddr,continue1")
	public void userShouldEnterAndNewaddressFirstnameaddrLastnameaddrEmailaddrCountryaddrCityaddrAddress1PincodeaddrPhoneaddrContinue1() {
	   try {
		   threadsleep(2000);
		   
		   WebElement getnewaddress = page.getnewaddress();
		   getnewaddress.click();
		   
		   threadsleep(2000);
		   
		   WebElement getfristname = page.getfristname();
		   getfristname.clear();
		   getfristname.sendKeys(excelRead(0, 7));
		   
		   WebElement lastName = page.getLastName();
		   lastName.clear();
		   lastName.sendKeys(excelRead(0, 8));
		   
		   WebElement getemailaddress = page.getemailaddress();
		   getemailaddress.clear();
		   getemailaddress.sendKeys(excelRead(0, 3));
		   
		   
		   WebElement getcountryid = page.getcountryid();
		   getcountryid.sendKeys(excelRead(0, 10));
		   
		   WebElement city = page.getCity();
		   city.sendKeys(excelRead(0, 11));
		   
		   WebElement getaddress1 = page.getaddress1();
		   getaddress1.sendKeys(excelRead(0, 12));
		   
		   WebElement getpincode1 = page.getpincode1();
		   getpincode1.sendKeys(excelRead(0, 13));
		   
		   WebElement getphone = page.getphone();
		   getphone.sendKeys(excelRead(0, 14));
		   
		   threadsleep(2000);
		   
		   WebElement getcontinue1 = page.getcontinue1();
		   getcontinue1.click();
		   
		   
		   System.out.println("the address printed ");
		   
		   
		   
		   
		   
		   
		   
		   
		   
		
	} catch (Exception e) {

e.printStackTrace();
	}
	}
	
	@When("user should enter and ShippingAddress,continue2")
	public void userShouldEnterAndShippingAddressContinue2() {
	    try {
	    	threadsleep(2000);
	    	WebElement getcontinue2 = page.getcontinue2();
	    	getcontinue2.click();
	    	
	    	System.out.println("user should enter and ShippingAddress,continue2");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@When("user should enter and shippingmethod,countinue3,")
	public void userShouldEnterAndShippingmethodCountinue3() {

		try {
			threadsleep(2000);
			WebElement getshippingmethod = page.getshippingmethod();
			getshippingmethod.click();
			
			WebElement getcontinue3 = page.getcontinue3();
			getcontinue3.click();
			
			System.out.println("user should enter and shippingmethod,countinue3,");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	@When("user sholud enter and paymethod,countinue4")
	public void userSholudEnterAndPaymethodCountinue4() {
	   try {
		   threadsleep(2000);
		   WebElement getpaymethod = page.getpaymethod();
		   getpaymethod.click();
		   
		   WebElement getcontinue4 = page.getcontinue4();
		   getcontinue4.click();
		   
		   System.out.println("user sholud enter and paymethod,countinue4");
		
	} catch (Exception e) {
		e.printStackTrace();
	}
	}	
	
	@When("user should enter and Payment Information,continue5")
	public void userShouldEnterAndPaymentInformationContinue5() {
	    try {
	    	threadsleep(2000);
	    	
	    	WebElement getcontinue5 = page.getcontinue5();
	    	getcontinue5.click();
	    	
	    	System.out.println("user should enter and Payment Information,continue5");
	    	
	    	
			
		} catch (Exception e) {
		e.printStackTrace();	
		}
	}
	
	@When("user should enter and Confirm Order,coutinue6")
	public void userShouldEnterAndConfirmOrderCoutinue6() {
	   try {
		   
		   threadsleep(2000);
		   
		   WebElement getcontinue6 = page.getcontinue6();
		   getcontinue6.click();
		   
		   
		   System.out.println("user should enter and Confirm Order,coutinue6");
		   
		   threadsleep(2000);
		   
		   WebElement thankyou = driver.findElement(By.xpath("//h1[text()='Thank you']"));
			
			String text = thankyou.getText();
			System.out.println(text);
			
			WebElement yourorder = driver.findElement(By.xpath("//strong[text()='Your order has been successfully processed!']"));
			
			String text2 = yourorder.getText();
			System.out.println(text2);
			
			threadsleep(2000);
			
			WebElement getorderdetails = page.getorderdetails();
			getorderdetails.click();
		
			
			threadsleep(2000);
			
			WebElement getorderpdf = page.getorderpdf();
			getorderpdf.click();
			
			
			
			
			threadsleep(2000);
			
			WebElement getprint = page.getprint();
			getprint.click();
			

			

			
			
	} catch (Exception e) {
		e.printStackTrace();
		
		
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}