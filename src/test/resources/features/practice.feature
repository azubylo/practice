@first
  Feature: Practice
    Scenario: Exercise
      Given I navigate to the web
      And I wait for 3 seconds
      Then I see "Let me hack!" button
      And I click "Let me hack!" button
      And I scroll down
      And I wait for 2 seconds
      Then I put "Ada Lovelace" the name field
      And I put "ada.lovelace@zeel.com" into the email field
      And I enter "347-555-1212" into the phone field
      And I enter "Hello" into the subject field
      And I enter "How are you? I hope you are doing great!" into the message field
      And I wait for 2 seconds
      Then I click "Submit" button
      And I wait for 3 seconds
      Then "Hello" is displayed
      Then I click "Book this room" button
      And I wait for 2 seconds
      And I click "17" button
      And I enter "Grace" into the first name field
      Then I enter "Hopper" into the last name field
      And I enter "grace.hopper@zeel.com" into the email field
      And I enter "347-555-9898" into phone field
      And I click "Book" button
      Then I check the info
  #    date is not clickable, so it is not possible to book the room (error message)
