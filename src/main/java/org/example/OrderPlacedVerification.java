package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class OrderPlacedVerification extends Utils
{

    private By _actualMessage =By.xpath("//strong[text() = 'Your order has been successfully processed!']");

    public void verifyOrderIsPlaced(){

        // verify order had been placed
        Assert.assertEquals(getTextFromElement(_actualMessage),"Your order has been successfully processed!","Order is not placed");
        System.out.println("Order has been placed");
    }



}
