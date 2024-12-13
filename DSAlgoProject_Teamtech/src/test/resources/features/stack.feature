Feature: DsAlgo stack feature

Scenario Outline: Verify User navigation to Stack page
    Given user is in Home page
    When user enters sheet "<Sheetname>" and <RowNumber> for valid Python Code
    Then user navigates to Stack page

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
  
  Scenario Outline: Validate Operations in Stack link
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber> for Operations in StackPage
    Then user navigates to Operations in Stack link

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
      
    Scenario Outline: Validate Try here link is working as expected.
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber> for Try hereButton
    Then user navigates to tryEditor page to run Python code

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
 Scenario Outline: Validate for Valid Python code in TryEditor Page
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber> for TryEditorPage
    Then user is able to see the output in result section

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |
  Scenario Outline: Validate for InValid Python code in TryEditor Page
    Given user navigates to Home page
    When user enters sheet "<Sheetname>" and <RowNumber> for TryEditorPage with invalid Python code
    Then user will see an error message in PopUp window.

    Examples: 
      | Sheetname | RowNumber |
      | login     |         0 |

  