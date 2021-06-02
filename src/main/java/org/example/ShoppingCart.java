package org.example;

import org.openqa.selenium.By;

public class ShoppingCart extends Utils
{
    private By _clickOnCheckout = By.cssSelector("button#checkout");
    private By _clickOnTermsCheckbox = By.cssSelector("input#termsofservice");

    public void proceedToCheckout(){
        clickOnElement(_clickOnTermsCheckbox);
        clickOnElement(_clickOnCheckout);

    }
}
