@all
  Feature: registered user can buy a product
    @Test
    Scenario: registered user is able to buy a product
      Given user is registered
      When user selects a product
      And enters billing address
      And enters payment method
      And enters payment information
      Then user is able to buy the selected product