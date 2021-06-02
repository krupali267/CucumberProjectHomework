package org.example;

import org.openqa.selenium.By;

public class DigitalDownloads extends Utils
{
    private By _selectProduct = By.cssSelector("button.button-2.product-box-add-to-cart-button");
    private By _clickOnCart = By.xpath("//a[contains(@href, '/cart')]");

    public void selectProduct(){

        waitForClickable(_selectProduct, 80);
        clickOnElement(_selectProduct);
        clickOnElement(_clickOnCart);



    }
}
