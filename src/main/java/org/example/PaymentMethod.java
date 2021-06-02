package org.example;

import org.openqa.selenium.By;

public class PaymentMethod extends Utils
{
    private By _creditCard = By.cssSelector("input#paymentmethod_1");
    private By _continueNext = By.xpath("//button[contains (@class, 'button-1 payment-method-next-step-button')]");

    public void choosePaymentMethod (){

        clickOnElement(_creditCard);
        clickOnElement(_continueNext);

    }



}
