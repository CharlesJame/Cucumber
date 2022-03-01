Feature: To Login to Orange HRM
Scenario: To check the Login functionality using correct credentials
Given user launch the browser
When navigates to OrangeHRM Homepage
Then user enter the credentials "Admin" and "admin123"
Then  user clicks the Login button
Then user should be logged in