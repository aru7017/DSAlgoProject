Feature: DsAlgo login feature




  Scenario Outline: Check login is successful with valid credentials
    Given user is on the LoginPage
    When user enters "<username>" and "<password>" valid credentials
    Then user navigate to homepage

    Examples: 
     | username | password   |
     | techteam | Time4team$ |










  # Scenario Outline: Check login is successful with valid credentials
    # Given user navigates to home page
    # And user navigates to Login page
   #  When user enters sheetname "<SheetName>" and rownumber <RowNumber>
   #  And user clicks on Login button
   #  Then validate the message from sheetname "<SheetName>" and rownumber <RowNumber>

   #  Examples: 
   #    | SheetName | RowNumber |
   #    | login     |         0 |

 # Scenario Outline: Check login feature with all empty fields
  #  Given user is on the LoginPage
   # When user enters "<username>" and "<password>" all fields empty
  #  Then user navigate to homepage

  #  Examples: 
   #   | username | password   |
  #    | techteam | Time4team$ |

 # Scenario Outline: Check login feature with only entering the password field
   # Given user navigate the Login Page
 #   When user enters "<username>" and "<password>" password only
   #  Then user navigates to homepage

    # Examples: 
   #    | username | password   |
    #   | techteam | Time4team$ |

  # Scenario Outline: Check login feature with only entering the username field
   #  Given user navigates the Login Page
    # When user enters "<username>" and "<password>" username only
    # Then user navigates to homepage successfully

   #  Examples: 
   #    | username | password   |
    #   | techteam | Time4team$ |

  # Scenario Outline: Check login feature with invalid username field
 #    Given user is able to navigate Login Page
  #   When user enters "<username>" and "<password>"invalid username
   #  Then user is able navigate to homepage

   #  Examples: 
    #   | username | password   |
    #   | techteam | Time4team$ |

  # Scenario Outline: Check login feature with invalid password field
  #   Given user is able to navigates LoginPage
   #  When user enters "<username>" and "<password>" invalid password
   #  Then user is able navigates to homepage successfull

    # Examples: 
    #   | username | password   |
    #   | techteam | Time4team$ |
