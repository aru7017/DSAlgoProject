Feature: DsAlgo queue page functionality

Background: User logged into the DsAlgo 
Given User navigates to login page
When User enters username and password and clicks on login button
Then User is navigated to the homepage


Scenario: Verify if User navigates to QueuePage after login
When User clicks Get Started of Queue in Home Page.
Then User should navigate to Queue Page.

Scenario: Verify if User navigates to Implementation of Queue in Python
When User clicks on Implementation of Queue in Python  in Queue Page .
Then User should navigate to Implementation of Queue in Python Page.

Scenario: Verify if User navigates to TryEditor Page from Implementation of Queue in Python
When User clicks on TryHere link of Implementation of queue page .
Then User should navigate to TryEditor page to write the python code





