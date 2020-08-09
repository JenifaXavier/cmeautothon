Feature:To validate the amazon login

  Scenario Outline: To login to Amazon
    Given The "<url>" has been launched
    Examples:
      | url |
    | https://www.amazon.in/    |