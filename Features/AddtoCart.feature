Feature: Verifying User able to Add Item into Cart

  Scenario: Login as User
    Given User launch browser
    Then User Launch URL as "https://www.saucedemo.com"
    Then User Enter UserID as "standard_user" and Password as "secret_sauce"
    And User click on Login
    Then User add one Item to Cart
    And Cart badge count is updated
