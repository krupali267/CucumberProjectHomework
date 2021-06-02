package org.example;

import org.openqa.selenium.By;

public class PaymentInformation extends Utils{

    LoadProperty loadProperty = new LoadProperty();
    private By _creditCardType = By.cssSelector("select#CreditCardType");
    private By _cardholderName = By.cssSelector("input#CardholderName");
    private By _creditCardNumber = By.cssSelector("input#CardNumber");
    private By _CardExpiryMonth = By.cssSelector("select#ExpireMonth");
    private By _cardExpiryYear = By.cssSelector("select#ExpireYear");
    private By _cardCode = By.cssSelector("input#CardCode");
    private By _continueButton = By.xpath("//button[contains(@class, 'button-1 payment-info-next-step-button')]");
    private By _verificationOfBilling = By.cssSelector("div.billing-info");

    public void enterPaymentInformation (){

        selectFromDropdownByVisibleText(_creditCardType,loadProperty.getProperty("credit_card_type"));
        enterText(_cardholderName, loadProperty.getProperty("cardholder_name"));
        enterText(_creditCardNumber, loadProperty.getProperty("cc_number"));
        selectFromDropdownByVisibleText(_CardExpiryMonth, loadProperty.getProperty("card_expiry_month"));
        selectFromDropdownByVisibleText(_cardExpiryYear, loadProperty.getProperty("card_expiry_year"));
        enterText(_cardCode, loadProperty.getProperty("card_code"));
        clickOnElement(_continueButton);
    }




}

