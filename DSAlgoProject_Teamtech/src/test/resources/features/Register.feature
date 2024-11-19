Feature: DsAlgo Register feature

  Scenario Outline: Check Registration is successful with valid credentials
    Given user is on the register
    When user enters "<username>" and "<password>" and "<passwordconfirmation>"
    Then user navigate to login page

    Examples: 
      | username | password   | passwordconfirmation |
      | techteam | Time4team$ | Time4team$           |

  Scenario Outline: Check Registration with all fields empty
    Given user is on the register page
    When user enters "<username1>" and "<password1>" and "<passwordconfirmation1>"page
    Then user navigate to login page successfull

    Examples: 
      | username1 | password1 | passwordconfirmation1 |
      |           |           |                       |
