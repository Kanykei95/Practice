Feature: Teacher Details end to end for UI vs API

  @e2e
  Scenario Outline: UI vs API cross data validation
    Given user gets teacher at "<resource>"
    And user gets to cybertek training application
    Then user opens teacher profile details page "<teacherID>"
    And user cross validates teacher details on API and on UI


    #command option l -> will organize

    Examples:
      | resource      | teacherID |
      | /teacher/2625 | 2625      |