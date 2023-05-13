@Search
  Feature: The Internet

    Scenario Outline: Login
      When user try to login with valid credential "<credential>"

      Examples:
      |         credential    |
      |       Test@1.com      |
      |       Test@2.com      |
      |       Test@3.com      |









