Feature: As a user of Wong Cencosud I want to enter your website to buy an item.

  Scenario: Enter the Wong Cencosud website and buy an item.
    Given that the user wants to buy an item
    When he enters the Wong Cencosud website
    |items               |
    |mani salado manitoba|
    Then he verifies that the purchase was made Maní Salado Manitoba Doypack 200 g
