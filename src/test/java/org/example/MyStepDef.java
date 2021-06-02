package org.example;

import com.sun.org.apache.xpath.internal.operations.Or;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepDef {
    HomePage homePage = new HomePage();
    RegisterPage registerPage = new RegisterPage();
    ResultVerificationPage resultVerificationPage = new ResultVerificationPage();
    NewOnlinePage newOnlinePage = new NewOnlinePage();
    BillingAddress billingAddress = new BillingAddress();
    DigitalDownloads digitalDownloads = new DigitalDownloads();
    PaymentInformation paymentInformation = new PaymentInformation();
    PaymentMethod paymentMethod = new PaymentMethod();
    ShoppingCart shoppingCart = new ShoppingCart();
    OrderPlacedVerification orderPlacedVerification = new OrderPlacedVerification();



    @Given("^user is on registration page$")
    public void user_is_on_registration_page() {
        homePage.clickOnRegisterButton();

    }

    @When("^user enters all required registration details$")
    public void user_enters_all_required_registration_details() {
        registerPage.enterRegisterationDetails();

    }

    @Then("^user should be able to register successfully$")
    public void user_should_be_able_to_register_successfully() {
        resultVerificationPage.verifyRegisterMessage();

    }
    @Given("^user is on homepage$")
    public void user_is_on_homepage() {
        homePage.verifyCurrencySymbolInEachPrice();

    }

    @When("^user changes the currency to Euro$")
    public void user_changes_the_currency_to_Euro() {
        homePage.changeCurrency();
    }

    @Then("^user should be able to see Euro currency symbol for each featured product$")
    public void user_should_be_able_to_see_Euro_currency_symbol_for_each_featured_product() {
        homePage.verifyCurrencySymbolInEachPrice();
    }


    @Given("^click on new online store is open !$")
    public void click_on_new_online_store_is_open(){
       homePage.commentForNewOnlineStore();
    }

    @When("^user enters a new comment$")
    public void user_enters_a_new_comment() {
     newOnlinePage.fillCommentDetails();
    }

    @Then("^user should be able to see the new comment is added$")
    public void user_should_be_able_to_see_the_new_comment_is_added() {
        newOnlinePage.verifyCommentAddedSuccessMessage();
        newOnlinePage.verifyCommentPresentInCommentList();
        newOnlinePage.verifyCommentsAddedAtLastInTheList();
    }

    @Given("^user is registered$")
    public void user_is_registered() {
      homePage.clickOnRegisterButton();
      registerPage.enterRegisterationDetails();
    }

    @When("^user selects a product$")
    public void user_selects_a_product() {
        homePage.buyProduct();
        digitalDownloads.selectProduct();
        shoppingCart.proceedToCheckout();

    }

    @When("^enters billing address$")
    public void enters_billing_address()  {
     billingAddress.enterBillingAddress();
    }

    @When("^enters payment method$")
    public void enters_payment_method(){
        paymentMethod.choosePaymentMethod();
    }

    @When("^enters payment information$")
    public void enters_payment_information() {
       paymentInformation.enterPaymentInformation();
    }

    @Then("^user is able to buy the selected product$")
    public void user_is_able_to_buy_the_selected_product() {
    orderPlacedVerification.verifyOrderIsPlaced();
    }

}
