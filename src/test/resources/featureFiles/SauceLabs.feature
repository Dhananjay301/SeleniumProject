Feature: DemoQA Login Test

  Scenario Outline: Valid login to DemoQA
    Given User is on "<saunceLabPage>" login page
    When User enters username "<username>" in username Section
    And User enters password "<password>" in password section
    And User clicks on "Log in" button
    Then User should be not able to login getting <"errorMsg">
    Examples:
      | saunceLabPage | username | password |
      | https://support.saucelabs.com/s/login/?language=en_US | dhananjayPatil301@gmail.com | DP#909 |