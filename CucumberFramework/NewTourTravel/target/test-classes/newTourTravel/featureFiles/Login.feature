Feature: Login into account
		Exisiting NewTour user should be able to login into account using correct credentials
		
Scenario: Log into account with correct details
	Given User navigates to NewTour Travel and Tour
	When User clicks on the login button
	Then User should be taken to the successful login page 
