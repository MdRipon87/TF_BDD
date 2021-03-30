@AddNewAccount
 Feature: Add new account on bank and cash page 

Background: 
	Given User is  on the Techfios login page   
	
Scenario Outline: User should able to login with valid credentials 
	When User enters "<userName>" and "<password>" 
	When User clicks on signin button   
	Then User should able to land on dashboard page 
	When User clicks on bank and cash 
	When User clicks on new account 
	When User fill up the form entering "<accountTitle>" and "<description>" and "<initialBalance>" and "<accountNumber>" and "<contactPerson>" and "<phone>"  
	Then User clicks on submit button
	
	Examples:
	|userName         |password  |accountTitle|description        |initialBalance|accountNumber|contactPerson|phone |
	|demo@techfios.com|abc123    | NewMoney   |My personal Account|$500          | 450631      |Md Ripon     |646500|