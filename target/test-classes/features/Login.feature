@Login
 Feature: Validate the Techfios functionality 

Background: 
	Given User is  on the Techfios login page 
	
Scenario Outline: User should able to login with valid credentials 
	When User enters "<userName>" and "<password>"
	When User clicks on signin button  
	Then User should able to land on dashboard page 
 
 Examples:
 |userName         |password|
 |demo@techfios.com|abc123  |
 