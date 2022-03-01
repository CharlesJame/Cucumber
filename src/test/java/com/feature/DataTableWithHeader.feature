@opengoogle @datadriven 
Feature: To Login to Orange HRM
Scenario: To check the Login functionality using datatable with Header
Given open the browser
When go to OrangeHRM Homepage
Then user enter the credentials from datatable with Header
|username|password|
|Admin|admin123|
And click the Login button
