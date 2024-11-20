
@Parallel
Feature: Stack page feature.User is able to navigate to different topics 
in Stack page and subsequently navigate to tryEditor page and see desired output in console for valid python code.
 
  @tag1
  Scenario: User navigates to Operations in Stack page.
  Given User is in Stack Page
  When User clicks in Operations in Stack Page
  Then User should be navigated to Operations in Stack page with title "Operations in Stack"
 


  