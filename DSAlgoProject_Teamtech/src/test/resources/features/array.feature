Feature: DsAlgo Array feature

Background: User should be logged into dsAlgo Portal
     Given User is in landing Page
     When User enters username and password followed by login button
     Then User should navigate to homepage


Scenario: Verify if User navigates to Array page after login
    When User clicks Get Started of Array in Home Page.
    Then User should navigate to Array Page with title "Array"
##############################Operations in Stack##################################################
Scenario: Verify if User navigates to Arrays in Python page
    When User clicks on Arrays in Python Page .
    Then User should navigate to Arrays in Python page with title "Arrays in Python"
