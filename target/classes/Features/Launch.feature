Feature: Check launching the application.

	@SmokeTest
  Scenario: Check the application launches successfully
    Given I launch the application
    When I select the Consultancy link
    Then I will be on the Consultancy page
