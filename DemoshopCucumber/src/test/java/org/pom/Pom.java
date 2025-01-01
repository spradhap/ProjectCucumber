package org.pom;

import org.global.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom extends BaseClass {

	public Pom() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text()='Log in']")
	private WebElement login1;

	public WebElement getlogin1() {

		return login1;
	}

	@FindBy(id = "Email")
	private WebElement email11;

	public WebElement getemail1() {

		return email11;
	}

	@FindBy(id = "Password")
	private WebElement pass11;

	public WebElement getpassword1() {

		return pass11;
	}

	@FindBy(xpath = "(//input[@type='submit'])[ 2]")
	private WebElement loginclick;

	public WebElement getloginclick() {

		return loginclick;
	}

	@FindBy(id = "small-searchterms")
	private WebElement seach;

	public WebElement getseaching() {

		return seach;
	}

	@FindBy(xpath = "(//input[@type='button'])[ 2]")
	private WebElement addcart1;

	public WebElement getaddcart11() {

		return addcart1;
	}

	@FindBy(name = "product_attribute_71_10_16")
	private WebElement length;

	public WebElement getlength() {

		return length;
	}

	@FindBy(id = "add-to-cart-button-71")
	private WebElement addcart2;

	public WebElement getaddcart22() {

		return addcart2;
	}

	@FindBy(xpath = "(//span[@class='cart-label'])[ 1]")
	private WebElement shopp;

	public WebElement getshopp() {

		return shopp;
	}

	@FindBy(id = "termsofservice")
	private WebElement agree;

	public WebElement getagree() {

		return agree;
	}

	@FindBy(id = "checkout")
	private WebElement checkout;

	public WebElement getcheckout1() {

		return checkout;
	}

	@FindBy(xpath = "//option[text()='New Address']")
	private WebElement newaddress;

	public WebElement getnewaddress() {

		return newaddress;
	}

	@FindBy(id = "BillingNewAddress_FirstName")
	private WebElement fristname;

	public WebElement getfristname() {

		return fristname;
	}

	@FindBy(id = "BillingNewAddress_LastName")
	private WebElement LastName;

	public WebElement getLastName() {

		return LastName;
	}

	@FindBy(id = "BillingNewAddress_Email")
	private WebElement emailaddress;

	public WebElement getemailaddress() {

		return emailaddress;
	}

	@FindBy(id = "BillingNewAddress_CountryId")
	private WebElement countryid;

	public WebElement getcountryid() {

		return countryid;
	}

	@FindBy(id = "BillingNewAddress_City")
	private WebElement City;

	public WebElement getCity() {

		return City;
	}

	@FindBy(id = "BillingNewAddress_Address1")
	private WebElement address1;

	public WebElement getaddress1() {

		return address1;
	}

	@FindBy(id = "BillingNewAddress_ZipPostalCode")
	private WebElement pincode;

	public WebElement getpincode1() {

		return pincode;

	}

	@FindBy(id = "BillingNewAddress_PhoneNumber")
	private WebElement phone1;

	public WebElement getphone() {

		return phone1;
	}

	@FindBy(xpath = "(//input[@title='Continue'])[ 1]")
	private WebElement continue1;

	public WebElement getcontinue1() {

		return continue1;
	}

	@FindBy(xpath = "(//input[@type='button'])[ 3]")
	private WebElement continue2;

	public WebElement getcontinue2() {

		return continue2;
	}

	@FindBy(id = "shippingoption_1")
	private WebElement shippingmethod;

	public WebElement getshippingmethod() {

		return shippingmethod;
	}

	@FindBy(xpath = "(//input[@type='button'])[ 4]")
	private WebElement continue3;

	public WebElement getcontinue3() {

		return continue3;
	}

	@FindBy(id = "paymentmethod_0")
	private WebElement paymethod;

	public WebElement getpaymethod() {

		return paymethod;
	}

	@FindBy(xpath = "(//input[@type='button'])[ 5]")
	private WebElement continue4;

	public WebElement getcontinue4() {

		return continue4;
	}

	@FindBy(xpath = "(//input[@type='button'])[ 6]")
	private WebElement continue5;

	public WebElement getcontinue5() {

		return continue5;
	}

	@FindBy(xpath = "(//input[@type='button'])[ 7]")
	private WebElement continue6;

	public WebElement getcontinue6() {

		return continue6;
	}

	@FindBy(xpath = "//a[text()='Click here for order details.']")
	private WebElement orderdetails;

	public WebElement getorderdetails() {

		return orderdetails;
	}
	
	@FindBy(xpath = "//a[text()='PDF Invoice']")
	private WebElement orderpdf;

	public WebElement getorderpdf() {

		return orderpdf;
	}
	@FindBy(xpath = "//a[text()='Print']")
	private WebElement print;

	public WebElement getprint() {

		return print;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
