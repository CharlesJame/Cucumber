@opengoogle
Feature: To check the google search
Scenario: Navigate to google & search
Given user Launch the Browser
When  navigates to google.co.in
Then search for charles
Then user should see the results