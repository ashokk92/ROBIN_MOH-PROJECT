@patient
Feature: patient create

  @Valid
  Scenario Outline: create a patient with the valid data
    Given user navigate to the application
    When user enter the <username> and <password>
    And user clicks the sign in button
    And user navigate to PJ and dataentry page
    And user click on the create newvisit button
    And Again user need to click on newpatient button
    And patient form will be available on screen
    And enter the mrn
    And enter the nationalid
    And enter the name
    And enter the middlename
    And enter the surname
    And select the DOB_Age
    And select and click the gender
    And enter the emailid
    And enter the mobilenumber
    And click on the insert patient
    And again select the department in dropdown list
    And select the end type in dropdown list
    And select the visit type in dropdown list
    And enter the clinician name
    Then click on the inservisit button

    Examples: 
      | username      |  | password                 |
      | administrator |  | 94L98adiAtmdH2Pcq36NMQ== |
