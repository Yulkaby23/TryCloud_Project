Feature: Contacts Module Functionality

  Background:
    Given the user is on the login page
    Given the user logged in with username as "Employee32" and password as "Employee123"

  @wip
  Scenario Outline: Verify user can create/edit any contact under Contacts module
    When user click on Contacts module
    And user should see New contact and click on it
    And user click on New contact full name filed
    Then user enter "<enteredNames>" in New contact field
    Examples:
      | enteredNames |
      | John Wick    |
      | Marco Polo   |

@wip
 Scenario: Verify User can see all the contacts as a list inside the middle column and total number of the contacts near the “All Contacts” tab
    When user click on Contacts module
    And user click on All contacts
    And user should see all entered names
    Then number of contacts should match with digit in All contact tab

  @wip
  Scenario: Verify User can change the profile picture of any contact with a previously uploaded picture by using “Choose from files” option
    When user click on Contacts module
    And user click on upload picture
    And user click on Choose from Files
    Then user click on choose button

@wip
  Scenario: Verify User can delete any selected contact
    When user click on Contacts module
    And user click in the first element in the colum
    And user click on three dots
    Then user delete contact by clicking on Delete button

