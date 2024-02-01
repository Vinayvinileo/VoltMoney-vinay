Feature: Verifying User able to Remove an Add Item from Cart

  Scenario: Login as User
    Given User launch browser
    Then User Launch URL as "https://www.saucedemo.com"
    Then User Enter UserID as "standard_user" and Password as "secret_sauce"
    And User click on Login
    Then User add one Item to Cart
    And Click on cart
    Then User click on Checkout
    And User Enter FN as "UserFirstName", LN as "UserLastName", Zipcode as "111111" and click on Continue
    And User navigated to Overview, click on Finish and Checkout will be completed