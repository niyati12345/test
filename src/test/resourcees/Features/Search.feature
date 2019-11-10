Feature: User should search any keyword in google
  @search
  Scenario: Verify that multi word misspelled keywords also get corrected
    Given user is on home page
   When  user enter misspelled keyword
    And   click on search button
    Then  User should get Search instead option