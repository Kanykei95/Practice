@Wiki
Feature: Wiki search functionality


  Background: User is already on Etsy home page
    Given User is on Wikipedia home page



  Scenario Outline: Wikipedia Search Functionality Title Verification
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
  Then User sees "<expectedValue>" is in the wikititle
    Examples:
      | searchValue | expectedValue |
      | Steve Jobs   | Steve Jobs    |

  Scenario Outline: Wikipedia Search Functionality Header Verification
    When User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
  Then User sees "<expectedValue>" is in the main header
    Examples:
      | searchValue | expectedValue |
      | Steve Jobs   | Steve Jobs    |

  @scenarioOutline
  Scenario Outline: Wikipedia Search Functionality Image Header Verification
    When User is on Wikipedia home page
    And User types "<searchValue>" in the wiki search box
    And User clicks wiki search button
  Then User sees "<expectedValue>" is in the image header
    Examples: Test data for image header verification
      | searchValue  | expectedValue |
      | Steve Jobs   | Steve Jobs    |
      | Bill Gates   | Bill Gates    |
      | Donald Trump | Donald Trump  |
      | Ricky Martin | Ricky Martin  |


