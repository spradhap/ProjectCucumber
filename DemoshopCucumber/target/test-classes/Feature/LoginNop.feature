Feature: To verify demo shop webpage

  Background: 
    Given user should click the login button

  @login
  Scenario: To validate demo shop webpage
    Given user should click the login button
    And User should enter the emailname and password

  @seaching
  Scenario: To validate demo shop webpage seach page
    And User should enter the emailname and password
    When user shold enter and seach the product

  @shopping
  Scenario: To validate demo shop webpage shopping  page
    And User should enter the emailname and password
    When user shold enter and seach the product
    When user should enter and shopping,iagree,checkout

  @address
  Scenario: To validate demo shop webpage address  page
    And User should enter the emailname and password
    When user shold enter and seach the product
    When user should enter and shopping,iagree,checkout
    When user should enter and newaddress,firstnameaddr,lastnameaddr,emailaddr,countryaddr,cityaddr,address1,pincodeaddr,phoneaddr,continue1
    When user should enter and ShippingAddress,continue2
    When user should enter and shippingmethod,countinue3,

  @payment,order
  Scenario: To validate demo shop webpage payment and order  page
    And User should enter the emailname and password
    When user shold enter and seach the product
    When user should enter and shopping,iagree,checkout
    When user should enter and newaddress,firstnameaddr,lastnameaddr,emailaddr,countryaddr,cityaddr,address1,pincodeaddr,phoneaddr,continue1
    When user should enter and ShippingAddress,continue2
    When user should enter and shippingmethod,countinue3,
    When user sholud enter and paymethod,countinue4
    When user should enter and Payment Information,continue5
    When user should enter and Confirm Order,coutinue6
