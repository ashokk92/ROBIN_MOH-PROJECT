@Login
Feature: Login feature
  I want to use this template for robin application

  @Valid
  Scenario Outline: Login with the valid credentials
    Given user navigate to the application
    When user enter the <username> and <password>
    And user click on the sign in button
    Then user able to access the application

    Examples: 
      | username      | password                 |
      | administrator | 94L98adiAtmdH2Pcq36NMQ== |
