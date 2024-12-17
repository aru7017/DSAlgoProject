Feature: DsAlgo stack feature

Background: User logged into dsAlgo Portal
     Given User navigates to login page from landing Page
     When User enter username and password and clicks on login button
     Then User should navigate to  homepage


Scenario: Verify if User navigates to StackPage after login
    When User clicks Get Started of Stack in Home Page.
    Then User should navigate to Stack Page.
##############################Operations in Stack##################################################
Scenario: Verify if User navigates to Operations in Stack page
    When User clicks on Operations in Stack in Stack Page .
    Then User should navigate to Operations in Stack page

Scenario: Verify if User navigates to TryEditor Page from Operations in Stack page
   When User clicks on TryHere link of Operations in Stack page .
   Then User should navigate to TryEditor page from Operations in Stack Page

Scenario: Validate for Valid Python code in TryEditor Page
    Given user is in stack page
    When user enters valid python code in TryEditorPage from Operations in Stack Page
    Then user is able to see the output in result section of TryEditor Page for Operations in Stack Page

Scenario: Validate for invalid Python code in TryEditor Page
    
    When user enters invalid python code in TryEditorPage for Operations in Stack Page
    Then user will see an error message in PopUp window of TryEditor Page for Operations in Stack Page
    
    ##############################Implementation in Stack##################################################
Scenario: Verify if User navigates to Implementation in Stack page
    When User clicks on Implementation  in Stack Page .
    Then User should navigate to Implementation in Stack page

Scenario: Verify if User navigates to TryEditor Page from Implementation in Stack page
   When User clicks on TryHere link of Implementation in Stack page .
   Then User should navigate to TryEditor page from Implementation in Stack Page

Scenario: Validate for Valid Python code in TryEditor Page from Implementation
    When user enters valid python code in TryEditorPage from Implementation in Stack Page
    Then user is able to see the output in result section of TryEditor Page for Implementation in Stack Page

Scenario: Validate for invalid Python code in TryEditor Page from Implementation
    
    When user enters invalid python code in TryEditorPage for Implementation in Stack Page
    Then user will see an error message in PopUp window of TryEditor Page for Implementation in Stack Page
    
    ##############################Applications in Stack##################################################
Scenario: Verify if User navigates to Applications in Stack page
    When User clicks on Applications  in Stack Page .
    Then User should navigate to Applications in Stack page

Scenario: Verify if User navigates to TryEditor Page from Applications in Stack page
   When User clicks on TryHere link of Applications in Stack page .
   Then User should navigate to TryEditor page from Applications in Stack Page

Scenario: Validate for Valid Python code in TryEditor Page from Applications
    When user enters valid python code in TryEditorPage from Applications in Stack Page
    Then user is able to see the output in result section of TryEditor Page for Applications in Stack Page

Scenario: Validate for invalid Python code in TryEditor Page from Applications
    
    When user enters invalid python code in TryEditorPage for Applications in Stack Page
    Then user will see an error message in PopUp window of TryEditor Page for Applications in Stack Page
    

 #################################### Practice Questions ##############################################
 
 Scenario: Verify if User navigates to Practice Questions of Stack Page
    When User clicks Operations in stack and  clicks on Practice Questions 
    Then User should navigate to Practice Questions page of Stack
  