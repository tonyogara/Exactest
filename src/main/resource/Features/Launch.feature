Feature: Check launching the application works.

	@SmokeTest
  Scenario: Check the application launches successfully and I can select the "Consultancy" page link
    Given I launch the application
    When I select the Consultancy link
    Then I will be on the Consultancy page
