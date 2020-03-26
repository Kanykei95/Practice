Feature: Student List API

  @batchID
  Scenario Outline: Getting list of students by Batch Number

    Given user gets students list with "<resource>"
    And user validates the data from response by batch number "<batchID>"

    Examples:
      | resource          | batchID |
      | /student/batch/14 | 14      |
      | /student/batch/4  | 4       |


    @deleteStudent
  Scenario Outline: Deleting Student End to End scenario
    Given user deleted student with "<resource>"
    And user goes to cybertek training application
    Then user searches for student with student ID "<studentID>"
    And user verifies that no result should show

    Examples:
      | resource        | studentID |
      | /student/delete | 7597    |

@createStudent
      Scenario: Student creation with API E2E scenario
        Given user creates student with following data "/student/create"
          | firstName        | Lionelio        |
          | lastName         | Messi           |
          | emailAddress     | messi@gmail.com |
          | joinDate         | 01/01/2010      |
          | password         | 123jbr          |
          | subject          | Math            |
          | phone            | 3124756521      |
          | gender           | Male            |
          | admissionNo      | 10              |
          | birthDate        | 01/01/1990      |
          | major            | Football        |
          | batch            | 10              |
          | section          | LaLigA          |
          | premanentAddress | 921 W Huron St. |
          | companyName      | Barcelona       |
          | title            | Goatie          |
          | startDate        | 01/02/2010      |
          | city             | Barcelona       |
          | street           | 13 Hurnon       |
          | zipCode          | 60742           |
          | state            | IL              |
       # And user goes to cybertek training application
        #Then user searches for student with newlt student ID
       # And user verifies that student is created
