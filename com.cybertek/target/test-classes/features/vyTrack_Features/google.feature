@regression
  #reduce the risk of manual test
Feature: Google feature verifications
  Agile Story: User Story, acceptance criteria
  Basically we can pass here any additional information related to this feature file
  #comments are done using hashtag sign in feature file

    @smokeTest @miniRegression
  Scenario: Google title verification
    #Each of these lines are Steps:
    When user is on google homepage
    #Can also use And, multiple when and And but only one Then at the end
    Then user should see title contains Google

      @miniRegression
    Scenario: Google title verification after searching a term
      When user is on google homepage
      And user types wooden spoon into the search box
      And user clicks to search button
      Then user should see wooden spoon in the title

