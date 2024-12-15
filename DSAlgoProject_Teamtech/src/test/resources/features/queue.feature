Feature: DsAlgo queue page functionality

Background: User logged into the DsAlgo 
     Given User navigates to login page
     When User enters username and password and clicks on login button
     Then User is navigated to the homepage


Scenario: Verify if User navigates to QueuePage after login
    When User clicks Get Started of Queue in Home Page.
    Then User should navigate to Queue Page.
###############################Implementation of Queue in Python##################################################
Scenario: Verify if User navigates to Implementation of Queue in Python
    When User clicks on Implementation of Queue in Python  in Queue Page .
    Then User should navigate to Implementation of Queue in Python Page.

Scenario: Verify if User navigates to TryEditor Page from Implementation of Queue in Python
   When User clicks on TryHere link of Implementation of queue page .
   Then User should navigate to TryEditor page to write the python code

Scenario: Validate for Valid Python code in TryEditor Page
    Given user is in queue page
    When user enters valid python code in TryEditorPage
    Then user is able to see the output in result section of TryEditor Page

Scenario: Validate for invalid Python code in TryEditor Page
    
    When user enters invalid python code in TryEditorPage
    Then user will see an error message in PopUp window of TryEditor Page
 ################################Implementation using collection deque######################################   
Scenario: Verify if User navigates to Implementation using collections.deque.
    When User clicks Implementation using collections.deque
    Then User should navigate to Implementation using collections.deque. 
    
 Scenario: Verify if User navigates to TryEditor Page from Implementation using collections.deque.
   When User clicks on TryHere link of Implementation using collections.deque.
   Then User should navigate to TryEditor page to write the python code of Implementation using collections.deque.

Scenario: Validate for Valid Python code in TryEditor Page
    
    When user enters valid python code in TryEditorPage of Implementation using collections.deque.
    Then user is able to see the output in result section of TryEditor Page of Implementation using collections.deque.

Scenario: Validate for invalid Python code in TryEditor Page
    
    When user enters invalid python code in TryEditorPage of Implementation using collections.deque.
    Then user will see an error message in PopUp window of TryEditor Page of Implementation using collections.deque.
    
 #########################################Implementation Using Array#########################################################################
 
 Scenario: Verify if User navigates to implementation Using Array
    When User clicks implementation Using Array
    Then User should navigate to implementation Using Array Page 
    
 Scenario: Verify if User navigates to TryEditor Page from implementation Using Array
   When User clicks on TryHere link of implementation Using Array
   Then User should navigate to TryEditor page to write the python code of implementation Using Array

Scenario: Validate for Valid Python code in TryEditor Page
    
    When user enters valid python code in TryEditorPage of implementation Using Array
    Then user is able to see the output in result section of TryEditor Page of implementation Using Array
    
Scenario: Validate for invalid Python code in TryEditor Page
    
    When user enters invalid python code in TryEditorPage of implementation Using Array
    Then user will see an error message in PopUp window of implementation Using Array

######################################Queue operations##############################################################################

 Scenario: Verify if User navigates to Queue Operations
    When User clicks Queue Operations
    Then User should navigate to Queue Operations 
    
 Scenario: Verify if User navigates to TryEditor Page from Queue Operations
   When User clicks on TryHere link of Queue Operations
   Then User should navigate to TryEditor page to write the python code of Queue Operations

Scenario: Validate for Valid Python code in TryEditor Page
    
    When user enters valid python code in TryEditorPage of Queue Operations
    Then user is able to see the output in result section of TryEditor Page of Queue Operations
    
Scenario: Validate for invalid Python code in TryEditor Page
    
    When user enters invalid python code in TryEditorPage of Queue Operations
    Then user will see an error message in PopUp window of Queue Operations
    
##############################################Practice Questions#####################################################################
 Scenario: Verify if User navigates to Practice Questions
    When User clicks Queue Operations and User clicks Practice Questions 
    Then User should navigate to Practice Questions page
