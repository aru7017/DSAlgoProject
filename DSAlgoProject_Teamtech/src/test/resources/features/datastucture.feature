Feature: DsAlgo DataStructure feature

  Scenario Outline: Verify Navigation to Data Structures-Introduction page
    Given user navigates Home page
    When user enters sheet "<Sheetname>" and <RowNumber> valid Python Code
    Then user navigates to Data Structures-Introduction page

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |

  Scenario Outline: Validate Time Complexity link
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber>
    Then user navigates to Time Complexity link

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |

  Scenario Outline: Validate Try Here button
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber> Tryhere button
    Then user navigates to Try Here button

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |

  Scenario Outline: Validate Try Editor field valid python code
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber> Try Editor field
    Then user navigates to Try Editor field

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
