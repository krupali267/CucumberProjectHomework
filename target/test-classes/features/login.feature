@ll

Feature: Login Function

  @login
  Scenario Outline: user should not be able to login with invalid email-id and password

    Given user is on homepage
    When user clicks on login button
    And user type "<emailId>"and "<password>"
    And user clicks on login button
    Then user should not be able to login
    And user should get "<errorMessage>"
    Examples:
      | emailId             | password | errorMessage                                                                               |
      | krupali123@test.com |          | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      |                     | test1235 | Please enter your email                                                                    |
      | krup564@test.com    | delta123 | Login was unsuccessful. Please correct the errors and try again. No customer account found |
      |                     |          | Please enter your email                                                                    |
