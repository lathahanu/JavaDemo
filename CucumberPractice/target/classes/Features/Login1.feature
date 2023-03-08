
 Feature: feature to search on Google functionality

  Scenario: Verify the Google search
   Given browser is open
    And user is on google search page
    When user enters a text in searchbox
    And hits enter
    Then user is navigated to the search results
 