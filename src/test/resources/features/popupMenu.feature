@ApiDemos
Feature: Api Demos

  @PopupMenuPage
  Scenario: Check Popup Menu Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Popup Menu" on Categories Page
    Then should see Title "Views/Popup Menu" on Popup Menu Page

  @PopupMenuPage @CheckActions
  Scenario: Check Popup Menu Page Actions
    Given user is on the Popup Menu Page
    Then should Make Popup Button "MAKE A POPUP!" on Popup Menu Page
    When taps Make Popup Button on Popup Menu Page
    Then should see Popup Element "Search" on Popup Menu Page
    Then should see Popup Element "Add" on Popup Menu Page
    Then should see Popup Element "Edit" on Popup Menu Page
    When taps Popup Element "Edit" on Popup Menu Page
    Then should see Popup Menu Title "Edit" on Popup Menu Page
