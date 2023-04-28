@ApiDemos
Feature: Api Demos

  @RadioButtonPage
  Scenario: Check Radio Button Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Radio Group" on Categories Page
    Then should see Title "Views/Radio Group" on Radio Button Page

  @RadioButtonPage @CheckActions
  Scenario: Check Radio Button Page Actions
    Given user is on the Radio Button Page
    Then should see Radio Button "Snack" on Radio Button Page
    Then should see Radio Button "Breakfast" on Radio Button Page
    Then should see Radio Button "Lunch" on Radio Button Page
    Then should see Radio Button "Dinner" on Radio Button Page
    Then should see Radio Button "All of them" on Radio Button Page
    Then should see Clear Button "CLEAR" on Radio Button Page
    When taps to Radio Button "Dinner" on Radio Button Page
    Then should see Selected Text "2131296432" on Radio Button Page
    When taps to Radio Button "Lunch" on Radio Button Page
    Then should see Selected Text "2131296577" on Radio Button Page
