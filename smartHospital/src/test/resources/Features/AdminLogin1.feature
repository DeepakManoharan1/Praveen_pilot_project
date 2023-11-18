Feature: Checking the billing feature

  Background: 
    Given user enters into the Admin portal

  @ValidLogin
  Scenario: User enter a valid credendials
    Given user enters username and password
    And user clicks the login button
    Then Check the login success

  @InvalidLogin
  Scenario: User enter a Invalid credendials
    Given user enters Invalid username and password
    And user clicks enter login button
    Then Check the error message

  @Timeproject
  Scenario: Adding new customer to project info
    Given user enter time module
    And user enters data to the time project module
    Then Check the customers time module

  @MyInfo
  Scenario: Editing the myinfo data
    Given user enters into the my Info module
    And user enters data to the my Info module
    Then Check the myInfo 
    
    
    
  
   
