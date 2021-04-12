#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: Feature to test Lumens login functionality
  I want to use this template for my feature file


  Scenario: To verify USer is able to create account in the Lumens login page
   Given Open the Chrome browser and launch the Lumens Website
   ## When User enters the firstname and lastname
   ## And Enter email id and confirm email id
    ##And Enter the password and confirm password
    ##Then Click on create account 
    And Enter Username and password
    Then click on Login
    