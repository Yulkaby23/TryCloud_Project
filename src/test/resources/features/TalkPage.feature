@TalkFeatures
Feature: User should be able to create and delete a new conversation,
  add participant, start and leave call under the Talk module.

  @B29G43-152
  Scenario: user can create a new conversation by adding any selected participants
    Given user is already on the home page
    When user clicks on "Talk" module
    And user clicks on "create new conversation" plus button
    Then user names the conversation created
    And user check the box "Allow guest via link"
    And user clicks on "Add participants"
    And user select participants
    Then user clicks on "Create conversation" button
    Then user clicks on the button "close"
    And user clicks on start call
    Then user clicks on leave call

    @B29G43-153
    Scenario: user can delete a conversation
      Given user is already on the home page
      When user clicks on "Talk" module
      Then user clicks on the "3Dots setting"
      And user clicks on the  "Delete conversation"






  #  Scenario: user can delete a conversation
  #    Given user is on the home page
  #    When user clicks on "Talk" module
  #    And user clicks on Three dots
  #    Then user clicks on "Delete conversation"
  #    And user clicks on "Yes" button to delete conversation






