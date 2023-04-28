@ApiDemos
Feature: Api Demos

  @Visibility
  Scenario: Check Visibility Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Visibility" on Categories Page
    Then should see Visibility Page

  @Visibility @CheckActions
  Scenario: Check Visibility Page Actions
    Given user is on the Visibility Page
    Then should see View Text "" on Visibility Page
    Then should see Buttons "" on Visibility Page
    When taps to Buttons "" on Visibility Page
    Then should not see View Text "" on Visibility Page
    When taps to Buttons "" on Visibility Page
    Then should see View Text "" on Visibility Page