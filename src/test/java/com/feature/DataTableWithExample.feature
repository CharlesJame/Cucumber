Feature: To Login to Orange HRM
Scenario Outline: To check the Login functionality using datatable with Example
Given user open the browser
When go to the OrangeHRM Homepage
Then user enter credentials "<username>" and "<password>"
And press the Login button

Examples:
|username|password|
|Admin|admin123|
|admin|admin123|
|Admin|admin1234|