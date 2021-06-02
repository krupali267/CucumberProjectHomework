package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class ResultVerificationPage extends Utils
{
    SoftAssert softAssert = new SoftAssert();
    private By _actualResult = By.xpath("//div[text()= 'Your registration completed']");


    public void verifyRegisterMessage()
    {
        // verify user has registered successfully
        Assert.assertEquals(getTextFromElement(_actualResult), "Your registration completed", "Registration Not Successful");
        System.out.println("Your registration completed");
    }



}
