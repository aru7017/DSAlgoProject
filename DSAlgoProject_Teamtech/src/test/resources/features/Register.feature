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
    When user enters "<username>" and "<password>" and "<passwordconfirmation>" all fields empty
    Then user navigate to loginpage

    Examples: 
      | username | password | passwordconfirmation |
      |          |          |                      |

  Scenario Outline: Check Registration with only username other fields empty
    Given user is on the registerpage
    When user enters "<username>" and "<password>" and "<passwordconfirmation>" only username
    Then user navigate to login page succesfully

    Examples: 
      | username | password | passwordconfirmation |
      | techteam |          |                      |

  Scenario Outline: Check Registration with only password other fields empty
    Given user is navigate to register
    When user enters "<username>" and "<password>" and "<passwordconfirmation>" only password field
    Then user is on the login page

    Examples: 
      | username | password   | passwordconfirmation |
      |          | Time4team$ |                      |

  Scenario Outline: Check Registration with only passwordconfirmation other fields empty
    Given user navigate to register page
    When user enters "<username>" and "<password>" and "<passwordconfirmation>" only passwordconfirmation field
    Then user navigates to login page

    Examples: 
      | username | password | passwordconfirmation |
      |          |          | Time4team$           |

  Scenario Outline: Check Registration with invalid username
    Given user is navigating to the register
    When user enters "<username>" and "<password>" and "<passwordconfirmation>" invalid username
    Then user navigats to loginpage

    Examples: 
      | username | password   | passwordconfirmation |
      | t        | Time4team$ | Time4team$           |

  Scenario Outline: Check Registration with invalid password
    Given user is navigating to the register page
    When user enters "<username>" and "<password>" and "<passwordconfirmation>" invalid password
    Then user navigating to the loginpage

    Examples: 
      | username | password | passwordconfirmation |
      | techteam | Time4    | Time4team$1234       |
