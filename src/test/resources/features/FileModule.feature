Feature: File Module Functionality
  As a user, I should be able to upload a file, move or delete any selected file under the Files module

  Background: For all scenarios user is on the login page of the TryCloud application
    Given the user logged in with username as "Employee22" and password as "Employee123"


  Scenario: User can upload a file
      Given User is on the TryCloud dashboard page
      When  User click the files module
      And  User click the Add button
      And  User click on the Upload file button
      And User select a file to upload
      And User click the Upload button
      Then User should see uploaded file


  Scenario: User can create a new folder
    Given User is on the TryCloud dashboard page
    When  User click the files module
    And  User click the Add button
    And User click on the New Folder button
    And User enter a folder name NewFolder
    And User click the Create button
    Then User should see a new folder named "New folder"

    Scenario: User can delete any selected item from its three dots menu
      Given User is on the TryCloud dashboard page
      When  User click the files module
      And  User click the three dots menu of the selected item
      And User chooses the Delete option
      Then User should see the selected item should be deleted


    Scenario: User can see the total number of files and folders under the files list table
      Given User is on the TryCloud dashboard page
      When  User click the files module
      Then User should see the total number of files and folders under the files list table










