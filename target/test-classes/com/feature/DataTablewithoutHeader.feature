Feature: To Login to Orange HRM
Scenario: To check the Login functionality using correct credentials
Given launch the browser
When navigate to OrangeHRM Homepage
Then user enter the credentials from datatable
|Admin|admin123|
And the user clicks the Login button
