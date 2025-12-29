Feature: Banking Portal Login and Dialog

@Smoke
Scenario: Login and open dialog
  Given user opens banking portal
  When user enters valid email and password
  And user clicks on sign in button
  Then user should be logged in successfully
  When user clicks on open dialog button
  Then dialog should be displayed
  And user closes the dialog
