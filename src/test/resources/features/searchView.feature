@ApiDemos
Feature: Api Demos

  @SearchView
  Scenario: Check Search View Page
    Given user should see the Categories Page
    When taps "Views" on Categories Page
    When taps "Search View" on Categories Page
    When taps "Action Bar" on Categories Page
    Then should see Title "Views/Search View/Action Bar" on Search View Page

  @SearchView @CheckActions
  Scenario: Check Search View Page Actions
    Given user is on the Search View Page
    Then should see Search Button on Search View Page
    When taps to Search Button on Search View Page
    When sendkeys to Search Area "blabla" on Search View Page
    Then should see Result "blabla" on Search View Page
