Feature: As an administrator I should be able to view all employees and search.
  Background:
    Given I'm on logged in to exampleWebApp as admin

  @hrm
  Scenario: View All Employees
    And I click on the Employee List
    Then I see employee list table
    #test comment
