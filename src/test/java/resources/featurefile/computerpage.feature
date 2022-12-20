@regression
Feature: Computer Test
  As user I want to login into nop commerce website


  Scenario: User should navigate to computer page successfully
    Given I am on homepage
    When I click on Computer tab
    Then I should navigate to computer page successfully

  @Sanity
  Scenario: Verify user should navigate to desktop page successfully
    Given I am on homepage
    When I click on Computer tab
    And I click on Desktops link
    Then I should navigate to Desktops page successfully

  Scenario Outline: Verify that user should build you own computer and add them to cart successfully
    Given I am on homepage
    When I click on Computer tab
    And I click on Desktops link
    And I click on product name Build your own computer
    And I select processor "<processor>"
    And I select ram "<ram>"
    And I select hdd "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on add to cart button
    Then I should see product has been added to your shopping cart confirmation message
    Examples:
      | processor                                       | ram           | hdd               | os                      | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2 GB          | 320 GB            | Vista Home [+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium [+$60.00] | Acrobat Reader [+$10.00]   |
      | 2.5 GHz Intel Pentium Dual-Core E2200 [+$15.00] | 8GB [+$60.00] | 320 GB            | Vista Home [+$50.00]    | Total Commander [+$5.00]   |