@countries
Feature:"System should allow to read all countries info using api end point "https://www.gmibank.com/api/tp-countries"

  Scenario Outline: User create countries and read and validate them from data set
    Given user goes to API end point "https://www.gmibank.com/api/tp-countries" and create countries "<country>"
    Then user validate countries from data set
    Examples:
      | country    |
      | Wonderland |
      | New World  |
      | Nuevo Mundo|

