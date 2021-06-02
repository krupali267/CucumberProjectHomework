package org.example;

import org.openqa.selenium.By;

public class BillingAddress extends Utils{

    LoadProperty loadProperty = new LoadProperty();
     private By _companyName =By.cssSelector("input#BillingNewAddress_Company");
     private By _selectCountry = By.xpath("//select[contains (@name, 'BillingNewAddress.StateProvinceId')]");
     private By _cityName = By.xpath("//input[contains (@name, 'BillingNewAddress.City')]");
     private By _address1 = By.xpath("//input[contains (@name, 'BillingNewAddress.Address1')]");
     private By _postcode = By.xpath("//input[contains (@name, 'BillingNewAddress.ZipPostalCode')]");
     private By _phoneNumber = By.xpath("//input[contains (@name, 'BillingNewAddress.PhoneNumber')]");
     private By _continueTab = By.xpath("//button[contains (@class, 'button-1 new-address-next-step-button')]");

 public void enterBillingAddress(){
  enterText(_companyName, loadProperty.getProperty("company_name"));
  waitForClickable(_selectCountry,50);
  selectFromDropdownByVisibleText(_selectCountry,loadProperty.getProperty("country_name"));
  selectFromDropDownByValue(_cityName,loadProperty.getProperty("city_name"));
  enterText(_address1,loadProperty.getProperty("address_line1"));
  enterText(_postcode,loadProperty.getProperty("postcode"));
  enterText(_phoneNumber,loadProperty.getProperty("phone_number"));
  clickOnElement(_continueTab);


 }

}
