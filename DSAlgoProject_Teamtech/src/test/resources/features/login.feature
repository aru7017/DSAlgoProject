Feature: DsAlgo login feature

  Scenario Outline: Check login is successful with valid credentials
    Given user is on the browser
    And user is on the login page
    When user enters "<username>" and "<password>"
    And user is able to click on login button
    Then user navigate to home page

    Examples: 
      | username | password   |
      | techteam | Time4team$ |
