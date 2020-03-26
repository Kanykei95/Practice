Feature: Deleting Teacher service


  @teacherDelete
  Scenario: Positive teacher deleting
    Given user deletes teacher at "/teacher/delete/2663"
    And user gets teacher at "/teacher/2663"
    Then user verifies response message "Teacher with id = 2663 NOT FOUND!"




