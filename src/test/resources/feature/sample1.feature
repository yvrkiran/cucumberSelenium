Feature: Title of your feature
  I want to use this template for my feature file

  @smoke
  Scenario Outline: Finding some cheese
    Given I am on the Google search page
    When I search for "<something>"
    Then the page title should start with "<something>"

    Examples: 
      | something |
      | cheese    |
      | butter    |
      | milk      |