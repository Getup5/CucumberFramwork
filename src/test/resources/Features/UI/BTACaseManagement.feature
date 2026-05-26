@UI @BTA

Feature: BTA Case Management in AEME Portal

  Background:
    Given Navigate to the AEME Portal
    When I enter username "admin" and password "admin"
    Then I click the login button
    And I should see the ONLS Helper Tool Home Page

  @Sanity @CaseManagement_Test_01
  Scenario: Verify BTA Case Management functionality
    When Click the Case Management Section
    Then User Submit the Case Management Request
    And User verify the Successful case submission in Case Management Section