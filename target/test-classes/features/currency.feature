@ll
  Feature: currency selector

    //@Test
    Scenario: user should be able to change the currency
      Given user is on homepage
      When user changes the currency to Euro
      Then user should be able to see Euro currency symbol for each featured product