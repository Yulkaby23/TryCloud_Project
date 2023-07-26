@B29G43-140
Feature: Default


		#@B29G43-139
		Background: For all scenarios user is on the login page of the TryCloud application
		    Given the user logged in with username as "Employee22" and password as "Employee123"
		

	#{color:#de350b}*User Story :*{color} 
	#
	#As a user, I should be able to upload a file, move or delete any selected file under the *+Files+* module 
	#
	#AC1 - User can upload a file
	@B29G43-133
	Scenario: User can upload a file
		Given User is on the TryCloud dashboard page
		      When  User click the files module
		      And  User click the Add button
		      And  User click on the Upload file button
		      And User select a file to upload
		      And User click the Upload button
		      Then User should see uploaded file	

	#{color:#de350b}*User Story :*{color} 
	#
	#As a user, I should be able to upload a file, move or delete any selected file under the *+Files+* module 
	#
	# 
	#
	#AC2 - User can create a new folder
	@B29G43-134
	Scenario: User can create a new folder
		Given User is on the TryCloud dashboard page
		    When  User click the files module
		    And  User click the Add button
		    And User click on the New Folder button
		    And User enter a folder name NewFolder
		    And User click the Create button
		    Then User should see a new folder named "New folder"	

	#{color:#de350b}*User Story :*{color} 
	#
	#As a user, I should be able to upload a file, move or delete any selected file under the *+Files+* module 
	#
	#AC3- User can delete any selected item from its three dots menu
	@B29G43-135
	Scenario: User can delete any selected item from its three dots menu
		Given User is on the TryCloud dashboard page
		      When  User click the files module
		      And  User click the three dots menu of the selected item
		      And User chooses the Delete option
		      Then User should see the selected item should be deleted	

	#{color:#de350b}*User Story :*{color} 
	#
	#As a user, I should be able to upload a file, move or delete any selected file under the *+Files+* module 
	#
	# 
	#
	#AC4 - User can see the total number of files and folders under the files list table
	@B29G43-136
	Scenario: User can see the total number of files and folders under the files list table
		Given User is on the TryCloud dashboard page
		      When  User click the files module
		      Then User should see the total number of files and folders under the files list table