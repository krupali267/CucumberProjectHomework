
  Feature: new online comment added

    @Test
    Scenario: user should be able to add and see new comment
      Given user is on homepage
      And click on new online store is open !
      When user enters a new comment
      Then user should be able to see the new comment is added
