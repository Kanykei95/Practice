@dzone
  Feature: Compare headers
  "https://dzone.com/articles/gradle-vs-maven"
  "https://dzone.com/articles/api-security-weekly-issue-71"

  Scenario: Header Comparison
    Given the user goes to "https://dzone.com/articles/gradle-vs-maven"
    When the user takes the header of the first webpage
    And the user goes to "https://dzone.com/articles/api-security-weekly-issue-71"
    And the user takes the header of the second page
    Then the user compares two headers


