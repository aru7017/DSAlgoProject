Feature: DsAlgo login feature

 Background: user navigats to DsAlgo application
             Given user navigats to LoginPage
            
             
             
          Scenario Outline: Sign In successful with valid credentials
          When user enters "<Sheetname>" and <RowNumber>
          Then user enters valid Login credentials

          Examples: 
          | Sheetname | RowNumber |
          | login     |         0 |

      Scenario Outline: Check login feature with invalid credentials
 
        When user enters "<Sheetname>" and <RowNumber>
        Then user enters invalid credentials

     Examples: 
     | Sheetname | RowNumber |
     | login     |         1 |

   Scenario Outline: Check login feature with only entering the password field
   
    When user enters "<Sheetname>" and <RowNumber>
     Then user enters only password field

     Examples: 
       | Sheetname | RowNumber |
       | login     |         2 |

 Scenario Outline: Check login feature with only entering the username field
 
    When user enters "<Sheetname>" and <RowNumber>
    Then user enters only username field

    Examples: 
    | Sheetname | RowNumber |
    | login     |         3 |

  Scenario Outline: Check login feature with all empty fields

    When user enters "<Sheetname>" and <RowNumber>
    Then user checks all empty fields

    Examples: 
      | Sheetname | RowNumber |
      | login     |         4 |

 Scenario Outline: Check login feature with alphanumaric charecters for password
    
    When user enters "<Sheetname>" and <RowNumber>
    Then user enters alphanumaric charecters for password

    Examples: 
     | Sheetname | RowNumber |
     | login     |         5 |
