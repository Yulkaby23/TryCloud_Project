Feature: Contacts Module Functionality


  Scenario Outline: Verify user can create/edit any contact under Contacts module
    When user click on Contacts module
    And user should see New contact and click on it
    And user enter "<fullName>" in New contact field
    Examples:
      | fullName       |
      | John Wick      |
      | Michale Jordan |
      | Mike Tyson     |

    And user click on All contacts
    And user should see all created contacts
    And number of contacts should much with digit in All contact tab


  Scenario: Verify user can change the profile picture of any contact with a previously uploaded picture by using "Choose from files" option