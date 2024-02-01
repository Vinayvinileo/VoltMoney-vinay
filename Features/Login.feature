Feature: Verifying Login into SwagLabs

  Scenario Outline: Login as User
    Given User launch browser
    Then User Launch URL as "https://www.saucedemo.com"
    Then User Enter UserID as "<Username>" and Password as "<Password>"
    And User click on Login
    Then User is displayed with home page "https://www.saucedemo.com/inventory.html"

    Examples:
      | Username                | Password     |
      | standard_user           | secret_sauce |
      | locked_out_user         | secret_sauce |
      | problem_user            | secret_sauce |
      | performance_glitch_user | secret_sauce |
      | error_user              | secret_sauce |
      | visual_user             | secret_sauce |