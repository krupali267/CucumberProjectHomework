package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginFunction extends Utils{


    private By _enterEmailId = By.cssSelector("input.email");
    private By _enterPassword = By.cssSelector("input.password");
    private By _clickOnLoginTab = By.xpath("//button[contains(@class, 'button-1 login-button')]");


    public void verifyCurrentURL(){
        //expected url
        String url = "https://demo.nopcommerce.com/login?returnUrl=%2F";
        // to verify url
        assertURL(url);

    }
   public void loginDetails (String emailId,String password)
    {
        // method to wait before clicking on element
        waitForClickable(_enterEmailId, 50);
        // to enter email-id
        enterText(_enterEmailId,emailId);
        // to enter password
        enterText(_enterPassword, password);
    }

    public void loginButton (){
        // to click on login button
        clickOnElement(_clickOnLoginTab);

    }

    public void verificationOfErrorMessage (String errorMessage){

        //method to verify Actual and expected error message

        WebElement EmailValidation = driver.findElement(By.cssSelector("div.returning-wrapper.fieldset"));
        String ActualValidation = EmailValidation.getText();

        if(errorMessage.equals(ActualValidation)){

            System.out.println("Actual and Execpted messages are same and it is: " + ActualValidation);
        }else {
            System.out.println("Actual message :-  " +ActualValidation);
            System.out.println("Expected message :-  "+EmailValidation);
        }


    }
}
