Feature: Login an account in orangehrm.com

  Background: 
    Given User is on the orangehrm.com homepage

  @ValidCredentials
  Scenario: Login with valid credentials
    When User enters the valid username and password
    And User clicks the login button
    Then User sees the login successful message

  @InvalidCredentials
  Scenario Outline: Login with invalid credentials
    When User enters the invalid username "<username>"
    And User enters the invalid password "<password>"
    And User clicks the login button
    Then Login is unsuccessful with error messages

    Examples: 
      | username | password |
      | Admin1   | admin1   |

  #| admin123 | admin    |
  #| Aaddm    | min123   |
  @TimeField
  Scenario: Adding new customer to project info
    When User enters the valid username and password
    And User clicks the login button
    When user selects the time feature
    When user selects the projectinfo category
    When user selects the customer option
    When user clicks the add button
    When user adds the addcustomer name, description, and clicks the save button
    Then user sees the added customer details

  @SelectingOrganization
  Scenario: Adding new Organaization Structure
    When User enters the valid username and password
    And User clicks the login button
    And User clicks admin feature
    And user selects Organization category
    And User selects Structure in organaization category
    And User enables Edit function
    And User clicks Add button
    And User enters unit identification number,name,description
    And user clicks save
    Then User should be able to see structure added sucessfully
    
  #@AddingEmployeeStatus
  #Scenario: Adding Employee Status
    #When User enters the valid username and password
    #And User clicks the login button
    #And User clicks admin feature
    #When User selects Job
    #When User selects Employee Status
    #When User Clicks on Add button
    #When User Enters the Employee Status
    #When User Clicks on Save button
    #Then User Recevices Successfully Saved message
    
    
@Accessingmyinfo
  Scenario: Editing the myinfo data
    When User enters the valid username and password
    And User clicks the login button
    And user clicks the Myinfo category
    And user enters the firstname, lastname, and nickname
    And user enters the employeeid, otherid, Driver's License Number, License Expiry Date, SSN Number, and SIN Number
    And user enters the select the value of Nationality, Marital Status, Date of Birth, and Gender
    And user clicks the save button
    And user selects the blood group
    And user clicks the bloodgroup save button
    Then user is able to see the edited details
    
    