Feature: Test Tenant Search kost
  Scenario: As Tenant doing search kost on Tobelo area and choose the 10th list kost and favorite the kost it
    Given Open browser
    And Open website Mamikos
    And User do Login
    And User choose Tenant
    And Tenant located on Login Pages
    When Tenant Enter Phone Number "081533225426"
    When Tenant Enter Password "Qwerty1234"
    And Tenant located on Home Pages Mamikos
    When Tenant do Search
    When Tenant Enter Search Tobelo Area "Tobelo"
    And Tenant located on Page Kost Tobelo
    When Tenant Enter Favorite the Kost Tobelo
    When Tenant Enter Unfavorite the Kost Tobelo