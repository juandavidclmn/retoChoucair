# Autor: Juan C.
@stories
Feature: Utest Challenge
  As a user, I want to register on the Utest page
  @scenario1
  Scenario Outline: Register on the Utest page
    Given than Juan wants to register on the Utest page
    When he enters the information on the Utest page
    |strName  |strLastName  |strEmail  |strCity  |strPassword  |strConfirmPassword  |
    |<strName>|<strLastName>|<strEmail>|<strCity>|<strPassword>|<strConfirmPassword>|
    Then he should show a message of welcome
    |strConfirmRegister  |
    |<strConfirmRegister>|

    Examples:
    |strName  |strLastName  |strEmail            |strCity        |strPassword      |strConfirmPassword  |strConfirmRegister                                                      |
    |Jorge    |Rojas        |ccc.bbc@gmail.com   |Villavicencio  |Juanrojas25**    |Juanrojas25**       |Welcome to the world's largest community of freelance software testers! |