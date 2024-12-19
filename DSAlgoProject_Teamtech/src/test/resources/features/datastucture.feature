Feature: DsAlgo DataStructure feature

  Scenario Outline: Verify Navigation to Data Structures-Introduction page
   Given user navigates to Home page
   When user enters sheet "<Sheetname>" and <RowNumber>
   Then  user navigates to Data Structures-Introduction page

   Examples: 
     | Sheetname | RowNumber |
     | tryEditor     |         0 |
 
     
     
     

     
     
 # Scenario: Verify Navigation to Data Structures-Introduction page
  #  When user is able to click on get started button in the homepage
  #  Then user navigates to Data Structures-Introduction page 

    
 #  Scenario: Validate Time Complexity link
 #   When user is able to click on get started button in the homepage
  #  Then user navigates to Time Complexity link 

# Scenario: Validate Try Here button
  #  When user is able to click on get started button in the homepage
  #  Then user is able to clicks on tryhere button





 # Scenario Outline: Validate Try Editor field valid python code
  #  Given user navigates to Home page
  #  When user enters sheet "<Sheetname>" and <RowNumber> Try Editor field
  #  Then user navigates to Try Editor field

  #  Examples: 
   #   | Sheetname | RowNumber |
    #  | login     |         0 |
