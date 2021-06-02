@all
Feature: registration

  //@Test
  Scenario: User should be able to register successfully

    Given user is on registration page
    When user enters all required registration details
    Then user should be able to register successfully